
public class regexTest {
	public static void main(String[] args) {
		String regex = "^(\\-)?+([1-9][0-9]*)+(\\.[0-9]{1,2})?$";
		
		String regex2 = "^(\\+)+\\d$";
		
		String test = "+2"; 
		
		boolean b = test.matches(regex2);
		
		System.out.println(b);
	}
}
