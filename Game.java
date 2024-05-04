import java.util.Scanner;

public class Game {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = 0;
            int y = 0; 

            System.out.println("Введите команду (up, down, right, left, loc):");

            while (true) {
                String command = scanner.nextLine();

                switch (command) {
                    case "up":
                        y++;
                        System.out.println("Вы двигаетесь вверх.");
                        break;
                    case "down":
                        y--;
                        System.out.println("Вы двигаетесь вниз.");
                        break;
                    case "right":
                        x++;
                        System.out.println("Вы двигаетесь вправо.");
                        break;
                    case "left":
                        x--;
                        System.out.println("Вы двигаетесь влево.");
                        break;
                    case "loc":
                        System.out.println("Текущие координаты: [" + x + ", " + y + "]");
                        break;
                    default:
                        System.out.println("Неизвестная команда. Попробуйте еще раз.");
                        break;
                }
            }
        }
    }


