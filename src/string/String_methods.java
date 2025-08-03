package string;

public class String_methods {
	public static void main(String[] args) {
		String s ="hello world";
		String s1 = "HELLO WORLD";
		System.out.println(s1.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(6));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s1));
		System.out.println(s.substring(6));
		System.out.println(s.replace("world","java"));
		System.out.println(s1.contains("world"));

	}

}
