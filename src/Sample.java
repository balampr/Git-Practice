
public class Sample {

	public static void add(int num, int num2) {
		int a;

		a = num + num2;
		System.out.println(a);

	}

	public static void sub(int num, int num2) {
		int s;
		s = num - num2;
		System.out.println(s);

	}

	private void multi(int num, int num1) {
		int m;
		m = num * num1;
		System.out.println(m);

	}

	private void div(int n, int n1) {
		int d;
		d = n / n1;
		System.out.println(d);
	}


	public static void main(String[] args) {

		add(10, 25);
		Sample di = new Sample();
		di.div(350, 10);

		Sample mu = new Sample();
		mu.multi(5, 7);
		sub(80, 50);

	}
}
