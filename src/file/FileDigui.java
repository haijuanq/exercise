package file;

import java.io.File;
/**
 * ����Ҫ�����һ������Ŀ¼�е�ȫ���ļ���·���� 
 * ������϶�ֻ�������ݹ�Ĳ�����ɣ���Ϊ��һ��������·�����п��ܻ����ļ��У���ô�� �����ļ��еĻ���϶�Ҫ�����г����ظ��жϡ�
 * @author haijuan
 *
 */

public class FileDigui {
	public static void main(String[] args) {
		File f=new File("/Users/haijuan/Documents/�ĵ�/����/���Թ���ʦ����");
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
