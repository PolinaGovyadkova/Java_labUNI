package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Line{
    //a*x + b*y + c = 0 - line equalation
    public double a;
    public double b;
    public double c;

    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }
    public Line(int x1, int y1, int x2, int y2){
        this.a = (y2-y1);
        this.b = (x1-x2);
        this.c = (-x1*y2 + x2*y1);

        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(line.a, a) == 0 &&
                Double.compare(line.b, b) == 0 &&
                Double.compare(line.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}