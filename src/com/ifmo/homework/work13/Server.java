package com.ifmo.homework.work13;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private int port;
    private Connection connection;

    public Server(int port) {
        this.port = port;
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен");
            while (true) {
                Socket newClient = serverSocket.accept();
                connection = new Connection(newClient);
                SimpleMessage message = (SimpleMessage) connection.readMessage();
                System.out.println(message);
                connection.sendMessage(SimpleMessage.getMessage("Сервер", "сообщение"));
            }
        } catch (IOException e) {
            System.out.println("Ошибка сервера");
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка чтения сообщения");
        }
    }
}
