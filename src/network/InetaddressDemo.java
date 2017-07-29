package network;

import java.net.InetAddress;

public class InetaddressDemo {
	public static void main(String[] args) throws Exception {
		//InetAddress getLocalHost():返回本地主机。
		InetAddress i=InetAddress.getLocalHost();
		System.out.println(i);
		//InetAddress getByName(String host):在给定主机名的情况下确定主机的 ip 地址。
		i=InetAddress.getByName("www.baidu.com");
		System.out.println(i);
		System.out.println(i.getHostAddress());
		System.out.println(i.getHostName());
	}

}
