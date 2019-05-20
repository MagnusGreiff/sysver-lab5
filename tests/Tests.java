import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {


    @Test
    public void Frame() {
        Frame frame = new Frame();
        frame.setThrow(2);
        frame.setThrow(4);

        int throwOne = frame.getThrowOne();
        int throwTwo = frame.getThrowTwo();

        assertEquals(2, throwOne);
        assertEquals(4, throwTwo);
    }


    @Test
    public void FrameScore() {
        Frame frame = new Frame();
        frame.setThrow(2);
        frame.setThrow(4);

        int throwScore = frame.getThrowScore();
        assertEquals(6, throwScore);
    }


    @Test
    public void Game() {
        Game game = new Game();
        Frame[] allFrames = game.allFrames();
        assertEquals(10, allFrames.length);
    }


    @Test
    public void GameScore() {
        Game game = new Game();
        int[] score = {1, 5, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        game.setScore(score);
        int res = game.getScore();
        assertEquals(81, res);
    }
}