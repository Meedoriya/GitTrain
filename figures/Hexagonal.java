package com.figures;

public class Hexagonal extends Figures {

    public Hexagonal(int numberOfCorners) {
        super(numberOfCorners);
    }

    {
        setName("Шестиугольник");
    }
    @Override
    public void call() {
        System.out.println("THIS IS HEXAGONAL");
    }

    @Override
    public String display() {
        return super.display();
    }
}
