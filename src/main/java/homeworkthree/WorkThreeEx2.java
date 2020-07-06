package homeworkthree;

import java.util.Scanner;

public class WorkThreeEx2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        play(words);
    }

    public static void play(String arr[]) {
        boolean check = true;
        String askWord = new String();
        int rand = (int) (Math.random() * arr.length);
        askWord = arr[rand];                             // Задаем рандомное значение проверочному слову
        String tip = new String();                      // Переменная для вывода подсказки
        System.out.println("Назови слово (фрукт или овощ) и нажми Enter");
        int lengthOfWord;   // не очень хочется вводить еще одну переменную, но если не сравнить длину строк для
        // работы цикла - попадаешь на исключение, если длина введенной строки меньше длины загаданного слова

        while (check) {
            String input_word = scan.nextLine();
            tip = "";               // Каждый раз будем обнулять подсказку
            if (askWord.length() > input_word.length()) {   // Проверяю, какое из слов короче, что б взять его длину за основу в цикле и не попасть на исключение
                lengthOfWord = input_word.length();
            } else lengthOfWord = askWord.length();

            if (askWord.equals(input_word)) {
                System.out.println("Невероятно! Ты - угадал слово!");
                check = false;
                break;      // Если сразу угадали слово - выходим из цикла
            } else
                for (int i = 0; i < lengthOfWord; i++) {        //если не угадали - перебираем по символьно строки и
                                                                    // сравниваем их значение

                    if (askWord.charAt(i) == input_word.charAt(i)) {
                        tip = tip + askWord.charAt(i);      //приклеиваем символ к строке, если он совпадает
                    } else tip = tip + '#';                     // и приклеиваем * - если не совпадает
                }
                for (int k = tip.length(); k < 15; k++) {       //Не очень нужный цикл, который приклеивает # - что бы
                                                                // получилось ровно 15 символов в подсказке
                    tip = tip + '#';
                }

            if (check) {
                System.out.println("Вот какие буквы ты угадал в загаданном слове - " + tip + "\n Попробуй снова");
            }
        }
    }
}