package day0904;

import java.util.Scanner;
import java.util.Stack;
/*
 * ��ʮ����ת��Ϊ�����ƣ���������0��1ȡ�����ٽ��ö�����תΪʮ����
 */

public class calix1 {
	
	static int getInterComplement(int n){
		String str="";
		//����ջ���Ƚ����
		Stack s=new Stack();
		while(n!=0){
			s.push(n%2);//��Ҫת���������Զ�ȡ�࣬����ջ��
			n=n/2;//��Ҫת����������2��ȡ�̣�ֱ����Ϊ0���˳�ѭ��
		}
		while(!s.empty()){
			String s1="";
			int i=(int)s.pop();//����ȡ��ջ�е����ݣ���ת��Ϊint
			if(i==0){
				s1=1+",";//��ȡ����intת��Ϊ�ַ��������Զ��ŷָ�
			}else{
				s1=0+",";
			}
			//System.out.println(s.pop().getClass());class java.lang.Integer
			str+=s1;//��ʱstr��Ϊת��Ϊȡ���Ķ������ַ�������ʽ�����Զ��ŷָ�
		}
		//���ַ���ת��Ϊ�ַ�������
		String [] strs=str.split(",");
		//�����ַ�������,��������ת��Ϊʮ����
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
