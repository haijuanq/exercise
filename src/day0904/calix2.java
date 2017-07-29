package day0904;

import java.util.Scanner;


public class calix2 {
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    String A=sc.next();
		    String B=sc.next();
		        /* Enter your code here. Print output to STDOUT. */
		   int a= A.length();
		   int b=B.length();
		   System.out.println(a+b);
		   if(a>=b){
			   System.out.println("No");
		   }else{
			   System.out.println("Yes");
		   }
		   String newA=A.substring(0, 1).toUpperCase()+A.substring(1);
		   String newB=B.substring(0, 1).toUpperCase()+B.substring(1);
		   System.out.println(newA+" "+newB);
		   
		}


}
