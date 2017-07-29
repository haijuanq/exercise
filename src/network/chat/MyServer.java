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
 * chatʵ�ֵ�����Ϊ���������ң���������MyServer,�����ж��MyClient����client�Ŀ���̨��������
 * �ᴫ�䵽Server������server�·���ÿ��client��ʵ�ּ������ҹ��ܡ�
 * ���ݴ������̣�client����̨��BufferedReader bw=new BufferedReader(new InputStreamReader(System.in));��������
 * ---client�������PrintStream ps=new PrintStream(s.getOutputStream());��
 * --server��������br=new BufferedReader(new InputStreamReader(s.getInputStream()));��
 * --ÿ��client�������ps = new PrintStream(s.getOutputStream());��
 * @author haijuan
 *
 */
public class MyServer {
	//���屣��Socket��ArrayList
	public static List<Socket> socketList=Collections.synchronizedList(new ArrayList());
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(20000);
		while(true){
			Socket s=ss.accept();
			//���������ӵ�socket���뵽�б���
			socketList.add(s);
			//������Ӧ�߳�Ϊ���ӳɹ��Ŀͻ��˷���
			new Thread(new ServerThread(s)).start();
			
		}
		
	}
}
