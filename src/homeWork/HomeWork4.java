package homeWork;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        /*
1. Задать массив на n слов.
В цикле считывать с консоли слова (scanner.nextLine()),
и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
В итоге в массиве будут только уникальные слова.
Выход их программы по слову exit (его в массив не добавлять) или если массив заполнен
Перед завершением программы, вывести получившийся массив в консоль
         */
        Scanner in = new Scanner(System.in);
//          ПЕРЕДЕЛАТЬ
//        Scanner in = new Scanner(System.in);
//        System.out.println("Сколько слов вы хотите добавить в массив?");
//        int n = Integer.parseInt(in.nextLine());
//        int a = 0;
//        String[] userWords = new String[n];
//        while (true) {
//                System.out.println("Введите слово");
//                String userWord = in.nextLine();
//                if (userWord.equalsIgnoreCase("exit")) break;
//                for (int j = 0; j < a; j++) {
//                    if (userWord.equalsIgnoreCase(userWords[j])){
//                        break;
//                    } else userWords[j] = userWord;
//                }
//                a= userWords.length;
//            }
//        System.out.println(Arrays.toString(userWords));
//        for (int i = 0; i < userWords.length; i++) {
//            if (!(userWords[i] == null)) a += 1;
//        }
//        int b = 0;
//        String[] userWordsWithoutNull = new String[a];
//        for (int i = 0; i < userWordsWithoutNull.length; i++) {
//            for (int j = b; j < userWords.length; j++) {
//                if (!(userWords[j] == null)) {
//                    userWordsWithoutNull[i] = userWords[j];
//                    b = i;
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(userWordsWithoutNull));
        // Не получается вывести на экран слова. Разобрать на паре.


//        2. Найти количество вхождений одной строки в другую.
//Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза
        System.out.println("Введите слово или строку которую хотите найти");
        String userWord4 = in.nextLine();
        System.out.println("Введите слово или строку в которуй будете искать");
        String userWord5 = in.nextLine();
        String[] userWord5ch = userWord5.split(userWord4);
        System.out.println(Arrays.toString(userWord5ch));
        System.out.println(userWord5ch.length - 1);
        // Работает криво. Разобрать на паре

        //Второй метод не правильно считает, не могу понять
        int schet = 0;
        int uv =0;
        System.out.println("Введите слово или строку которую хотите найти");
        String userWord12 = in.nextLine();
        System.out.println("Введите слово или строку в которуй будете искать");
        String userWord13 = in.nextLine();
        userWord12 = userWord12.toLowerCase(Locale.ROOT);
        userWord13 = userWord13.toLowerCase(Locale.ROOT);
        char[] sea1 = userWord12.toCharArray();
        char[] sea2 = userWord13.toCharArray();
        for (int i = 0; i <= (sea2.length - sea1.length+1); i++) {
            uv+=1;
            for (int j = 0; j < sea1.length; j++) {
                if (sea2[i] == sea1[j]) {
                    i+=1;
                }
                if (i == sea1.length) schet += 1;
            }
            i=uv;
        }
        System.out.println(schet);


//3. Написать функцию, которая проверяет, является ли строка палиндромом.
//Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по буквам или по словам как слева направо,
//так и справа налево.
//Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
        int o = 0, p = 0;
        System.out.println("Введите строку");
        String userWord11 = in.nextLine();
        userWord11 = userWord11.replaceAll("\\s+", "");
        userWord11 = userWord11.toLowerCase(Locale.ROOT);
        System.out.println(userWord11); //проверить себя
        char[] palin = userWord11.toCharArray();
        int l = palin.length - 1;
        while (o < l) {
            if (palin[o] != palin[l]) {
                System.out.println("Не палиндром");
                break;
            }
            o++;
            l--;
        }

        if (o == (int) (palin.length / 2)) System.out.println("Палиндром");

//4. Заменить все буквы в слове на строчные, а первую букву на заглавную
//Например, дано hello, получаем Hello / дано HeLLO, получаем Hello


        System.out.println("Введите слово");
        String userWord3 = in.nextLine();
        System.out.println(userWord3.substring(0, 1).toUpperCase(Locale.ROOT) + userWord3.substring(1).toLowerCase(Locale.ROOT));
        userWord3 = userWord3.substring(0, 1).toUpperCase(Locale.ROOT) + userWord3.substring(1).toLowerCase(Locale.ROOT);
        System.out.println(userWord3);
        // Если задача изменить массив то это второй вариант, если просто вывести на экран, то первый


//5. Вводится с клавиатуры массив слов. Определить, сколько слов начинается на определенную букву.
        System.out.println("Сколько слов вы хотите добавить в массив?");
        int k = Integer.parseInt(in.nextLine());
        String[] userWords9 = new String[k];
        for (int i = 0; i < userWords9.length; i++) {
            System.out.println("Введите слово");
            userWords9[i] = in.nextLine();
            if (userWords9[i].equalsIgnoreCase("exit")) break;
        }
        int res = 0;
        System.out.println("На какую букву вам интересны слова?");
        String buk = in.nextLine();
        for (int i = 0; i < userWords9.length; i++) {
            if (userWords9[i].substring(0, 1).equalsIgnoreCase(buk)) res += 1;
        }
        System.out.println(res);


    }
}
