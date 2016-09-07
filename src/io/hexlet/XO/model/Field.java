package io.hexlet.XO.model;

public class Field {

    private int size = 3;
    final private Figure[][] field = new Figure[size][size];

    public Field(final int size) {

        this.size = size;

    }

    public Field() {}

    public int getsize() {

        return this.size;

    }

    public Figure getfigure(Point point) {

        Figure figure;
        figure = field[point.getX()][point.getY()];
        return figure;

    }

    public void setfigure(Point point, Figure figure) {

        field[point.getX()][point.getY()] = figure;

    }

}
