package com.ifmo.homework.work14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopTenWords {
    public static void main(String[] args) {

//        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
//                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
//                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
//                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
//                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
//                " sometimes on purpose injected humour and the like";
//        String[] text2 = text.toLowerCase().split(" ");
//
//
//        System.out.println(text2.length);
//        System.out.println(Runtime.getRuntime().availableProcessors());

        ArrayList<ThreadCount> threadCounts = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<String, Integer>() {};

        for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
            threadCounts.add(new ThreadCount());
        }
        threadCounts.forEach(thread -> thread.start());
        threadCounts.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });




    }
}
