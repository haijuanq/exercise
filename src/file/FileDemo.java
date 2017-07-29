package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File f=new File("/Users/haijuan/Desktop/test.doc");
		System.out.println(f.createNewFile());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		
		
	}

}
