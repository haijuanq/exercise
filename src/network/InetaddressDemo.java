package network;

import java.net.InetAddress;

public class InetaddressDemo {
	public static void main(String[] args) throws Exception {
		//InetAddress getLocalHost():���ر���������
		InetAddress i=InetAddress.getLocalHost();
		System.out.println(i);
		//InetAddress getByName(String host):�ڸ����������������ȷ�������� ip ��ַ��
		i=InetAddress.getByName("www.baidu.com");
		System.out.println(i);
		System.out.println(i.getHostAddress());
		System.out.println(i.getHostName());
	}

}
