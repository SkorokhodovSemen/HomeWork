package com.ifmo.homework.work13;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private String ip;
    private int port;
    private Scanner scanner;

    public Client(String ip, int port) {
        this.ip = ip;
        this.port = port;
        scanner = new Scanner(System.in);
    }

    public void start(){
        System.out.println("Введите имя");
        String userName = scanner.nextLine();
        String text;
        while (true){
            System.out.println("Введите сообщение");
            text = scanner.nextLine();
            sendAndPrintMessage(SimpleMessage.getMessage(userName,text));
            if (text.equals("exit")) break;
        }
    }

    private void sendAndPrintMessage(SimpleMessage message) {
        try (Connection connection = new Connection(new Socket(ip, port))) {
            connection.sendMessage(message);
            SimpleMessage fromServer = connection.readMessage();
            System.out.println("от сервера" + fromServer);
        } catch (IOException e){
            System.out.println("Ошибка отправки - получения сообщения");
        } catch (ClassNotFoundException e){
            System.out.println("Ошибка чтения");
        } catch (Exception e){
            System.out.println("Ошибка соединения");
        }
    }
}
