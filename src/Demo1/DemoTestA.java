package Demo1;

public class DemoTestA {
	public static void main(String[] args) {

		int result1 = add(2, 3, 4, 5);

		System.out.println(result1);

	}

	public static int add(int num1, int num2, int num3, int num4) {
		int result = 0;

		result = num1 + num2 + num3 + num4;

		return result;
	}
}