package io.hexlet.XO.controller;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Point;
import io.hexlet.XO.model.exception.AlreadyPointExistException;
import io.hexlet.XO.model.exception.InvalidPointException;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveControllerTest {
    @Test
    public void applyFigure() throws Exception {

        Field field = new Field();

        MoveController moveController = new MoveController();

        Figure testValue = Figure.X;

        for (int i = 0; i < field.getSize(); i++) {

            checkRow(field, moveController, i, testValue);

        }

        Field field1 = new Field();

        testValue = Figure.O;

        for (int i = 0; i < field1.getSize(); i++) {

            checkRow(field1, moveController, i, testValue);

        }

    }

    private void checkRow(Field field, MoveController moveController, int i, Figure testValue) throws InvalidPointException, AlreadyPointExistException {

        for (int j = 0; j < field.getSize(); j++) {

            Point point = new Point(i, j);

            Figure expectedValue = testValue;

            moveController.applyFigure(field, point, testValue);

            Figure actualValue = field.getFigure(point);

            assertEquals(expectedValue, actualValue);
        }

    }

}