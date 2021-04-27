package com.ifmo.homework.work12;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class IOApplication {
    public static void main(String[] args) {
        String text = "Ты пахнешь как любовь.Ты сумашествие с первого взгляда ";
        TxtHandler txtHandler = new TxtHandler(new File("file.txt"));
        System.out.println(txtHandler.writeToFile(text.getBytes()));
        String fromFile = new String(txtHandler.readFromFile());
        System.out.println(fromFile);



    }
}
