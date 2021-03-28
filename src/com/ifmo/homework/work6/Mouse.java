package com.ifmo.homework.work6;

public class Mouse {

//    Мышь: скорость.

    private double speedMouse;

    public double getSpeedMouse() {
        return speedMouse;
    }

    public void setSpeedMouse(int speedMouse) {
        if (speedMouse < 1 || speedMouse>20) {
            throw new IllegalArgumentException("Не бывает таких мышей");
        }
        this.speedMouse = speedMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speedMouse=" + speedMouse +
                '}';
    }
}
