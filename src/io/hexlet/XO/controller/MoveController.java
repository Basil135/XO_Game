package io.hexlet.XO.controller;

import io.hexlet.XO.model.*;
import io.hexlet.XO.model.exception.AlreadyPointExistException;
import io.hexlet.XO.model.exception.InvalidPointException;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException, AlreadyPointExistException {

        if ((point.getX() < 0 || point.getX() >= field.getsize()) || (point.getY() < 0 || point.getY() > field.getsize())) {
            throw new InvalidPointException();
        }

        if (field.getfigure(point) != null) {
            throw new AlreadyPointExistException();
        }

        field.setfigure(point, figure);

    }

}
