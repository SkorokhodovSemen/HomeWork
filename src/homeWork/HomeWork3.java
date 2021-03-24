package homeWork;


import java.util.Arrays;
import java.util.Collections;

public class HomeWork3 {
    public static void main(String[] args) {


        // 1. Поменять местами минимальный и максимальный элементы

        // Задача 1
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=(int)(Math.random()*497)+3;
        }
        System.out.println(Arrays.toString(ints));
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int mini = 0, maxi=0;
        // Если задача стоит поменять местами ТОЛЬКО значения max и min не трогая остальные, то
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]<min) {
                min = ints[i];
                mini=i;
            }
            if (ints[i]>max) {
                max = ints[i];
                maxi = i;
            }
        }
        ints[mini] = max;
        ints[maxi] = min;
        System.out.println(Arrays.toString(ints));


        // 2. Задан одномерный массив целых чисел.
        // Образуйте из него два отсортированных по возрастанию массива, содержащих четные и нечетные числа.

        //Задача 2
        //Была сложность в объявлении 2 дополнительных массивов не зная их длины.

        int[] ints1 = new int[]{4,154,77,93,-78,-31,-111,114,-7,-3,156};
        int a=0, b=0;
        for (int i : ints1) {
            if (i%2 == 0) a+=1;
            if (i%2 != 0) b+=1;
        }
        int[] ints2 = new int[a];
        int[] ints3 = new int[b];
        int c=a,d=b;
        for (int i = 0; i < ints1.length; i++) {
            if (ints1[i]%2 == 0) {
                ints2[a-c]=ints1[i];
                c-=1;
            }
            if (ints1[i]%2 != 0) {
                ints3[b-d]=ints1[i];
                d-=1;
            }
        }
        Arrays.sort(ints2);
        Arrays.sort(ints3);
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(ints3));

        // 3. Задать массив. Отрицательные элементы массива перенести в новый массив.
        // Размер массива должен быть равен количеству отрицательных элементов.

        // Задача 3

        int[] ints4 = new int[]{-100,-75,-99,55,44,31,-54,-90,114,765};
        int e = 0;
        for (int i : ints4) if (i<0) e+=1;
        int[] ints5 = new int[e];
        int f = e;
        for (int i = 0; i < ints4.length; i++) {
            if (ints4[i]<0) {
                ints5[e-f] = ints4[i];
                f-=1;
            }
        }
        System.out.println(Arrays.toString(ints5));

        // 4. Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)

        Integer[] ints6 = new Integer[10];
        for (int i = 0; i < ints6.length; i++) {
            ints6[i]=2+2*i;
        }
        Arrays.sort(ints6, Collections.reverseOrder()); //Что такое коллекция? Можно ли его использовать в данном случае?
        System.out.println(Arrays.toString(ints6)); //Можно было написать цикл с выводом на консоль каждого элемента
        //for (int i = ints6.lenght-1; i >=0; i--) System.out.println(ints6[i] + " ");


        // 5. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
        // Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.

        int[] ints7 = new int[11];
        int a1=0,b1=0,c1=0;
        for (int i = 0; i <ints7.length; i++) {
            ints7[i]=(int)(Math.random()*3)-1;
        }
        System.out.println(Arrays.toString(ints7));
        for (int i : ints7) {
            if (i == -1) a1+=1;
            if (i == 0) b1+=1;
            if (i == 1) c1+=1;
        }
        if (a1>=b1 && a1>=c1) System.out.println("Число -1 встречается чаще всего, а именно " +a1+ " раз" );
        if (b1>=a1 && b1>=c1) System.out.println("Число 0 встречается чаще всего, а именно " +b1+ " раз" );
        if (c1>=a1 && c1>=b1) System.out.println("Число 1 встречается чаще всего, а именно " +c1+ " раз" );


        //2 способ, но при одинаковом количестве повторений на экран выведется первое максимальное чилсо при поиске
        //То есть, если 1 и -1 повторяются одинаково, то если при проверке 1 была раньше, чем -1, то на ответ выйдет 1

        int[] ints8 = new int[11];
        int max1 = 0;
        int znach = 0;
        int l=0;
        for (int i = 0; i <ints8.length; i++) {
            ints8[i]=(int)(Math.random()*3)-1;
        }
        System.out.println(Arrays.toString(ints8));
        for (int k = 0; k < ints8.length; k++) {
            for (int i = 0; i < ints8.length; i++) {
                if (ints8[k] == ints8[i]) {
                    l+=1;
                    if (l>max1) {
                        max1=l;
                        znach = ints8[k];
                    }
                }
            }
            l=0;
        }
        System.out.println("Число " +znach+ " встречается чаще всего, а именно " +max1+ " раз");


    }
}
