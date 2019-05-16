public class BitCounting {
    public static void main(String[] args) {
        int num = BitCounting.countBits(854);
        System.out.println(num);

    }

    public static int countBits(int n) {
        int r = 0;        //记录余数
        int count = 0;    //1的次数
        while (n != 0) {
            r = n % 2;
            n = n / 2;
            if (r == 1) {
                count++;
            }
        }
        return count;
    }
}