
public class Sample {

	public static void add(int num, int num2) {
		int a;
		 a = num + num2;
		 System.out.println(a);

	}
	public static void sub(int num,int num2) {
		int s;
		s =num-num2;
		System.out.println(s);
	}
	
	private void modul(int n,int n1) {
		int mo = n%n1;
		System.out.println(mo);

	}

	public static void main(String[] args) {
		
		add(10, 25);
		sub(80, 45);
		Sample mod = new Sample();
		mod.modul(3035,4);
	}
}
