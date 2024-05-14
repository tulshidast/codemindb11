package javapractices;

public class StringClassMethods {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		// charAt()
		char c = s.charAt(8);
		System.out.println(c);
		System.out.println(s.charAt(17));

		System.out.println("##################################");

		// concat
		String str = s.concat(" technology");
		System.out.println(str);
		System.out.println(s.concat(" pune"));

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// compareTo

		// if result is -ve integer so your second String large
		System.out.println(s.compareTo("amazon.com"));

		// if result is positive integer then first String is large
		System.out.println(s.compareTo("Welcome to amazon india pvt ltd"));

		// if result is 0, it means both are String are same.
		System.out.println(s.compareTo("Welcome to codemind"));

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		// contains
		System.out.println(s.contains("come"));

		System.out.println(s.contains("zest"));

		System.out.println(s.contains("come to cod"));

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		// endsWith
		System.out.println(s.endsWith("codemind"));
		System.out.println(s.endsWith("code"));

		System.out.println(s.endsWith(" to codemind"));

		System.out.println(s.endsWith("emind"));

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		// equals
		System.out.println(s.equals("codemind"));
		System.out.println(s.equals("Welcome to codemind"));
		System.out.println(s.equals("WELCOME to Codemind"));

		System.out.println("###########################################");

		// equalsIgnoreCase
		System.out.println(s.equalsIgnoreCase("WELCOME to Codemind"));
		System.out.println(s.equalsIgnoreCase("Welcome to codemind"));
		System.out.println(s.equalsIgnoreCase("Welcome to cod"));

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		// indexOf
		System.out.println(s.indexOf('c'));

		System.out.println(s.indexOf(99));

		System.out.println(s.indexOf("cod"));

		System.out.println(s.indexOf('o', 5));

		System.out.println(s.indexOf("co", 8));

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		// lastIndexOf
		// "Welcome to codemind"
		System.out.println(s.lastIndexOf('o'));

		System.out.println(s.lastIndexOf("co"));

		System.out.println(s.lastIndexOf('m', 9));

		System.out.println(s.lastIndexOf("co", 14));

		System.out.println("*****************************************");

		// isEmpty
		System.out.println(s.isEmpty());

		System.out.println("".isEmpty());

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		// length
		System.out.println(s.length());

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		// trim
		String ss = "  welcome to   java class   ";
		System.out.println(ss);
		System.out.println(ss.trim());

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		// toUpperCase
		System.out.println(s.toUpperCase());

		// toLowerCase
		System.out.println(s.toLowerCase());

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// toCharArray
		char array[] = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

		System.out.println();
		System.out.println("#######################################");
		// Welcome to codemind

		System.out.println(s.substring(8));

		System.out.println(s.substring(3, 7));
		System.out.println(s.substring(11, 15));

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// startsWith
		System.out.println(s.startsWith("Welcome "));
		System.out.println(s.startsWith("come "));

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		// split
		String a[] = s.split(" ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		a = s.split("to");
		for (String str1 : a) {
			System.out.println(str1);
		}

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		// Welcome to codemind

		// replace
		System.out.println(s.replace('o', 'O'));
		System.out.println(s.replace("co", "CO"));

		System.out.println(s.replaceFirst("co", "DO"));

		System.out.println(s.replaceAll("co", "PO"));
	}

}
