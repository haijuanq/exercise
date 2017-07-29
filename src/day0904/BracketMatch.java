package day0904;
import java.util.Scanner;
import java.util.Stack;

public class BracketMatch {  
    /** 
     * ����ƥ����㷨�� 
     * @param str �������ַ����� 
     * @return 
     */  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		match(s);
	}
    public static boolean match(String str) {  
        Stack stack = new Stack(); // ����һ��������ŵ�ջ��  
        char[] ca = str.toCharArray(); // ���ַ���תΪ�ַ������Ա���������  
        stack.push(ca[0]); // ���Ƚ���һ���ַ�ѹ��ջ�С�  
        /* 
         * �ӵڶ����ַ���ʼ��������ջ���ַ�ƥ�䡣 
         * �ɹ���ջ��Ԫ�ص����� 
         * ʧ�����ַ������еĵ�ǰ�ַ�ѹ��ջ�С� 
         */  
        for (int index = 1; index < ca.length; ++index) {  
            Character c1 = (Character) stack.peek();  
            Character c2 = ca[index];  
            if ((c1.equals('(') && c2.equals(')'))  
                    || (c1.equals('[') && c2.equals(']'))) {  
                stack.pop();  
                System.out.println("True");
            } else {  
                stack.push(c2);
                
            }  
        }  
        return stack.empty();  
    }  
}  