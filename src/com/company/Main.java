package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("C:\\Users\\NOYAN\\Desktop\\Java\\Assignment1\\file1.txt"));
        Scanner sc2 = new Scanner(new File("C:\\Users\\NOYAN\\Desktop\\Java\\Assignment1\\file2.txt"));
        Shape point = new Shape();
        while(sc1.hasNextLine()) {
            int x, y;
            x = sc1.nextInt();
            y = sc1.nextInt();
            point.addPoint(new Point(x, y));
        }
        point.findDistances();
        System.out.println("PerimeterOfShape = " + point.calculatePerimeter() + "\nLongestSide = " + point.LongestSide() + "\nAverageLength = " + point.AverageLength());
        //Rounded output: System.out.printf("PerimeterOfShape = %.2f, LongestSide = %.2f, AverageLength = %.2f", point.calculatePerimeter(), point.LongestSide(), point.AverageSide());
    }
}

