package network.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) throws Exception, Exception {
		Socket s=new Socket("127.0.0.1",20000);
		//���߳�ȥ����ÿ���ͻ���socket
		new Thread(new ClientThread(s)).start();
		//�ͻ��˻��䵱��������������ݵ���ɫ,����������
		PrintStream ps=new PrintStream(s.getOutputStream());
		String line=null;
		//���ϴӼ�������
		BufferedReader bw=new BufferedReader(new InputStreamReader(System.in));
		while((line=bw.readLine())!=null){
			//���Ӽ�����������ݴ��뵽Socket��Ӧ�������
			ps.println(line);
		}
	}
	

}
