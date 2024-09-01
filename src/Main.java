import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Task 2");
        //Task 2
        int[] arr2 = {10, 20, 30, 40, 50};
        int min = 2_147_438_647;
        int max = -2_147_438_648;
        for (int i : arr2) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println("Task 3");
        //Task 3
        double[] arr3 = {12, 15, 4, 11, 9};
        double all = 0;
        for (double i : arr3) {
            all += i;
        }
        all /= 5;
        System.out.println("Средняя сумма трат за месяц составила " + all + " рублей");
        System.out.println("Task 4");
        //Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}