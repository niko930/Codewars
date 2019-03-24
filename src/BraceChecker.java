

public class BraceChecker {
	public static void main(String[] args) {
		String str = "(){}[]()";

		boolean b = BraceChecker.isValid(str);
		System.out.println(b);
	}

	public static boolean isValid(String braces) {
		while((braces.indexOf("{}")!=-1) || (braces.indexOf("[]")!=-1) || (braces.indexOf("()")!=-1)) {
			braces=braces.replace("{}", "").replace("[]", "").replace("()", "");
		}
		return "".equals(braces);
	}
}
