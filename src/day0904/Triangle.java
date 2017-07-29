package day0904;

public class Triangle {
	public static void main(String[] args) {
		//i控制行數
		for(int i=1;i<=4;i++){
			//輸出每行的空格
			for(int j=1;j<=4-i;j++){
				System.out.print(" ");
			}
			//輸出每行的*
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
