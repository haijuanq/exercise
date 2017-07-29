package day0718;

public class JoinThread extends Thread {
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<100;i++){
			if(i==20){
				JoinThread jt=new JoinThread("join");
				jt.start();
				jt.join();
				
			}
			System.err.println(Thread.currentThread().getName()+" "+i);
			
		}
		new JoinThread("ÐÂÏß³Ì").start();
		System.err.println(Thread.currentThread().getName());
	}
	public  JoinThread(String name ) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<1000;i++){
			
			System.err.println(Thread.currentThread().getName()+" "+i);
			
		}
		
	}
	
	

}
