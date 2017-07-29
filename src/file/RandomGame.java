package file;

import java.util.Scanner;
/**
 *生成一随机数，键盘输入一个数，比较二者是否相等，实现多次比较可以使用for循环
 * @author haijuan
 *
 */

public class RandomGame {
	public static void main(String[] args) {
		guess2();
	}
	
	//两种方法实现
	public static void guess1(){
		Integer i=(int) ((Math.random())*100);
		System.out.println(i);
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<10;x++){
			//for循环中第一句为从键盘输入
			int s=sc.nextInt();
			//y表示输入的数，必须转换为Integer才含有比较的方法
			Integer y=new Integer(s);
			switch(y.compareTo(i)){
			case 1:
				System.out.println("输入数字过大，请重新输入");
				break;
			case -1:
				System.out.println("输入的数字过小，请重新输入");
				break;
			default:
				System.out.println("输入的数字正好匹配");
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
				System.out.println("输入的数字正好匹配");
				return;
			}else if(y>x){
				System.out.println("输入数字过大，请重新输入");
			}
			else{
				System.out.println("输入的数字过小，请重新输入");
			}
			
		}
	}
}


