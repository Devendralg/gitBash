package task;

public class C implements A,B {

	public static void main(String[] args) {
		B b = new C();
		A a=(A)b;
	}

}
