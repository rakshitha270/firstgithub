package static1;
public class staticDemo {
	static void func(int a) throws Exception{
		System.out.println(10/a);
	}

	public static void main(String[] args) {
		try {
			func(10);
			func(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}