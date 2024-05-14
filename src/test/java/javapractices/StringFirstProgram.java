package javapractices;

public class StringFirstProgram {

	public static void main(String[] args) {

		// First way by using new keyword
		String track = "Changes";
		String s = new String("Welcome to codemind");

		System.out.println(s);

		System.out.println(s.hashCode());

		String s1 = new String("Welcome to codemind");

		System.out.println(s1.hashCode());

		// By using String literal
		String ss = "Welcome to zest india pvt. ltd";

		System.out.println(ss);

		String ss1 = "Welcome to zest india pvt. ltd";

		System.out.println(ss.hashCode());

		System.out.println(ss1.hashCode());

		// immutability of String
		String str = "Welcome to tcs";

		System.out.println("Before changes " + str);

		String st2 = str.concat(" pune");

		System.out.println("After changes " + str);

		System.out.println(st2);
	}

}
