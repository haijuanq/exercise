package day0716;

public class Multiplication {
	public static void main(String[] args) {
		Multiplication m=new Multiplication();
		m.M_table();
	}
	//��forѭ����ӡ���˷��ھ���
	
	public void M_table(){
		//j*i
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"  ");
			}
			System.out.println("\n");
		}
	}

}
