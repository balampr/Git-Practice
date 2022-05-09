
public class Sample {

	public static void add(int num, int num2) {
		int a;
		a = num + num2;
		System.out.println(a);

	}

	private void multi(int num, int num1) {
           int m;
           m = num * num1;
           System.out.println(m);
           
	}

	public static void main(String[] args) {

		add(10, 25);
		Sample mu = new Sample();
		mu.multi(5, 7);

	}
}
