package day0716;

//����ѭ��while��do while/forʵ�����100����3�ı�����ǰ5����
public class Circle {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.print_while();
	}
	
	//whileѭ��
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
	//do whileѭ��
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
	
	//forѭ��
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
