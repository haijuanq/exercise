package day0904;

public class Triangle {
	public static void main(String[] args) {
		//i�����Д�
		for(int i=1;i<=4;i++){
			//ݔ��ÿ�еĿո�
			for(int j=1;j<=4-i;j++){
				System.out.print(" ");
			}
			//ݔ��ÿ�е�*
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
