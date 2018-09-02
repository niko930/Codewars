public class NextBigger {

    public static long nextBiggerNumber(long n){
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            for(int j=0;j<chars.length-i-1;j++){
                if(Integer.valueOf(chars[j]) < Integer.valueOf(chars[j+1])){
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }

        System.out.println(s);
        return n;
    }


    public static void main(String[] args) {
        long a = 1928553615L;

        long l = NextBigger.nextBiggerNumber(a);

        System.out.print(l);
    }
}
