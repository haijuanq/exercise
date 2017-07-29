package day0904;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		String  snum=sc.nextLine();
		int num=Integer.parseInt(snum);
		
		String strx =sc.nextLine();
		String [] strxs=strx.split(" ");
		
		String stry =sc.nextLine();
		String [] strxy=stry.split(" ");
		String locat=sc.nextLine();
		String [] locats=locat.split(" ");
	
		String time=sc.nextLine();
		String [] times=time.split(" ");
		
		int [] ilocats={Integer.valueOf(locats[0]),Integer.valueOf(locats[1])};
		int [] itimes={Integer.valueOf(times[0]),Integer.valueOf(times[1])};
		
		int [] ixs=new int[num];
		int [] ixy=new int[num];
		int min=0;
		for (int i=0;i<num;i++){
			ixs[i]=Math.abs(Integer.valueOf(strxs[i]));
			ixy[i]=Math.abs(Integer.valueOf(strxy[i]));
			min=ixs[0]+ixy[0];
			if(ixs[i]+ixy[i]<min){
				min=ixs[i]+ixy[i];
			}
		}
		
		int walk=(Math.abs(ilocats[0])+Math.abs(ilocats[1]))*itimes[0];
		int taxi=min*itimes[0]+	(Math.abs(ilocats[0])+Math.abs(ilocats[1]-min))*itimes[1];
		if(walk>taxi){
			System.out.println(taxi);
		}else{
			System.out.println(walk);
		}
	}
}
