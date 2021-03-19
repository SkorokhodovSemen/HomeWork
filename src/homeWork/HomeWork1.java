package homeWork;

public class HomeWork1 {
    public static void main(String[] args) {

//        Задача №1
        long between, start, end;
        start = 200;
        end = 100;
        between = start < end ? end - start : -1;
        System.out.println(between);

//        Задача №2
        int ab, a, b;
        ab=77;
        a=ab/10;    //Присвоить значение десяток
        b=ab%10;    //Присвоить значение единиц
        System.out.println(a+b);    //Вывести на ответ сумму
        System.out.println(ab/10+ab%10);    //Решение 1 строчкой

//        Задача №3
        int abc, k;
        abc = 381;
        a=abc/100;      //Присвоить значение сотен
        b=abc/10%10;    //Присвоить значение десяток
        k=abc % 10;     //Присвоить значение единиц
        System.out.println(a+b+k);  //Вывести на ответ сумму
        System.out.println(abc/100+abc/10%10+abc%10);   //Решение 1 строчкой

    }
}
