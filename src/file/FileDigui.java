package file;

import java.io.File;
/**
 * 现在要求输出一个给定目录中的全部文件的路径。 
 * 本程序肯定只能依靠递归的操作完成，因为在一个给定的路径下有可能还是文件夹，那么如 果是文件夹的话则肯定要继续列出，重复判断。
 * @author haijuan
 *
 */

public class FileDigui {
	public static void main(String[] args) {
		File f=new File("/Users/haijuan/Documents/文档/材料/测试工程师简历");
		myList(f);
	}
	public static void myList(File f){
		System.out.println(f);
		while(f.isDirectory()){
			File[]file=f.listFiles();
			for(File file1:file){
				myList(file1);
			}
		}
	}

}
