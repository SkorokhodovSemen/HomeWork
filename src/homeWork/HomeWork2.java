package homeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {


//        Задача 1
        int count=91;
        if (count>=0 && count<=39) {
            System.out.println("Попробуйте в следующий раз");
        } else if (count >=40 && count <=59) {
            System.out.println("Удовлетворительно");
        } else if (count >=60 && count <=89) {
            System.out.println("Хорошо");
        } else if (count >=90 && count <=100) {
            System.out.println("Отлично");
        }
//        Можно было обойтись без последнего else if, если начинать проверять оценку сверху (со 100) и оставить
//        Что остальные числа попробуйте в следующий раз. Но я обезопасил себя от отрицательных значений и значений больше 100.

//        Задача 2
        int num1=4, num2=7, num3;
        System.out.println("Введите число");
        Scanner userNum = new Scanner(System.in);
        num3=userNum.nextInt();
        switch (num3) {
            case 3:
                System.out.println(num1+num2);
                break;
            case 5:
                System.out.println(num1-num2);
                break;
            case 7:
                System.out.println(num1*num2);
                break;
            case 9:
                System.out.println(num1/num2);
                break;
        }

//        Если поставить тип переменной double, то при последнем действии будет получаться точное, дробное число
//        В данном случае только целое число.

//        Задача 3
        int tarelka;
        double dish;
        Scanner userNum2 = new Scanner(System.in);
        Scanner userNum3 = new Scanner(System.in);
        System.out.println("Скажите, сколько у вас грязных тарелок");
        tarelka = userNum2.nextInt();
        System.out.println("Скажите, сколько у вас моющего средства");
        dish = userNum3.nextDouble();
        while (tarelka > 0 && (dish >=0.5)) {
            tarelka-=1;
            dish-=0.5;
            System.out.println("У вас осталось "+dish+" моющего средства");
        if (tarelka == 0 && dish==0) {
            System.out.println("У вас чистая посуда, но нет моющего средства, нужно сходить в магазин)");
        } else {
            System.out.println("У вас осталось "+tarelka+" грязных тарелок"); }
        }

//        Задача 4
        int zagadka =1+(int)(Math.random()*10);
        int prov;
        Scanner userNum4 = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число");
            prov = userNum4.nextInt();
            if (prov == zagadka || prov == 0) {
                System.out.println("Ура, вы угадали!");
                break;
            } else {
                System.out.println("Вы не угадали, попробуйте еще раз");
            }
        }


//            Задача 5
        int random = 10 + (int) (Math.random()*491);
        if (random > 25 && random<200) {
            System.out.println("Число" + random + "входит в диапазон (25;200)");
        } else {
            System.out.println("Число" + random + "не входит в диапазон (25;200)");
        }



//            Задача 6
//        В 6 задаче я использовал дополнительное условие если и рандомизатор для выполнения задачи, что компьютер
//        задает 2 вопрос больше или меньше. Можно было обойтись и 1.
            int in1=0, in2=0, max=100, min=1;
            Scanner userNum5 = new Scanner(System.in);
            Scanner userNum6 = new Scanner(System.in);
        System.out.println("При ответах используйте 1 - да, 0 - нет");

            while (in1 == 0) {
                int ques = (int) (Math.random()*2);
                System.out.println("Ваше число " + (max+min)/2 + "?");
                in1 = userNum5.nextInt();
                if (in1 ==1) {
                    System.out.println("Я так и знал!");
                    break; }
                    if (ques==1) {
                    System.out.println("Оно больше?");
                    in2 = userNum6.nextInt();
                    if (in2 == 1) {
                        min=(max+min)/2;
                    } else {max=(max+min)/2;}}
                    if (ques==0) {
                        System.out.println("Оно меньше?");
                        in2 = userNum6.nextInt();
                        if (in2 == 1) {
                            max=(max+min)/2;
                        } else {min=(max+min)/2;}}
                if (min==99) {
                    System.out.println("Ваше чилсо 100! Это было трудно.");
                    break;}}




            }
    }
