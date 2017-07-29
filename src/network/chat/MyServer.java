package network.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * chat实现到功能为简易聊天室，首先运行MyServer,再运行多个MyClient，在client的控制台输入内容
 * 会传输到Server，再由server下发给每个client，实现简单聊天室功能。
 * 数据传输流程：client控制台（BufferedReader bw=new BufferedReader(new InputStreamReader(System.in));输入流）
 * ---client（输出流PrintStream ps=new PrintStream(s.getOutputStream());）
 * --server（输入流br=new BufferedReader(new InputStreamReader(s.getInputStream()));）
 * --每个client（输出流ps = new PrintStream(s.getOutputStream());）
 * @author haijuan
 *
 */
public class MyServer {
	//定义保存Socket的ArrayList
	public static List<Socket> socketList=Collections.synchronizedList(new ArrayList());
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(20000);
		while(true){
			Socket s=ss.accept();
			//将建立连接的socket加入到列表中
			socketList.add(s);
			//启动相应线程为连接成功的客户端服务
			new Thread(new ServerThread(s)).start();
			
		}
		
	}
}
