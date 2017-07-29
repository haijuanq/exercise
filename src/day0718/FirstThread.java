package day0718;

public class FirstThread extends Thread{
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==20){
				new FirstThread().start();
				new FirstThread().start();
				
			}
		}
	}
	
	public void run(){
		for(int i=0;i<10000;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
