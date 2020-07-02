package homeworktwo;

public class WorkTwo {
    public static void main(String args[]) {

        int[] arrayOne = {1, 0, 0, 1, 1, 1, 0, 0};
        int[] arrayTwo = new int[8];
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arrayFour = new int[9][9];
        int[] arrayFive = {2, -5, 6, 8, 12, 45, 54, 32, 44, -1, 0, 4,};
        int[] arraySix = {2, 2, 2, 2, 8};
        int[] arraySeven = {1, 2, 3, 4, 5};
        int n = -3;

        Ex1(arrayOne);
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + "  ");
        }
        System.out.println();

        Ex2(arrayTwo);
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + "  ");
        }
        System.out.println();

        Ex3(arrayThree);
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i] + "  ");
        }
        System.out.println();

        Ex4(arrayFour);
        for (int i = 0; i < arrayFour.length; i++) {
            for (int j = 0; j < arrayFour[i].length; j++) {
                System.out.print(arrayFour[i][j] + "  ");
            }
            System.out.println();
        }

        Ex5(arrayFive);
        System.out.println();

        System.out.println(Ex6(arraySix));

        Ex7(arraySeven, n);
        for (int i = 0; i < arraySeven.length; i++) {
            System.out.print(arraySeven[i] + "  ");
        }
        System.out.println();
        System.out.print("Дополнительное задание\n");
        Ex8(arrayFive);
        for (int i = 0; i < arrayFive.length; i++) {
            System.out.print(arrayFive[i] + "  ");
        }
    }

    public static void Ex1(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }
    }

    public static void Ex2(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
    }

    public static void Ex3(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }

    public static void Ex4(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) | (j == (array[i].length - (i + 1)))) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
            }
        }
    }

    public static void Ex5(int array[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент массива - " + max);
        System.out.println("Минимальный элемент массива - " + min);
    }

    public static boolean Ex6(int array[]) {
        int sumleft = 0, sumright = 0, j;  // если тут не присвоить данным переменным значения 0, то компилятор выдает ошибку:
                                            // Error:(111, 16) java: variable sumleft might not have been initialized
                                            //честно говоря, не понимаю, почему так происходит...
        for (int i = 0; i < array.length; i++) {
            sumleft = 0;
            sumright = 0;
            j = i;
            do {
                sumleft = sumleft + array[j];
                j--;
            } while (j > -1);
            j = i + 1;
            while (j < array.length) {
                sumright = sumright + array[j];
                j++;
            }
            if (sumleft == sumright) {
                break;
            }
        }
        return sumleft == sumright;
    }

    public static void Ex7(int array[], int n) {
        int j;
        if (n > 0) {
            for (int k = 0; k < n; k++) {
                for (int i = 1; i < array.length; i++) {
                    j = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = j;
                }
            }
        } else if (n < 0) {
            for (int k = 0; k > n; k--) {
                for (int i = array.length - 2; i >= 0; i--) {
                    j = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = j;
                }
            }
        }
    }
    //дополнительное задание - сортировка массива от min к max
    public static void Ex8(int array[]) {
        int k = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    k = array[j-1];
                    array[j-1] = array[j];
                    array [j] = k;
                }
            }
        }
    }
}



