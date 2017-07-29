package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable {
	private Socket s;
	//��������ͻ��˷������ݣ��������
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
			//���϶�ȡSocket���е����ݣ�����ӡ������̨
			while((content=br.readLine())!=null){
				System.out.println(content);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
