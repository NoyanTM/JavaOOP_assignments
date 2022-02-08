package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> Points;
    private ArrayList<Double> Distances;

    public Shape(){
        Distances = new ArrayList<>();
        Points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        Points.add(point);
    }

    public void findDistances() {
        Point prev = Points.get(Points.size() - 1);
        for (Point point : Points){
            Distances.add(point.distance(prev));
            prev = point;
        }
    }

    public double calculatePerimeter() {
        double res = 0;
        for (double point : Distances) {
            res += point;
        }
        return res;
    }

    public ArrayList<Point> getPoints() {
        return Points;
    }

    public double LongestSide() {
        double max = 0;
        for (double point : Distances) {
            max = Math.max(point, max);
        }
        return max;
    }

    public double AverageLength() {
        return this.calculatePerimeter() / Points.size();
    }
}

