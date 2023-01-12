package com.figures.triangle;

public class Triangle {
    private String name;
    private int numberOfCorners;
    private boolean isTriangle;
    private boolean isQuadrilateral;

    {
        setName("Треугольник");
        setNumberOfCorners(3);
        setQuadrilateral(false);
        setTriangle(true);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNumberOfCorners(int numberOfCorners) {
        this.numberOfCorners = numberOfCorners;
    }
    public int getNumberOfCorners() {
        return numberOfCorners;
    }

    public void setTriangle(boolean isTriangle) {
        this.isTriangle = isTriangle;
    }
    public boolean isTriangle() {
        return isTriangle;
    }

    public void setQuadrilateral(boolean isQuadrilateral) {
        this.isQuadrilateral = isQuadrilateral;
    }
    public boolean isQuadrilateral() {
        return isQuadrilateral;
    }

    public void call() {
        System.out.println("THIS IS TRIANGLE");
    }

    public String display() {
        return "Название фигуры: " + name + '\'' +
                ", Число углов: " + numberOfCorners + '\'' +
                ", Треугольник ли это: " + (isTriangle ?  "Да" : "Нет" ) + '\'' +
                ", Четырехугольник ли это: " + (isQuadrilateral ? "Да" : "Нет");
    }
}


