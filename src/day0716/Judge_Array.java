package day0716;

import java.util.Arrays;

public class Judge_Array {
	
	public static void main(String[] args) {
		
		Judge_Array ja=new Judge_Array();
		ja.maxArray(new int[]{1,3,7,4,8});
	}
	//�жϸ����������Ƿ����ظ�Ԫ��
	 public boolean judgereapt(String[] a){
		 for(int i=0;i<a.length-1;i++){
			 for(int j=i+1;j<a.length;j++){
				 if(a[i]==a[j]){
					 return true;
				 }
			 }
		 }
		 return false;
		 
	 }
	 //�����������(ð������)
	 public void maxArray(int[] it){
		 for(int i=0;i<it.length-1;i++){
			 for(int j=i+1;j<it.length;j++){
				 if(it[i]<it[j]){
					int temp=it[i];
					 it[i]=it[j];
					 it[j]=temp;
				 }
			 }
		 }
		 
		 //������Arrays�еķ���ָ��������ַ�����ʽ��
		 System.out.println(Arrays.toString(it));
		/*�����������������е�ÿһ��Ԫ��
		 for(int i:it){
			 
			 System.out.println(i);
		 }
		 */
		 /*
		  * 
		 return it;���ص���ָ�����������ã�����ַ
		  */
	 }

}
