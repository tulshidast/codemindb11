package javapractices;

public class StringMutableClasses {

	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer("Welcome to codemind");

		System.out.println(stringBuffer);

		stringBuffer.append(" technology pune");

		System.out.println(stringBuffer);

		System.out.println(stringBuffer.reverse());

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		StringBuilder stringBuilder = new StringBuilder("Welcome to zest india pvt ltd");

		System.out.println(stringBuilder);

		stringBuilder.append(" pune.");

		System.out.println(stringBuilder);
		
		System.out.println(stringBuilder.reverse());
		
		String s="Welcome";
		
		StringBuffer sb = new StringBuffer();
		sb.append(s);

	}

}
