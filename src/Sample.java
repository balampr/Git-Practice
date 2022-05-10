
public class Sample {

	public static void add(int num, int num2) {
		int s;
		 s = num + num2;
		 System.out.println(s);

	}
	private void div(int n,int n1) {
		int d;
		d=n/n1;
		System.out.println(d);

	}

	public static void main(String[] args) {
		
		add(10, 25);
		Sample di = new Sample();
		di.div(350, 10);
		
	}
}
