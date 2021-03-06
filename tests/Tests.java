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


    @Test
    public void Strike() {
        Game game = new Game();
        int[] score = {10, 0, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        game.setScore(score);
        int res = game.getScore();
        assertEquals(94, res);
    }


    @Test
    public void Spare() {
        Game game = new Game();
        int[] score = {1, 9, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        game.setScore(score);
        int res = game.getScore();
        assertEquals(88, res);
    }


    @Test
    public void StrikeAndSpare() {
        Game game = new Game();
        int[] score = {10, 0, 4, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        game.setScore(score);
        int res = game.getScore();
        assertEquals(103, res);
    }


    @Test
    public void MultipleStrikes() {
        Game game = new Game();
        int[] score = {10, 0, 10, 0, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6,};
        game.setScore(score);
        int res = game.getScore();
        assertEquals(112, res);
    }


    @Test
    public void MultipleSpares() {
        Game game = new Game();
        int[] score = {8, 2, 5, 5, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 6};
        game.setScore(score);
        int res = game.getScore();
        assertEquals(98, res);
    }


    @Test
    public void SpareLastFrame() {
        Game game = new Game();
        int[] score = {1, 5, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 8};
        int[] bonus = {7};
        game.setScore(score);
        game.setBonus(bonus);
        int res = game.getScore();
        assertEquals(90, res);
    }


    @Test
    public void StrikeLastFrame() {
        Game game = new Game();
        int[] score = {1, 5, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 10, 0};
        int[] bonus = {7, 2};
        game.setScore(score);
        game.setBonus(bonus);
        int res = game.getScore();
        assertEquals(92, res);
    }


    @Test
    public void StrikeBonus() {
        Game game = new Game();
        int[] score = {1, 5, 3, 6, 7, 2, 3, 6, 4, 4, 5, 3, 3, 3, 4, 5, 8, 1, 2, 8};
        int[] bonus = {10};
        game.setScore(score);
        game.setBonus(bonus);
        int res = game.getScore();
        assertEquals(93, res);
    }


    @Test
    public void BestScore() {
        Game game = new Game();
        int[] score = {10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        int[] bonus = {10, 10};
        game.setScore(score);
        game.setBonus(bonus);
        int res = game.getScore();
        assertEquals(300, res);
    }


    @Test
    public void RealGame() {
        Game game = new Game();
        int[] score = {6, 3, 7, 1, 8, 2, 7, 2, 10, 0, 6, 2, 7, 3, 10, 0, 8, 0, 7, 3};
        int[] bonus = {10};
        game.setScore(score);
        game.setBonus(bonus);
        int res = game.getScore();
        assertEquals(135, res);
    }
}