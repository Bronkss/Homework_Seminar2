package org.example.cw4;

import org.example.cw4.model.Vector;

public class Task4 {
    public static void main(String[] args) {
        Vector vector = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
        System.out.println(vector);
        System.out.println(vector2);
        System.out.println("длинна вектора = " + vector.lengthVector());
        System.out.println("скалярное произведение = " + vector.scalarMulti(vector2));
        System.out.println(vector.cosVector(vector2));
        System.out.println(vector.sumVector(vector2));
        System.out.println(vector.difVector(vector2));
    }
}
