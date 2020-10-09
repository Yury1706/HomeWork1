import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {

        double startPoint = 100.00;
        double userInput;

        System.out.print("Введите свое число: ");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextDouble();

        if (userInput == startPoint) {
            System.out.println("Вы угадали стартовое значение!!!");
        } else if ((userInput >= (startPoint * 0.9) && (userInput <= (startPoint * 1.1)))) {
            System.out.println("Ваше число близко к стартовому значению");
        } else System.out.println("Ваше число далеко от стартового значения");
    }
}
