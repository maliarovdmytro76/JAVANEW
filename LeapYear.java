import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (isLeapyear(year)) {
            System.out.println(year + "isLeap");
        } else {
            System.out.println(year + " не является высокосным");
        }
    }

    public static boolean isLeapyear(int year) {
        if (year % 400 == 0) {
         return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }

    }
}
