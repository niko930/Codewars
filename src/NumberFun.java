public class NumberFun {
    public static void main(String[] args) {
        long nextSquare = NumberFun.findNextSquare(100L);
    }

    public static long findNextSquare(long sq) {
        return  ((long) Math.sqrt(sq)) + 0.0 == Math.sqrt(sq) ? (long)Math.pow(Math.sqrt(sq)+1,2) : -1;
    }
}
