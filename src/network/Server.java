package network;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
//�����������ͻ��˷�������
public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(30000);
		while(true){
			Socket s=ss.accept();
			
			PrintStream ps=new PrintStream(s.getOutputStream());
			ps.println("��ã����յ��˷�����������ף��");
			ps.close();
			s.close();
		}
	}
}
