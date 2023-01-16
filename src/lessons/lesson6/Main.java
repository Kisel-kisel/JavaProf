package lessons.lesson6;

    import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {
            int a = 5;
            int[] b = new int[10];

            b[0] = 5;
            b[5] = 3;
            b[9] = 2;
            b[4] = 90;

            System.out.println(Arrays.toString(b));

            System.out.println("Hello world!");

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + b[i];
            }
            System.out.println(sum);

        }
    }

