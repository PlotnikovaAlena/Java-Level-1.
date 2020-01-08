/*
Java. Уровень 1.
Домашняя работа к уроку №3
Плотникова Алёна
 */
/*
1. Написать программу, которая загадывает случайное число от 0 до 9,
и пользователю дается 3 попытки угадать это число.
 При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
  чем загаданное, или меньше.
  После победы или проигрыша выводится запрос – «Повторить игру еще раз?
  1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {

        static Random random = new Random();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.print("Выбирите программу:\n" +
                        "1 - Угадайте число\n2 - Угадайте слово\n3. Выход\n: ");
                switch (scanner.next()) {
                    case "1":
                        guessNumber();
                        break;
                    case "2":
                        guessWord();
                        break;
                    default:
                        return;
                }
            }
        }

         static void guessNumber() {
            do {
            System.out.println("Ваша задача угадать число. У Вас есть 3 попытки!");
            int range = 9;
            int counter = 3;
            int number = (int) (Math.random() * range);
            while (true) {
                System.out.println("Угадайте число от 0 до " + range);
                if (counter > 0) {

                    int inpute_number = scanner.nextInt();
                    if (inpute_number == number) {
                        System.out.println("Вы угадали!");
                        break;
                    } else if (inpute_number > number) {
                        System.out.println("Зазаданное число меньше. У Вас осталось " + (counter - 1) + " попытки!");
                    } else {
                        System.out.println("Зазаданное число больше. У Вас осталось " + (counter - 1) + " попытки!");
                    }
                    counter--;
                } else {
                    System.out.println("Попытки кончились. Вы проиграли!");
                    break;
                }
            }
            System.out.print("Вы хотите сыграть ещё раз?\n 1 - ДА / 0 - НЕТ: ");
        } while (scanner.next().equals("1"));

         scanner.close();
    }

    /*
    2 * Создать массив из слов String[] words = {"apple", "orange", "lemon",
    "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
    "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
    "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
     */

    static void guessWord() {
        String[] words = {"apple", "orange", "lemon",
                "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guess = null;
        String word = words[random.nextInt(words.length)];
        System.out.println(Arrays.toString(words));
        do {
            System.out.print("Угадайте слово: ");
            guess = scanner.next();
            for (int i = 0; i < 15; i++)
                if (i < word.length() && i < guess.length() &&
                        word.charAt(i) == guess.charAt(i))
                    System.out.print(word.charAt(i));
                else
                    System.out.print((word.equals(guess)) ? "" : "#");
            System.out.println();
        } while (!word.equals(guess));

    }
}
