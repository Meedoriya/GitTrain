package com.figures.quadrilateral;

public class ConvexQuadrilateral extends Quadrilateral {

    {
        setName("Выпуклый четырехугольник");
    }

    @Override
    public void call() {
        System.out.println("THIS IS CONVEX QUADRILATERAL");
    }

    @Override
    public String display() {
        return super.display();
    }
}
