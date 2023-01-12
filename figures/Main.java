package com.figures;

public class Main {
    public static void main(String[] args) {
        Pentagon pentagon = new Pentagon(5);
        System.out.println(pentagon.display());
        pentagon.call();

        Hexagonal hexagonal = new Hexagonal(6);
        System.out.println(hexagonal.display());
        hexagonal.call();

        Ellipse ellipse = new Ellipse(0, false, true);
        System.out.println(ellipse.display());
        ellipse.call();

        Circle circle = new Circle(0, true, false);
        System.out.println(circle.display());
        circle.call();
    }
}
