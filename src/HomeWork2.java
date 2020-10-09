import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {

        int firstVal = 10;
        int secondVal = 20;
        int userVal;

        System.out.print("Введите свое целое число: ");
        Scanner scanner = new Scanner(System.in);
        userVal = scanner.nextInt();

        if (userVal <= firstVal) {
            System.out.println("Ваше число находится в первом диапазоне");
        } else if ((userVal > firstVal) && (userVal <= secondVal)) {
            System.out.println("Ваше число находится во втором диапазоне");
        } else System.out.println("Ваше число находится в третьем диапазоне");
    }
}
