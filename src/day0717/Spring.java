package day0717;

public enum Spring implements Parent {
	//3)ö�������ʵ��һ���ӿڻ������ؼ��ǲ�ͬ��ö��ֵ���Էֱ���д�ӿ���ͬһ�������ﵽ�˲�ͬö��ֵ�ڵ��ø÷���ʱ�����в�ͬ����Ϊ��ʽ��
	A{
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	},
	B{
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	},
	C{
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
	};

	

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	//(4)��ö�������к��г��󷽷�ʱ��ÿ��ö��ֵ��Ҫ�Գ��󷽷�����ʵ��
	public abstract void test();

}
