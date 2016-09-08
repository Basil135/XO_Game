package io.hexlet.XO.controller;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Point;
import io.hexlet.XO.model.exception.AlreadyPointExistException;
import io.hexlet.XO.model.exception.InvalidPointException;
import org.junit.Test;


public class MoveControllerTestException {
    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenXIsMoreMax() throws InvalidPointException,
                                                   AlreadyPointExistException {

        MoveController moveController = new MoveController();

        Field field = new Field();

        Figure testValue = Figure.X;

        Point point = new Point(3,0);

        moveController.applyFigure(field, point, testValue);

    }

    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenXIsLessZero() throws InvalidPointException,
                                                    AlreadyPointExistException {

        MoveController moveController = new MoveController();

        Field field = new Field();

        Figure testValue = Figure.X;

        Point point = new Point(-4,0);

        moveController.applyFigure(field, point, testValue);

    }

    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenYIsMoreMax() throws InvalidPointException,
                                                   AlreadyPointExistException {

        MoveController moveController = new MoveController();

        Field field = new Field();

        Figure testValue = Figure.X;

        Point point = new Point(0,3);

        moveController.applyFigure(field, point, testValue);

    }

    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenYIsLessZero() throws InvalidPointException,
                                                    AlreadyPointExistException {

        MoveController moveController = new MoveController();

        Field field = new Field();

        Figure testValue = Figure.X;

        Point point = new Point(0,-4);

        moveController.applyFigure(field, point, testValue);

    }

    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenXAndYAreMoreMax() throws InvalidPointException,
                                                        AlreadyPointExistException {

        MoveController moveController = new MoveController();

        Field field = new Field();

        Figure testValue = Figure.X;

        Point point = new Point(3,6);

        moveController.applyFigure(field, point, testValue);

    }

    @Test(expected = InvalidPointException.class)
    public void applyFigureWhenXAndYAreLessZero() throws InvalidPointException,
                                                         AlreadyPointExistException {

        MoveController moveController = new MoveController();

        Field field = new Field();

        Figure testValue = Figure.X;

        Point point = new Point(-1,-4);

        moveController.applyFigure(field, point, testValue);

    }

    @Test(expected = AlreadyPointExistException.class)
    public void applyFigureWhenFigureIsAlreadySet() throws InvalidPointException,
                                                           AlreadyPointExistException {

        MoveController moveController = new MoveController();

        Field field = new Field();

        Figure testValue = Figure.X;
        for (int i = 0; i < field.getsize(); i++) {

            checkRow(field, moveController, testValue, i);

        }


    }

    private void checkRow(Field field,
                          MoveController moveController,
                          Figure figure,
                          int i) throws InvalidPointException,
                                        AlreadyPointExistException {

        for (int j = 0; j < field.getsize(); j++) {

            Point point = new Point(i, j);

            field.setfigure(point, figure);

            moveController.applyFigure(field, point, figure);

        }
    }
}