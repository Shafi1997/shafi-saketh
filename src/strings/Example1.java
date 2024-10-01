package strings;

public class Example1 {

	public static void main(String[] args) {
		String string = " Green wood high school ";
		System.out.println(string.charAt(7));
		System.out.println(string.length());
		System.out.println(string.substring(3));
		System.out.println(string.substring(4, 15));
		System.out.println(string.contains("w"));
		System.out.println(string.equals("Green wood high school"));
		System.out.println(string.isEmpty());
		System.out.println(string.concat(" warangal"));
		System.out.println(string.replace("g", "h"));
		System.out.println(string.equalsIgnoreCase("green wood high school"));
		System.out.println(string.trim());
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.indexOf("g"));
		System.out.println(string.indexOf("g", 15));
	}

}
