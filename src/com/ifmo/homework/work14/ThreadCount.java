package com.ifmo.homework.work14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ThreadCount extends Thread {

    private String text1 = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                    "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
    private String[] text= text1.toLowerCase().split(" ");;
    ArrayList<String> texts = new ArrayList<>(Arrays.asList(text));
    private int a;

    @Override
    public void run() {
        HashMap<String, Integer> map = new HashMap<String, Integer>() {
        };
        a = Integer.parseInt(Thread.currentThread().getName().substring(Thread.currentThread().getName().length()-1));
        synchronized (texts) {
            if (a == Runtime.getRuntime().availableProcessors()-1){
                for (int i = 0; i < text.length / Runtime.getRuntime().availableProcessors() + text.length % Runtime.getRuntime().availableProcessors(); i++) {
                    map.put(texts.get(i), 1);
                    texts.remove(i);
                }
            }
            if (a != Runtime.getRuntime().availableProcessors()-1) {
                for (int i = 0; i < text.length / Runtime.getRuntime().availableProcessors(); i++) {
                    map.put(texts.get(i), 1);
                    texts.remove(i);
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + map);
    }
}
