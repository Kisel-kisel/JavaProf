package lessons;

import java.util.Arrays;

public class RecursMain {
    public static void main(String[] args) {
        int[] recurs = {4, 56, 76, 54, 45, 567, 56, 43, 667, 533};
        System.out.println(Arrays.toString(recurs));
        System.out.println(recurs.length);
        int resualt = arr(recurs,0);
        System.out.println(resualt);
    }

    public static int arr(int[] array, int index) {
        int sum = 0;
        if (index >= array.length) {
            return sum;
        } else  {
            sum = sum + array[index];
            index++;
            arr(array, index);
        }
        return 0;
    }

}
