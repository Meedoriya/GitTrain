package com.figures.quadrilateral;

public class Quadrilateral {
    private String name;
    private int numberOfCorners;
    private boolean isTriangle;
    private boolean isQuadrilateral;

    {
        setName("Четырехугольник");
        setNumberOfCorners(4);
        setQuadrilateral(true);
        setTriangle(false);
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
        System.out.println("THIS IS QUADRILATERAL");
    }

    public String display() {
        return "Название фигуры: " + name + '\'' +
                ", Число углов: " + numberOfCorners + '\'' +
                ", Треугольник ли это: " + (isTriangle ?  "Да" : "Нет" ) + '\'' +
                ", Четырехугольник ли это: " + (isQuadrilateral ? "Да" : "Нет");
    }
}


