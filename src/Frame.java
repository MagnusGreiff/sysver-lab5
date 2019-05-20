class Frame {

    private int[] score;
    private int currentThrow;


    Frame() {
        this.score = new int[2];
        this.currentThrow = 0;
    }

    void setThrow(int i) {
        this.score[currentThrow] = i;
        this.currentThrow++;
    }

    int getThrowOne() {
        return this.score[0];
    }

    int getThrowTwo() {
        return this.score[1];
    }

    int getThrowScore() {
        return this.score[0] + this.score[1];
    }
}
