import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

        int firstVal;
        int secondVal;
        int thirdVal;
        int min;
        int max;
        double average;

        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        firstVal = scanner.nextInt();
        System.out.print("Введите второе число: ");
        secondVal = scanner.nextInt();
        System.out.print("Введите третье число: ");
        thirdVal = scanner.nextInt();

        if (firstVal > secondVal) {
            if (firstVal > thirdVal) {
                max = firstVal;
            } else max = thirdVal;
        } else if (secondVal > thirdVal) {
            max = secondVal;
        } else max = thirdVal;

        if (firstVal < secondVal) {
            if (firstVal < thirdVal) {
                min = firstVal;
            } else min = thirdVal;
        } else if (secondVal < thirdVal) {
            min = secondVal;
        } else min = thirdVal;

        average = (double) (firstVal + secondVal + thirdVal) / 3;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
