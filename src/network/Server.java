package network;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
//服务器端往客户端发送数据
public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(30000);
		while(true){
			Socket s=ss.accept();
			
			PrintStream ps=new PrintStream(s.getOutputStream());
			ps.println("你好，你收到了服务器的新年祝福");
			ps.close();
			s.close();
		}
	}
}
