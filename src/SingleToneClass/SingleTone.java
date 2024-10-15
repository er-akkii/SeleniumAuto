package SingleToneClass;

public class SingleTone {

	private static SingleTone var = null;
	private static SingleTone var1 = null;

	private SingleTone() {
		System.out.println("u are");
	}

	private SingleTone(int x) {
		System.out.println(" hii");
	}

	public static SingleTone getObject() {

		if (var == null) {
			var = new SingleTone();
			System.out.println("m");
		}
		return var;
	}

	public static SingleTone getObject1(int x) {

		if (var1 == null) {
			var1 = new SingleTone(x);
			System.out.println("j");

		}
		return var1;
	}

	public static void main(String[] args) {

		System.out.println(SingleTone.getObject());
		System.out.println(SingleTone.getObject());
		System.out.println(SingleTone.getObject1(1));
		System.out.println(SingleTone.getObject1(1));

	}

}
