package com.ifmo.homework.work9;

import java.util.*;

public class MessageTask {

    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        int l = 0, m = 0, h = 0, u = 0;
        for (Message message : messageList) {
            if (message.getPriority().equals(Message.MessagePriority.LOW)) {
                l += 1;
            }
            if (message.getPriority().equals(Message.MessagePriority.MEDIUM)) {
                m += 1;
            }
            if (message.getPriority().equals(Message.MessagePriority.HIGH)) {
                h += 1;
            }
            if (message.getPriority().equals(Message.MessagePriority.URGENT)) {
                u += 1;
            }
        }
        System.out.println("LOW=" + l);
        System.out.println("MEDIUM=" + m);
        System.out.println("HIGH=" + h);
        System.out.println("URGENT=" + u);
    }
    public static void countEachPriority1 (List<Message> messageList) {
        int[] counts = new int[Message.MessagePriority.values().length];
        for (Message message : messageList) {
            counts[message.getPriority().ordinal()]++;
        }
    }

    public static void countEachCode1(List<Message> messageList) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
//        for (Message message : messageList) {
//            if (countMap.containsKey(message.getCode())){
//                countMap.put(message.getCode(), countMap.get(message.getCode())+1);
//            } else {
//                countMap.put(message.getCode(),1);
//            }
//        }
        System.out.println(countMap);
        for (Message message : messageList) {
            countMap.put(message.getCode(),countMap.getOrDefault(message.getCode(),0)+1);
        }
        System.out.println(countMap);
        }


        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль



        public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
        for (Message message : messageList) {
            if (message.getCode() == 0) {
                a += 1;
            }
            if (message.getCode() == 1) {
                b += 1;
            }
            if (message.getCode() == 2) {
                c += 1;
            }
            if (message.getCode() == 3) {
                d += 1;
            }
            if (message.getCode() == 4) {
                e += 1;
            }
            if (message.getCode() == 5) {
                f += 1;
            }
            if (message.getCode() == 6) {
                g += 1;
            }
            if (message.getCode() == 7) {
                h += 1;
            }
            if (message.getCode() == 8) {
                i += 1;
            }
            if (message.getCode() == 9) {
                j += 1;
            }
        }
        System.out.println("0=" + a);
        System.out.println("1=" + b);
        System.out.println("2=" + c);
        System.out.println("3=" + d);
        System.out.println("4=" + e);
        System.out.println("5=" + f);
        System.out.println("6=" + g);
        System.out.println("7=" + h);
        System.out.println("8=" + i);
        System.out.println("9=" + j);
    }

    public static void uniqueMessageCount1(List<Message> messageList) {
        System.out.println(new HashSet<>(messageList).size());
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0;
        for (Message message : messageList) {
            if (message.getCode() == 0) {
                a += 1;
            }
            if (message.getCode() == 1) {
                b += 1;
            }
            if (message.getCode() == 2) {
                c += 1;
            }
            if (message.getCode() == 3) {
                d += 1;
            }
            if (message.getCode() == 4) {
                e += 1;
            }
            if (message.getCode() == 5) {
                f += 1;
            }
            if (message.getCode() == 6) {
                g += 1;
            }
            if (message.getCode() == 7) {
                h += 1;
            }
            if (message.getCode() == 8) {
                i += 1;
            }
            if (message.getCode() == 9) {
                j += 1;
            }
        }
        if (a == 1) k += 1;
        if (b == 1) k += 1;
        if (c == 1) k += 1;
        if (d == 1) k += 1;
        if (e == 1) k += 1;
        if (f == 1) k += 1;
        if (g == 1) k += 1;
        if (h == 1) k += 1;
        if (i == 1) k += 1;
        if (j == 1) k += 1;
        System.out.println("Количество уникальных сообщений=" + k);
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]

//        Идея, что я создаю копию коллекции, сравниваю все элеметы после 1 и если есть повторяющиеся, то я их удаляю
//        Но не работает
        HashSet<Message> copy = new HashSet<>();
        for (Message message : messageList) {
            copy.add(message);
        }
        int a = 0;
        for (Message message : messageList) {
            for (int i = 0; i < messageList.size(); i++) {
                if (message.equals(copy)) {
                    copy.remove(i);
                }
            }
        }
        System.out.println(copy);
        return new ArrayList<>(new LinkedHashSet<>(messageList));
    }

    public static List<Message> copyEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на каждое сообщение с заданным приоритетом
        //  метод должен вернуть новую коллекцию
        ArrayList<Message> copy = new ArrayList<>();
        for (Message message : messageList) {
            if (message.getPriority().equals(priority)) {
                copy.add(message);
            }
        }
        System.out.println(copy);
        return null;
    }

    public static List<Message> copyOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на все сообщения, кроме тех, которые имеют заданный приоритет
        //  метод должен вернуть новую коллекцию
        ArrayList<Message> copy = new ArrayList<>();
        for (Message message : messageList) {
            if (!(message.getPriority().equals(priority))) {
                copy.add(message);
            }
        }
        System.out.println(copy);
        return null;
    }

    public static void main(String[] args) {
        List<Message> messages = Message.MessageGenerator.generate(34);
        System.out.println(messages);
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        uniqueMessagesInOriginalOrder(messages);
        copyEach(messages, Message.MessagePriority.HIGH);
        copyOther(messages, Message.MessagePriority.HIGH);
        countEachCode1(messages);


    }



}
