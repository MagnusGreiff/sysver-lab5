import java.util.Arrays;

class Game {
    private Frame[] frames;

    Game() {
        this.frames = new Frame[10];

        Arrays.setAll(this.frames, i -> new Frame());
    }

    Frame[] allFrames() {
        return this.frames;
    }

    void setScore(int[] score) {
        int count = 0;
        for (Frame frame : this.frames) {
            frame.setThrow(score[count]);
            frame.setThrow(score[count + 1]);
            count += 2;
        }
    }

    int getScore() {
        int score = 0;
        for (int i = 0; i < this.frames.length; i++) {
          if (this.frames[i].getThrowOne() == 10) {
              score += (10 + (this.frames[i + 1].getThrowScore()));
          } else {
            score += this.frames[i].getThrowScore();
          }
        }
        return score;
    }
}
// System.out.print()
