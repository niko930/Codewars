public class DescendingOrder {
	public static void main(String[] args) {
		int i = DescendingOrder.sortDesc(123455347);
		System.out.print(i);
	}
	private static int sortDesc(final int num) {
		
		String str = String.valueOf(num);
		int[] a = new int[str.length()];
		
		for(int i=0;i<str.length();i++) {
			a[i] = Integer.valueOf(String.valueOf(str.charAt(i)));
		}
		
		
		for(int i=0;i<str.length()-1;i++) {
			for(int j=0;j<str.length()-1-i;j++) {
				if(a[j] <= a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<a.length;i++) sb.append(a[i]);
		
		return Integer.valueOf(sb.toString());
	}
}
