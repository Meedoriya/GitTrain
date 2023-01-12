package com.figures;

import com.figures.quadrilateral.ConvexQuadrilateral;
import com.figures.quadrilateral.Quadrilateral;
import com.figures.triangle.EquilateralTriangle;
import com.figures.triangle.IsoscelesTriangle;
import com.figures.triangle.RightTriangle;
import com.figures.triangle.Triangle;

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

        Triangle triangle = new Triangle();
        System.out.println(triangle.display());
        triangle.display();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        System.out.println(equilateralTriangle.display());
        equilateralTriangle.call();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        System.out.println(isoscelesTriangle.display());
        isoscelesTriangle.call();

        RightTriangle rightTriangle = new RightTriangle();
        System.out.println(rightTriangle.display());
        rightTriangle.call();

        Quadrilateral quadrilateral = new Quadrilateral();
        System.out.println(quadrilateral.display());
        quadrilateral.call();

        ConvexQuadrilateral convexQuadrilateral = new ConvexQuadrilateral();
        System.out.println(convexQuadrilateral.display());
        convexQuadrilateral.call();
    }
}
