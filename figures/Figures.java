package com.figures;

public abstract class Figures {
    private String name;
    private int numberOfCorners;
    private boolean isTriangle;
    private boolean isQuadrilateral;

    {
        setName("Неизвестная фигура");
        setNumberOfCorners(0);
        setQuadrilateral(false);
        setTriangle(false);
    }

    public Figures(int numberOfCorners) {
        this.numberOfCorners = numberOfCorners;
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

    public abstract void call();

    public String display() {
        return "Название фигуры: " + name + '\'' +
                ", Число углов: " + numberOfCorners + '\'' +
                ", Треугольник ли это: " + (isTriangle ?  "Да" : "Нет" ) + '\'' +
                ", Четырехугольник ли это: " + (isQuadrilateral ? "Да" : "Нет");
    }
}



