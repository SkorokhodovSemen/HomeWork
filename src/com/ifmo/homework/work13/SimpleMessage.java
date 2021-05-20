package com.ifmo.homework.work13;

import java.io.Serializable;
import java.net.Socket;
import java.time.LocalDateTime;

//1. По клиент - серверу (для отправки команд используйте класс SimpleMessage):
//Клиент от пользователя принимает список команд:
//    /help - пользователь хочет узнать список доступных команд
//    /count - пользователь хочет узнать количество клиентов, которые подключались к серверу
//    /ping - пользователь хочет узнать время за которое сообщение доходит до сервера и возвращается обратно
//    /exit - пользователь хочет выйти из программы (завершение программы)
//
//Сервер принимает, обрабатывает запрос и отправляет ответ на следующие команды:
//    /help - список доступных команд
//    /count - количество подключений сервера
//    /ping - время за которое сообщение доходит до сервера и возвращается обратно
//    /exit - пользователь хочет выйти из программы

public class SimpleMessage implements Serializable {
    private String sender;
    private String text;
    private LocalDateTime dateTime;

    public SimpleMessage(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public static void help() {
        System.out.println(
                "/help - список доступных команд\n" +
                "/count - количество подключений сервера\n" +
                "/ping - время за которое сообщение доходит до сервера и возвращается обратно\n" +
                "/exit - пользователь хочет выйти из программы");
    }

    public static void count() {
        System.out.println("");
    }

//    public static void ping() {
//        System.out.println(LocalDateTime.now().minus());
//    }

    public static void exit(){

    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDateTime(){
        dateTime = LocalDateTime.now();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "SimpleMessage{" +
                "sender='" + sender + '\'' +
                ", text='" + text + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

    public static SimpleMessage getMessage(String sender, String text){
        return new SimpleMessage(sender, text);
    }
}