public class Frame {

    private int[] score;
    private int currentThrow;


    public Frame() {
        this.score = new int[2];
        this.currentThrow = 0;
    }

    public void setThrow(int i) {
        this.score[currentThrow] = i;
        this.currentThrow++;
    }

    public int getThrowOne() {
        return this.score[0];
    }

    public int getThrowTwo() {
        return this.score[1];
    }

    public int getThrowScore() {
        return this.score[0] + this.score[1];
    }
}
