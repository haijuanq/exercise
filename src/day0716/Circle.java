package day0716;

//三种循环while／do while/for实现输出100以内3的倍数的前5个数
public class Circle {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.print_while();
	}
	
	//while循环
	public void print_while(){
		int i=1;
		int k=1;
		while(i<100){
			if(i%3==0){
				if(k<=5){
					System.out.println(i);
					k++;
				}
			}
			i++;
			
		}
	}
	//do while循环
	public void print_do_while(){
		int i=1;
		int k=1;
		do{
			if(i%3==0){
				if(k<=5){
					k++;
					System.out.println(i);
				}
			}
			i++;
		
		}
		while(i<100);
	}
	
	//for循环
	public void print_for(){
		int k=1;
		for(int i=1;i<100;i++){
			if(i%3==0&k<=5){
				k+=1;
				System.out.println(i);
			}
		}
	}

}
