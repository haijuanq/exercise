package set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//ʵ��Map�������
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "a");
		m.put(2, "s");
		m.put(3, "d");
		m.put(4, "f");
		//keySet()��Map����keyֵ����Set������ʽ
		Set<Integer> s=m.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()){
			int i=it.next();
			System.out.println(i+" "+m.get(i));
		}
		
	}

}
