public class AreSame {

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        boolean comp = AreSame.comp(a, b);
        System.out.print(comp);
    }

    public static boolean comp(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0){
            return true;
        }

        if(a == null || b == null || a.length == 0 || b.length == 0){
            return false;
        }

        int count = 0;
        for(int i=0;i<a.length;i++){
            int c = a[i]*a[i];

            for (int j=0;j<b.length;j++) {
                if(c == b[j]){
                    b[j] = -1;
                    count++;
                }
            }
            if(count >= a.length){
                return true;
            }
        }

        return false;
    }
}
