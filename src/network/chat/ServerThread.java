package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
//服务器端到线程类
public class ServerThread implements Runnable {
	//定义当前线程所处理的Socket
	Socket s=null;
	//服务器读取客户端数据用到的流
	BufferedReader br=null;
	public ServerThread(Socket s) throws Exception{
		this.s=s;
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String content=null;
		while((content=readFromClient())!=null){
			//遍历list中的每个socket，并将读到到内容向每个客户端发送一次
			for(Socket s:MyServer.socketList){
				PrintStream ps;
				try {
					ps = new PrintStream(s.getOutputStream());
					ps.println(content);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	//定义读取客户端数据的方法
	private String readFromClient(){
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
