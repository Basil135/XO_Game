package io.hexlet.XO.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class FieldTest {
    @Test
    public void getsize() throws Exception {

        Field field = new Field();
        int testValue = 3;
        int expectedValue = testValue;
        int actualValue = field.getSize();
        assertEquals(expectedValue, actualValue);

        for (int i = 4; i < 100; i++) {
            Field field1 = new Field(i);
            testValue = i;
            expectedValue = testValue;
            actualValue = field1.getSize();
            assertEquals(expectedValue, actualValue);
        }

    }

    @Test
    public void getfigure() throws Exception {

        Field field = new Field();

        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                Point point = new Point(i, j);
                Figure actualFigure = field.getFigure(point);
                assertNull(actualFigure);
            }
        }

        for (int i = 0; i < field.getSize(); i++) {
            checkrow(field, i, Figure.X);
        }

        for (int i = 0; i < field.getSize(); i++) {
            checkrow(field, i, Figure.O);
        }
    }

    private void checkrow(Field field, int i, Figure figure) {
        for (int j = 0; j < field.getSize(); j++) {
            Point point = new Point(i, j);
            field.setFigure(point,figure);
            Figure expectedFigure = figure;
            Figure actualFigure = field.getFigure(point);
            assertEquals(expectedFigure, actualFigure);
        }
    }

}