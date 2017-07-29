package set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//实现Map集合输出
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "a");
		m.put(2, "s");
		m.put(3, "d");
		m.put(4, "f");
		//keySet()将Map集合key值返回Set集合形式
		Set<Integer> s=m.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()){
			int i=it.next();
			System.out.println(i+" "+m.get(i));
		}
		
	}

}
