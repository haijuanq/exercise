package day0716;

import java.util.Arrays;

public class Judge_Array {
	
	public static void main(String[] args) {
		
		Judge_Array ja=new Judge_Array();
		ja.maxArray(new int[]{1,3,7,4,8});
	}
	//判断给定的数组是否有重复元素
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
	 //数组进行排序(冒泡排序)
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
		 
		 //工具类Arrays中的返回指定数组的字符串形式。
		 System.out.println(Arrays.toString(it));
		/*遍历输出排序后数组中的每一个元素
		 for(int i:it){
			 
			 System.out.println(i);
		 }
		 */
		 /*
		  * 
		 return it;返回的是指向该数组的引用，即地址
		  */
	 }

}
