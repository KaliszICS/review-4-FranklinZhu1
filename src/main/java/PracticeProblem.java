import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String n = '5' + in.nextLine();
		System.out.println(Integer.parseInt(n) + 5);
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String n = '4' + in.nextLine() + '3';
		System.out.println(Double.parseDouble(n) + 3.4);
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String b = in.nextLine();
		System.out.println(!Boolean.parseBoolean(b));
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String n = in.nextLine() + '3';
		System.out.println((char) (Integer.parseInt(n) + 2));
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String n = in.nextLine() + '1';
		System.out.println((double) (Integer.parseInt(n)/2));
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String n = '1' + in.nextLine();
		System.out.println((int) Double.parseDouble(n));
	}

}
