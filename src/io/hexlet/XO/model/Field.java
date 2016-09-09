package io.hexlet.XO.model;

public class Field {

    private int size = 3;
    final private Figure[][] field = new Figure[size][size];

    public Field(final int size) {

        this.size = size;

    }

    public Field() {}

    public int getSize() {

        return this.size;

    }

    public Figure getFigure(final Point point) {

        Figure figure;
        figure = field[point.getX()][point.getY()];
        return figure;

    }

    public void setFigure(final Point point, final Figure figure) {

        field[point.getX()][point.getY()] = figure;

    }

}
