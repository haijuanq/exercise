package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
//�ͻ��˽������Է���˵�����
public class Client {
	public static void main(String[] args) throws IOException, IOException {
		Socket s=new Socket("127.0.0.1",30000);
		//��װ��
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=br.readLine();
		System.out.println("���Է����������ݣ�"+line);
		br.close();
		s.close();
		
	}
}
