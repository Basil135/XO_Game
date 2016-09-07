package io.hexlet.XO.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void getPlayers() throws Exception {

        Player[] players = new Player[2];

        players[0] = new Player("Basil", Figure.X);
        players[1] = new Player("Vasya", Figure.O);

        Game game = new Game(players, null, null);

        Player[] inputValue = players;
        Player[] expectedValue = inputValue;
        Player[] actualValue = game.getPlayers();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getName() throws Exception {

        String inputValue = "XO";

        String expectedValue = inputValue;

        String actualValue;

        Game game = new Game(null, "XO", null);

        actualValue = game.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getField() throws Exception {

        Field inputValue;

        Field expectedValue;

        Field actualValue;

        Field field = new Field();

        Game game = new Game(null, null, field);

        inputValue = field;
        expectedValue = inputValue;
        actualValue = game.getField();

        assertEquals(expectedValue, actualValue);
    }

}