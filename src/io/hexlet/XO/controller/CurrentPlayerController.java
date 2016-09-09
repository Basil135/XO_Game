package io.hexlet.XO.controller;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Point;

public class CurrentPlayerController {

    private int countX = 0;

    private int countO = 0;

    public Figure checkMove(Field field) {

        for (int i = 0; i < field.getSize(); i++) {

            checkRow(field, i);

        }
        if (countX + countO == field.getSize() * field.getSize()) {return null;}
        if (countO < countX) {return Figure.O;}
        else {return Figure.X;}

    }

    public int getCountX() {

        return countX;

    }

    public int getCountO() {

        return countO;

    }

    private void checkRow(Field field, int i) {

        for (int j = 0; j < field.getSize(); j++) {

            if (field.getFigure(new Point(i, j)) == Figure.X) {countX++;}

            if (field.getFigure(new Point(i, j)) == Figure.O) {countO++;}

        }

    }

}
