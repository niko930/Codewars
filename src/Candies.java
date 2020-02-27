public class Candies {


    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int i = 0;
        int num = 1;
        while (candies > 0) {
            if (i == num_people) {
                i = 0;
            }
            if (num > candies) {
                num = candies;
            }
            result[i] += num;
            candies -= num;
            num++;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

        Candies candies = new Candies();
        int[] ints = candies.distributeCandies(7, 4);

    }
}
