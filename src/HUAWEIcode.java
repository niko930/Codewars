import java.util.Scanner;

public class HUAWEIcode {
    public static void main(String[] args) {
        int t = 1;
        int value = 3;
        int index = value;
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        int count = i - t;
        while(count > 0){
            if(value == 1){
                value = index*2;
                index = value;
            }
            count--;
            value--;
        }

        System.out.println(value);
    }
}
