import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        int day = 0;
        System.out.print("Введите число дня недели от 1 до 7: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {   // микропроверка)))) хотел просто попробовать)))) работает)))) вроде...
            day = scanner.nextInt();
        } else {
            System.out.println("Неверный формат");
            return;
        }

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Введено неправильное значение дня");
        }
    }

}
