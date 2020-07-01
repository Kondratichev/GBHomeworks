package homeworkone;

public class Main {

    public static void main(String[] args) {
        short sh = -100;
        int i = 7;
        byte b = 8;
        long l = 50L;
        char c = 'A';
        double d = 50.3;
        float f = 100f;
        String s = "HELLO";
        boolean boo = true;

        int result1 = Ex3(i, b, (int) l, sh);
        System.out.println("Результат задания 3 = " + result1);

        boolean result2 = Ex4(i, b);
        System.out.println("Результат задания 4 = " + result2);

        System.out.print("Результат задания 5 = ");
        Ex5(sh);

        boolean result3 = Ex6 (i);
        System.out.println("Результат задания 6 = " + result3);

        String str = "Александр";
        System.out.print("Результат задания 7 - ");
        Ex7(str);

        int year = 2020;
        System.out.print("Результат задания 8 - ");
        Ex8 (year);

    }

    public static int Ex3 (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean Ex4 (int a, int b) {
        boolean resultOfCompare;
        int c = a + b;
        if ((c > 10) & (c < 21)) resultOfCompare = true;
        else resultOfCompare = false;
        return resultOfCompare;
    }

    public static void Ex5 (int a) {
        if (a > -1) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static boolean Ex6 (int a) {
        return a < 0;
    }
    public static void Ex7 (String st) {
        System.out.println("Привет, " + st + "!");
    }
    public static void Ex8 (int i) {
        if ((i / 4) >= 1 & (i % 4 == 0 )) {
            if ((i / 100 % 4 != 0) && (i % 100 == 0)) System.out.println("Не високосный год");
            else System.out.println("Високосный год");
        }
        else System.out.println("Не високосный год");

    }
}