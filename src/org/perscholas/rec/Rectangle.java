package org.perscholas.rec;

public class Rectangle {
    double width = 0;
    double length = 0;

    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.length * this.width;
    }



}
