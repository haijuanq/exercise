package fanxing;

public class PointDemo {
	public static void main(String[] args) {
		Point<String>p=new Point<>();
		p.setT1("2");
		p.setT2("3");
		System.out.println(p.getT1());
		System.out.println(p.getT2());
	}

}
/**
 * �����ࣺ����һ��ռλ����������ȷ��ʾ������ʲô���ͣ���ʵ�����õ�ʱ���ȷ���� ��!
 * @author haijuan
 *
 * @param <T>
 */
class Point<T>{
	private T t1;
	private T t2;
	public T getT1() {
		return t1;
	}
	public void setT1(T t1) {
		this.t1 = t1;
	}
	public T getT2() {
		return t2;
	}
	public void setT2(T t2) {
		this.t2 = t2;
	}
	
}
