package io.hexlet.XO.controller;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrentPlayerControllerTest {

    Figure testValue;

    Figure expectedValue;

    Figure actualValue;

    Field field = new Field();

    CurrentPlayerController currentPlayerController = new CurrentPlayerController();

    @Test
    public void checkMoveWhenFieldIsEmpty() throws Exception {

        testValue = Figure.X;

        expectedValue = testValue;

        actualValue = currentPlayerController.checkMove(field);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void checkMoveWhenOneFigureIsSet() throws Exception {

        field.setFigure(new Point(0, 0), Figure.X);

        testValue = Figure.O;

        expectedValue = testValue;

        actualValue = currentPlayerController.checkMove(field);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void checkMoveWhenTwoFigureIsSet() throws Exception {

        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.O);

        testValue = Figure.X;

        expectedValue = testValue;

        actualValue = currentPlayerController.checkMove(field);

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void checkMoveWhenFieldIsFull() throws Exception {

        field.setFigure(new Point(1, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(1, 2), Figure.O);
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(0, 1), Figure.O);
        field.setFigure(new Point(0, 2), Figure.O);
        field.setFigure(new Point(2, 0), Figure.X);
        field.setFigure(new Point(2, 1), Figure.O);
        field.setFigure(new Point(2, 2), Figure.X);


        actualValue = currentPlayerController.checkMove(field);

        assertNull(actualValue);

    }

}