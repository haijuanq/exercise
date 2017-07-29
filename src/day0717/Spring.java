package day0717;

public enum Spring implements Parent {
	//3)枚举类可以实现一个接口或多个，关键是不同的枚举值可以分别重写接口里同一方法，达到了不同枚举值在调用该方法时，具有不同的行为方式，
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
	//(4)当枚举类类中含有抽象方法时，每个枚举值都要对抽象方法进行实现
	public abstract void test();

}
