package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
//客户端接收来自服务端的数据
public class Client {
	public static void main(String[] args) throws IOException, IOException {
		Socket s=new Socket("127.0.0.1",30000);
		//包装流
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=br.readLine();
		System.out.println("来自服务器的数据："+line);
		br.close();
		s.close();
		
	}
}
