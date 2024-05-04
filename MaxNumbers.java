import java.util.Scanner;

public class MaxNumbers {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите три целых числа:");

            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();

            System.out.print("Введите третье число: ");
            int number3 = scanner.nextInt();

            scanner.close();

            int max = number1;
            if (number2 > max) {
                max = number2;
            }
            if (number3 > max) {
                max = number3;
            }

            System.out.printf("Максимальное число среди введенных: %d\n", max);
        }
    }


