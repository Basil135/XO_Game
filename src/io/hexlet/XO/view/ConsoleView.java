package io.hexlet.XO.view;

import io.hexlet.XO.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ConsoleView {

    public void show(Game game) {

        Field field = game.getField();
        for (int i = 0; i < field.getSize(); i ++) {
            showRow(field, i);
            System.out.println();
            if (i < field.getSize() - 1) {separator();}
        }

    }

    public void move(Game game) {



    }

    private void askPoint() {}

    private void askCoordinate(final String coordinateName) {
        System.out.format("Please input coodinate %s: ", coordinateName);


    }

    private void showRow(Field field, int i) {
        for (int j = 0; j < field.getSize(); j++) {
            if (field.getFigure(new Point(i, j)) == null) {
                System.out.print("   ");
            }
            else {
                System.out.print(" ");
                System.out.print(field.getFigure(new Point(i, j)));
                System.out.print(" ");
            }
            if (j < field.getSize() - 1) {System.out.print("|");}
        }
    }

    private void separator() {
        System.out.println("-----------");
    }

}
