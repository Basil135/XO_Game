package io.hexlet.XO.controller;

import io.hexlet.XO.model.*;

public class WinnerController {

    public Figure checkWinner(final Field field) {

        for (int i = 0; i < field.getSize(); i++) {
            if (check(field, new Point(i, 0), new INextPoint() {
                @Override
                public Point nextPoint(Point point) {
                    return new Point(point.getX(), point.getY() + 1);
                }
            })) {return field.getFigure(new Point(i, 0));}
        }

        for (int i = 0; i < field.getSize(); i++) {
            if (check(field, new Point(0, i), new INextPoint() {
                @Override
                public Point nextPoint(Point point) {
                    return new Point(point.getX() + 1, point.getY());
                }
            })) {return field.getFigure(new Point(0, i));}
        }

        if (check(field, new Point(0, 0), new INextPoint() {
            @Override
            public Point nextPoint(Point point) {
                return new Point(point.getX() + 1, point.getY() + 1);
            }
        })) {return field.getFigure(new Point(0, 0));}

        if (check(field, new Point(0, 2), new INextPoint() {
            @Override
            public Point nextPoint(Point point) {
                return new Point(point.getX() + 1, point.getY() - 1);
            }
        })) {return field.getFigure(new Point(0, 2));}

        return null;

    }

    private boolean check(Field field, Point startPoint, INextPoint nextPoint) {

        Point p1 = startPoint;
        Point p2 = nextPoint.nextPoint(p1);
        Point p3 = nextPoint.nextPoint(p2);

        if (field.getFigure(p1) == null) {return false;}
        if (field.getFigure(p1) == field.getFigure(p2) && field.getFigure(p2) == field.getFigure(p3)) {return true;}

        return false;

    }

    private interface INextPoint {

        Point nextPoint(final Point point);

    }

}