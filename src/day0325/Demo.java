package day0325;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        String slen =sc.nextLine();
        int len =Integer.parseInt(slen);
        String con=sc.nextLine();
            String [] strs=con.split(" ");
            int [] nums=new int[len];
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<len;i++){
                for(String str :strs){
                 nums[i]=Integer.parseInt(strs[i]);
                 int first =nums[0];         
                 int last = 0;
                 if(first==nums[i]){
                     last=nums[i];
                 }else{
                     first=nums[i];
                 }
                 sb.append(last+" ");
                }       
            }
       
    }
}





