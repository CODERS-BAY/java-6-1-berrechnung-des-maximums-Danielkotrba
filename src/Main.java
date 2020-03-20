import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a few numbers!  Enter q to quit:");
        Scanner scan = new Scanner(System.in);

        int[] number = new int[0];

        while (!scan.hasNext("q") && !scan.hasNext("Q")) {
            int value = scan.nextInt();
            int[] array = new int[number.length + 1];
            for (int i = 0; i < number.length;i++) {
                array[i] = number[i];

            }
            array[number.length] = value;
            number = array;
            System.out.println(value);
        }
        System.out.println(number.length);

        int biggestNumber = Integer.MIN_VALUE;
        for (int i = 0;i < number.length; i++) {
            if (biggestNumber < number[i]) {
                biggestNumber = number[i];
            }
        }

        System.out.println(biggestNumber);

    }
}
