package file;

import java.util.Scanner;
/**
 *����һ���������������һ�������Ƚ϶����Ƿ���ȣ�ʵ�ֶ�αȽϿ���ʹ��forѭ��
 * @author haijuan
 *
 */

public class RandomGame {
	public static void main(String[] args) {
		guess2();
	}
	
	//���ַ���ʵ��
	public static void guess1(){
		Integer i=(int) ((Math.random())*100);
		System.out.println(i);
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<10;x++){
			//forѭ���е�һ��Ϊ�Ӽ�������
			int s=sc.nextInt();
			//y��ʾ�������������ת��ΪInteger�ź��бȽϵķ���
			Integer y=new Integer(s);
			switch(y.compareTo(i)){
			case 1:
				System.out.println("�������ֹ�������������");
				break;
			case -1:
				System.out.println("��������ֹ�С������������");
				break;
			default:
				System.out.println("�������������ƥ��");
				return;
			
			
			}
			
			}
		}
	public static void guess2(){
		int x=(int)((Math.random())*100);
		System.out.println(x);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++){
			int y=sc.nextInt();
			if(y==x){
				System.out.println("�������������ƥ��");
				return;
			}else if(y>x){
				System.out.println("�������ֹ�������������");
			}
			else{
				System.out.println("��������ֹ�С������������");
			}
			
		}
	}
}


