import java.util.Arrays;

class Game {
    private Frame[] frames;
    private int[] bonus;

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
          if (this.frames[i].getThrowOne() == 10) { // Strike
              if (i < (this.frames.length - 1)) {
                  if (this.frames[i + 1].getThrowOne() == 10) { // Second Strike
                      if ((i + 2) < (this.frames.length)) {
                          score += ((this.frames[i].getThrowScore() + this.frames[i + 1].getThrowScore()) + (this.frames[i + 2].getThrowOne()));
                      } else {
                          score += (this.frames[i].getThrowScore() + this.frames[i + 1].getThrowScore() +  this.bonus[0]);
                      }
                  } else {
                      score += (this.frames[i].getThrowScore() + (this.frames[i + 1].getThrowScore()));
                  }
              } else {
                  score += (this.frames[i].getThrowScore() + Arrays.stream(this.bonus).sum());
              }
          } else if (this.frames[i].getThrowScore() == 10) { // Spare
              if (i == (this.frames.length - 1)) { // If spare is last frame, give 7 bonus
                  score += (this.frames[i].getThrowScore() + Arrays.stream(this.bonus).sum());
              } else {
                  score += (this.frames[i].getThrowScore() + this.frames[i + 1].getThrowOne());
              }
          } else {
            score += this.frames[i].getThrowScore();
          }
        }
        return score;
    }

    void setBonus(int[] bonus) {
        this.bonus = bonus;
    }
}
// System.out.print()
