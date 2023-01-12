package com.figures;

public class Circle extends Figures {
    private boolean isCircle;
    private boolean isEllipse;

    {
        setName("Круг");
    }

    public Circle(int numberOfCorners, boolean isCircle, boolean isEllipse) {
        super(numberOfCorners);
        this.isCircle = isCircle;
        this.isEllipse = isEllipse;
    }

    public void setCircle(boolean isCircle) {
        this.isCircle = isCircle;
    }
    public boolean isCircle() {
        return isCircle;
    }

    public void setEllipse(boolean isEllipse) {
        this.isEllipse = isEllipse;
    }
    public boolean isEllipse() {
        return isEllipse;
    }

    @Override
    public void call() {
        System.out.println("THIS IS CIRCLE");
    }

    @Override
    public String display() {
        return super.display() + ", Это овал: " + (isEllipse ? "Да" : "Нет") + '\'' +
                ", Это круг: " + (isCircle ? "Да" : "Нет");
    }
}
