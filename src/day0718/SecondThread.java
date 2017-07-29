package day0718;

public class SecondThread implements Runnable {
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			System.err.println(Thread.currentThread().getName()+" "+i);
			if(i==20){
				SecondThread st=new SecondThread();
				new Thread(st,"线程1").start();;
				new Thread(st,"线程2").start();;
				
			}
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<1000;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}

}
