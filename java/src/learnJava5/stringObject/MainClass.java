package learnJava5.stringObject;

public class MainClass {
	public static void main(String[] args) {
		String str1 = "Hello";
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer("Hello");
		System.out.println(str2);
		str2.append(" World!");
		System.out.println(str2);
		System.out.println("str2.length() : " + str2.length());
		str2.insert(str2.length(), " My name is tonic");
		System.out.println(str2);
		str2.delete(6, 13);
		System.out.println(str2);
	}
}
