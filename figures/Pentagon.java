package com.figures;

public class Pentagon extends Figures {

    public Pentagon(int numberOfCorners) {
        super(numberOfCorners);
    }

    {
        setName("Пятиугольник");
    }
    @Override
    public void call() {
        System.out.println("THIS IS PENTAGON");
    }

    @Override
    public String display() {
        return super.display();
    }
}

