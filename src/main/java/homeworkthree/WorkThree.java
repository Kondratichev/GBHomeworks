package homeworkthree;

import java.util.Scanner;

public class WorkThree {
    public static Scanner scan = new Scanner(System.in);
    public static void main (String [] args) {

        play();
        int num_menu = 0;
        do {
            System.out.println("Попробуете еще раз? \n  Введите 1 что бы повторить или 0 что бы выйти из игры");
            num_menu = scan.nextInt();
            switch (num_menu) {
                case 1:
                    play();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        } while (num_menu != 0);
        scan.close();
    }

        public static void play() {
            boolean check = true;
            int number = (int) (Math.random() * 10);
            for (int i = 0; i < 3; i++) {
                System.out.println("Угадай число от 0 до 9");
                int input_number = scan.nextInt();
                if (input_number == number) {
                    check = false;
                    System.out.println("Вы угадали число! Поздравляем!");
                    break;
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше!");
                } else System.out.println("Загаданное число больше!");
            }
            if (check) {
                System.out.println("Вы не угадали число!");
            }
        }
}
