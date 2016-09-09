package io.hexlet.XO.controller;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Point;
import org.junit.Test;

import static io.hexlet.XO.model.Figure.*;
import static org.junit.Assert.*;

public class WinnerControllerTest {
    @Test
    public void checkWinnerWhenXIsWinInRow() throws Exception {

        Field field = new Field();

        for (int j = 0; j < field.getSize(); j++) {
            field = new Field();
            Figure testFigure;
            Figure expectedFigure;
            Figure actualFigure;

            testFigure = Figure.X;
            expectedFigure = testFigure;

            WinnerController winnerController = new WinnerController();

            for (int i = 0; i < field.getSize(); i++) {
                field.setFigure(new Point(j, i), testFigure);
            }

            actualFigure = winnerController.checkWinner(field);

            assertEquals(expectedFigure, actualFigure);
        }
    }

    @Test
    public void checkWinnerWhenOIsWinInRow() throws Exception {
        Field field = new Field();

        for (int j = 0; j < field.getSize(); j++) {
            field = new Field();
            Figure testFigure;
            Figure expectedFigure;
            Figure actualFigure;

            testFigure = Figure.O;
            expectedFigure = testFigure;

            WinnerController winnerController = new WinnerController();

            for (int i = 0; i < field.getSize(); i++) {
                field.setFigure(new Point(j, i), testFigure);
            }

            actualFigure = winnerController.checkWinner(field);

            assertEquals(expectedFigure, actualFigure);
        }
    }

    @Test
    public void checkWinnerWhenXIsWinInCol() throws Exception {
        Field field = new Field();

        for (int j = 0; j < field.getSize(); j++) {
            field = new Field();
            Figure testFigure;
            Figure expectedFigure;
            Figure actualFigure;

            testFigure = Figure.X;
            expectedFigure = testFigure;

            WinnerController winnerController = new WinnerController();

            for (int i = 0; i < field.getSize(); i++) {
                field.setFigure(new Point(i, j), testFigure);
            }

            actualFigure = winnerController.checkWinner(field);

            assertEquals(expectedFigure, actualFigure);
        }
    }

    @Test
    public void checkWinnerWhenOIsWinInCol() throws Exception {
        Field field = new Field();

        for (int j = 0; j < field.getSize(); j++) {
            field = new Field();
            Figure testFigure;
            Figure expectedFigure;
            Figure actualFigure;

            testFigure = Figure.O;
            expectedFigure = testFigure;

            WinnerController winnerController = new WinnerController();

            for (int i = 0; i < field.getSize(); i++) {
                field.setFigure(new Point(i, j), testFigure);
            }

            actualFigure = winnerController.checkWinner(field);

            assertEquals(expectedFigure, actualFigure);
        }
    }

    @Test
    public void checkWinnerWhenXInDiag1() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();

        Figure testFigure;
        Figure expectedFigure;
        Figure actualFigure;

        testFigure = Figure.X;
        expectedFigure = testFigure;

        for (int i = 0; i < field.getSize(); i++) {
                field.setFigure(new Point(i, i), testFigure);
        }

        actualFigure = winnerController.checkWinner(field);

        assertEquals(expectedFigure, actualFigure);
    }

    @Test
    public void checkWinnerWhenOInDiag1() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();

        Figure testFigure;
        Figure expectedFigure;
        Figure actualFigure;

        testFigure = Figure.O;
        expectedFigure = testFigure;

        for (int i = 0; i < field.getSize(); i++) {
            field.setFigure(new Point(i, i), testFigure);
        }

        actualFigure = winnerController.checkWinner(field);

        assertEquals(expectedFigure, actualFigure);
    }

    @Test
    public void checkWinnerWhenXInDiag2() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();

        Figure testFigure;
        Figure expectedFigure;
        Figure actualFigure;

        testFigure = Figure.X;
        expectedFigure = testFigure;

        for (int i = 0; i < field.getSize(); i++) {
            field.setFigure(new Point(i, (field.getSize() - (i + 1))), testFigure);
        }

        actualFigure = winnerController.checkWinner(field);

        assertEquals(expectedFigure, actualFigure);
    }

    @Test
    public void checkWinnerWhenOInDiag2() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();

        Figure testFigure;
        Figure expectedFigure;
        Figure actualFigure;

        testFigure = Figure.O;
        expectedFigure = testFigure;

        for (int i = 0; i < field.getSize(); i++) {
            field.setFigure(new Point(i, (field.getSize() - (i + 1))), testFigure);
        }

        actualFigure = winnerController.checkWinner(field);

        assertEquals(expectedFigure, actualFigure);
    }

    @Test
    public void checkWinnerWhenNoWinner() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();

        Figure actualFigure;

        field.setFigure(new Point(0, 1), Figure.X);
        field.setFigure(new Point(0, 1), Figure.X);
        field.setFigure(new Point(0, 1), Figure.O);

        actualFigure = winnerController.checkWinner(field);

        assertNull(actualFigure);
    }

}