import java.util.Arrays;
import java.util.stream.IntStream;

public class findEvenIndex {
    public static void main(String[] args) {
        int[] arr = {2824, 1774, -1490, -9084, -9696, 23094};
        int evenIndex = findEvenIndex.findEvenIndex(arr);
        System.out.println(evenIndex);
    }


    public static int findEvenIndex(int[] arr) {
        IntStream stream = Arrays.stream(arr);
        stream.sum();

        int sumRight = Arrays.stream(arr).sum() - arr[0];
        System.out.println(sumRight);

        for(int i=0;i<arr.length;i++){
            int leftNumber = 0;
            int rightNumber = 0;
            for(int j=0;j<i;j++){
                leftNumber += arr[j];
            }

            for(int j=i+1;j<arr.length;j++){
                rightNumber += arr[j];
            }

            if(leftNumber == rightNumber){
                return i;
            }
        }

        return -1;
    }
}
