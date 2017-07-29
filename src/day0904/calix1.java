package day0904;

import java.util.Scanner;
import java.util.Stack;
/*
 * 将十进制转化为二进制，将二进制0、1取反，再将该二进制转为十进制
 */

public class calix1 {
	
	static int getInterComplement(int n){
		String str="";
		//定义栈，先进后出
		Stack s=new Stack();
		while(n!=0){
			s.push(n%2);//将要转化的数除以二取余，放入栈中
			n=n/2;//将要转化的数除以2，取商，直到商为0，退出循环
		}
		while(!s.empty()){
			String s1="";
			int i=(int)s.pop();//挨个取出栈中的数据，并转化为int
			if(i==0){
				s1=1+",";//将取出的int转化为字符串，并以逗号分隔
			}else{
				s1=0+",";
			}
			//System.out.println(s.pop().getClass());class java.lang.Integer
			str+=s1;//此时str已为转化为取反的二进制字符串的形式，并以逗号分隔
		}
		//将字符串转化为字符串数组
		String [] strs=str.split(",");
		//遍历字符串数组,将二进制转化为十进制
		int result=0;
		for(int j=0;j<strs.length;j++){
			int a=Integer.parseInt(strs[j]);
			result+=a*Math.pow(2, strs.length-j-1);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res;
		int _n;
		_n=Integer.parseInt(sc.nextLine());
		
		res=getInterComplement(_n);
		System.out.println(res);
		
	}

}
