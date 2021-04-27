package com.ifmo.homework.work12;

import java.io.*;
import java.util.Scanner;

public class TxtHandler extends FileHandler {

    public TxtHandler(File file) {
        setFile(file);
    }

    public void setFile(File file) {
        if (file == null || !file.getName().endsWith("txt") || file.isDirectory()) {
            this.file = new File("default.txt");
        } else {
            this.file = file;
        }
        try {
            if (this.file.createNewFile()) {
                System.out.println(this.file.getName() + " создан");
            } else {
                System.out.println(this.file.getName() + " уже существует");
            }
        } catch (IOException e) {
            System.out.println("Файл не был создан" + e.getMessage());
        }
    }

//    public static byte[] encode(String pText, String pKey) {
//        byte[] txt = pText.getBytes();
//        byte[] key = pKey.getBytes();
//        byte[] res = new byte[pText.length()];
//
//        for (int i = 0; i < txt.length; i++) {
//            res[i] = (byte) (txt[i] ^ key[i % key.length]);
//        }
//        return res;
//    }

    @Override
    public boolean writeToFile(byte[] data) {
        boolean result = false;
        try (FileOutputStream outputStream = new FileOutputStream(file);
             FilterOutputStream filterOutputStream = new FilterOutputStream(outputStream)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ключ шифрования");
            String userKey = scanner.nextLine();
            System.out.println("Введите строку которую хотите зашифровать");
            String userText = scanner.nextLine();
            byte[] txt = userText.getBytes();
            byte[] key = userKey.getBytes();
            byte[] res = new byte[userText.length()];
            for (int i = 0; i < txt.length; i++) {
                res[i] = (byte) (txt[i] ^ key[i % key.length]);
            }
            filterOutputStream.write(res);
            result = true;
        } catch (FileNotFoundException e) {
            System.out.println("Файл для записи не был найден");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
        return result;
    }

//    public static String decode(byte[] pText, String pKey) {
//        byte[] res = new byte[pText.length];
//        byte[] key = pKey.getBytes();
//
//        for (int i = 0; i < pText.length; i++) {
//            res[i] = (byte) (pText[i] ^ key[i % key.length]);
//        }
//        return new String(res);
//    }

    @Override
    public byte[] readFromFile() {
        byte[] result = null;
        try (FileInputStream fileInput = new FileInputStream(file);
             ByteArrayOutputStream byteArray = new ByteArrayOutputStream()) {
            byte[] buff = new byte[512];
            int readCount;
            while ((readCount = fileInput.read(buff)) != -1) {
                byteArray.write(buff, 0, readCount);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ключ дешифрования");
            String userKey = scanner.nextLine();
            byte[] key = userKey.getBytes();
            byte[] res = new byte[byteArray.toByteArray().length];
            for (int i = 0; i < byteArray.toByteArray().length; i++) {
                res[i] = (byte) (byteArray.toByteArray()[i] ^ key[i % key.length]);
            }
            result = res;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }
        return result;
    }

}
