package network.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) throws Exception, Exception {
		Socket s=new Socket("127.0.0.1",20000);
		//用线程去管理每个客户端socket
		new Thread(new ClientThread(s)).start();
		//客户端还充当向服务器发送数据到角色,定义该输出流
		PrintStream ps=new PrintStream(s.getOutputStream());
		String line=null;
		//不断从键盘输入
		BufferedReader bw=new BufferedReader(new InputStreamReader(System.in));
		while((line=bw.readLine())!=null){
			//将从键盘输入的内容传入到Socket对应到输出流
			ps.println(line);
		}
	}
	

}
