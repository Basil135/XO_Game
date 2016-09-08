package io.hexlet.XO.controller;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Point;

public class CurrentPlayerController {

    public Figure checkMove(Field field) {

        int countX = 0;

        int countO = 0;

        for (int i = 0; i < field.getsize(); i++) {

            checkRow(field, i, countX, countO);

        }

        if (countO < countX) {return Figure.O;}
        else {return Figure.X;}

    }

    private void checkRow(Field field, int i, int countX, int countO) {

        for (int j = 0; j < field.getsize(); j++) {

            if (field.getfigure(new Point(i, j)) == Figure.X) {countX++;}

            if (field.getfigure(new Point(i, j)) == Figure.O) {countO++;}

        }

    }

}
