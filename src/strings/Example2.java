package strings;

public class Example2 {
	public static void main(String[] args) {
		String string = " hyderbad ";
		System.out.println(string.charAt(7));
		System.out.println(string.length());
		System.out.println(string.substring(3));
		System.out.println(string.substring(4, 7));
		System.out.println(string.contains("w"));
		System.out.println(string.equals("telengana"));
		System.out.println(string.isEmpty());
		System.out.println(string.concat(" warangal"));
		System.out.println(string.replace("g", "h"));
		System.out.println(string.equalsIgnoreCase("hyderbad"));
		System.out.println(string.trim());
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.indexOf("d"));
		System.out.println(string.indexOf("d", 4));
	}

}
