package day0904;


public class Demo223 {
	
	public static void main(String[] args) {
	
		String [] coordinates={"","",""};
		
		for (int i=0;i<coordinates.length;i++){
			String[] s1s=coordinates[i].split(",");
			String s1=s1s[0].substring(1,s1s[0].length());
			String s2=s1s[0].substring(0, s1s[0].length());
			
			double d1=Double.parseDouble(s1);
			double d2=Double.parseDouble(s2);
			
			if(d1<=90&&d1>=-90&&d2>=-180&&d2<=180){
				System.out.println("Vaild");
			}else{
				System.out.println("Invaild");
			}
		}
				
	}

}
