package com.vf.apex.editor.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Helper {

	public static void copyDirectory(File sourceLocation , File targetLocation) throws IOException {
		if(sourceLocation.equals(targetLocation)){
			System.out.println("Skipped copying files.. ");
			return; // is source and target Locations are same then skip copying files 
		}
		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}

			String[] children = sourceLocation.list();
			for (int i=0; i<children.length; i++) {
				copyDirectory(new File(sourceLocation, children[i]), new File(targetLocation, children[i]));
			}
		} else {
			if((sourceLocation.lastModified() != targetLocation.lastModified()) && (sourceLocation.length() != targetLocation.length())){
				System.out.println("File copied : " + sourceLocation.getCanonicalPath());
				InputStream in = new FileInputStream(sourceLocation);
				OutputStream out = new FileOutputStream(targetLocation);
				
				// Copy the bits from instream to outstream
				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				in.close();
				out.close();	    		
			}else{
				//System.out.println("File Skipped because same: " + sourceLocation.getCanonicalPath());
			}
		}
	}
}