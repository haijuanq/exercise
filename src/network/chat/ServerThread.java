package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
//�������˵��߳���
public class ServerThread implements Runnable {
	//���嵱ǰ�߳��������Socket
	Socket s=null;
	//��������ȡ�ͻ��������õ�����
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
			//����list�е�ÿ��socket������������������ÿ���ͻ��˷���һ��
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
	//�����ȡ�ͻ������ݵķ���
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
