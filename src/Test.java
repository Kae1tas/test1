import java.util.Arrays;
import java.util.Scanner;

public class Test {
    // номер 1
    public static boolean sum(int a, int b) {
        return !(a + b > 20 | a + b < 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sum(sc.nextInt(), sc.nextInt()));

       // номер 2
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            if (i - 1 >= 0) {
                arr[i] = arr[i-1] + 3;
            }
        }
        System.out.println(Arrays.toString(arr));

        // номер 3
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
