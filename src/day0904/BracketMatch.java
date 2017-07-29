package day0904;
import java.util.Scanner;
import java.util.Stack;

public class BracketMatch {  
    /** 
     * 进行匹配的算法。 
     * @param str 待检查的字符串。 
     * @return 
     */  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		match(s);
	}
    public static boolean match(String str) {  
        Stack stack = new Stack(); // 定义一个存放括号的栈。  
        char[] ca = str.toCharArray(); // 将字符串转为字符数组以便对其遍历。  
        stack.push(ca[0]); // 首先将第一个字符压入栈中。  
        /* 
         * 从第二个字符开始，依次与栈中字符匹配。 
         * 成功则将栈顶元素弹出。 
         * 失败则将字符数组中的当前字符压入栈中。 
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