package com.deepak.java17coding;

public class SwitchExpressions {

	/* Before Java 17 */
	public static void beforeJava17() {
		int num = 2;
		String result;
		switch (num) {
		case 1:
			result = "one";
			break;
		case 2:
			result = "two";
			break;
		default:
			result = "unknown";
			break;
		}
		System.out.println(result);
	}

	/* Java 17th feature */
	public static String java17() {
		int num = 2;
		return switch (num) {
		case 1 -> "oneeee";
		case 2 -> "twoooo";
		default -> "unknown";
		};
	}

	public static void java17MultipleValue() {
		int num = 2;
		switch (num) {
		case 1 -> System.out.println("One");
		case 2, 3, 4 -> System.out.println("One,two,three");
		default -> System.out.println("Unknown");
		}
		;
	}

	/* block-style switch expressions, you use yield to return a value. */
	public static String yieldReturn(String product) {
		return switch (product) {
		case "Laptop" -> "Electronics";
		case "Shirt" -> {
			System.out.println("Logging category...");
			yield "Apparel"; // yield is used here
		}
		default -> "Misc";
		};
	}

	public static void main(String[] args) {
		beforeJava17();
		System.out.println(java17());
		java17MultipleValue();
		System.out.println(yieldReturn("Shirt"));

	}

}
