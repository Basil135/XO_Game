package io.hexlet.XO.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void getName() throws Exception {

        Player player = new Player("Basil", null);

        String expectedValue = "Basil";
        String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void getFigure() throws Exception {

        Player player = new Player(null, Figure.X);

        Figure expectedValue = Figure.X;
        Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);

        Player player1 = new Player(null, Figure.O);

        expectedValue = Figure.O;
        actualValue = player1.getFigure();

        assertEquals(expectedValue, actualValue);
    }

}