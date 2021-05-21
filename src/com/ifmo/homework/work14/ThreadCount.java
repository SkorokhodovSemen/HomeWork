package com.ifmo.homework.work14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ThreadCount extends Thread {
    private int j = 0;

    private String text1 = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
            "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
            "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
            "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
            "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
            " sometimes on purpose injected humour and the like";
    private String[] text = text1.toLowerCase().split(" ");
    ;
    ArrayList<String> texts0 = new ArrayList<>();
    ArrayList<String> texts1 = new ArrayList<>();
    ArrayList<String> texts2 = new ArrayList<>();
    ArrayList<String> texts3 = new ArrayList<>();
    ArrayList<String> texts4 = new ArrayList<>();
    ArrayList<String> texts5 = new ArrayList<>();
    ArrayList<String> texts6 = new ArrayList<>();
    ArrayList<String> texts7 = new ArrayList<>();
    private int a;
    HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>() {
    };

    @Override
    public void run() {
        a = Integer.parseInt(Thread.currentThread().getName().substring(Thread.currentThread().getName().length() - 1));
        synchronized (map) {
            if (a == (Runtime.getRuntime().availableProcessors() - 1)) {
                for (int i = 0; i < ((text.length) / (Runtime.getRuntime().availableProcessors()) + (text.length) % (Runtime.getRuntime().availableProcessors())); i++) {
                    if (text[j] != null) {
                        texts7.add(text[j]);
                        text[j] = null;
                        j += 1;
                    }
                }
                map.put(7, texts7);
            }
            if (a != Runtime.getRuntime().availableProcessors() - 1) {
                for (int i = 0; i < (Runtime.getRuntime().availableProcessors()); i++) {
                    if (i == a) {
                        for (int k = 0; k < ((text.length) / (Runtime.getRuntime().availableProcessors())); k++) {
                            texts0.add(text[j]);
                            j += 1;
                        }
                    }
                }
                map.put(0, texts0);
            }
            System.out.println(Thread.currentThread().getName() + map);
        }
    }
}
