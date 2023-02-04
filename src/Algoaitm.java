import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Algoaitm {
    public static void main(String[] args) {
        Random random = new Random();
//        int num1 = random.nextInt();
//        int num2 = random.nextInt();
//        int num3 = random.nextInt();
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        int sum = num1 + num2 + num3;
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int sum = num1 + num2 + num3;
//        System.out.println(sum);

        int[] arr = new int[7];
        arr[0] = 3;
        arr[1] = 6;
        arr[2] = 4;
        arr[3] = 7;
        arr[4] = 2;
        arr[5] = 1;
        arr[6] = 9;

//            Task 1
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 6) {
                System.out.println("Yes, it is index: " + i + ".");
            }
        }



//           Task 2
    int sum = 0;
        for(
    int i = 0;
    i<arr.length;i++)

    {
//            System.out.println(arr[i]*arr[i]);
        sum += arr[i] * arr[i];

    }
        System.out.println(sum);


}

}
