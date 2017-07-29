package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable {
	private Socket s;
	//服务器向客户端发送数据，用输出流
	BufferedReader br=null;
	 public ClientThread(Socket s) throws Exception {
		// TODO Auto-generated constructor stub
		 this.s=s;
		 br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String content=null;
		try {
			//不断读取Socket流中的内容，并打印到控制台
			while((content=br.readLine())!=null){
				System.out.println(content);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
