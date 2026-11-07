import java.util.Scanner;

public abstract class GameMode {
    public static final int WORD_LENGTH = 5;

    private final String secretWord;
    private final String hint;
    private final int maxAttempts;

    private int attemptsLeft;
    private boolean won;

    public GameMode(String secretWord, String hint) {
        this(secretWord, hint, 6);
    }

    public GameMode(String secretWord, String hint, int maxAttempts) {
        this.secretWord = secretWord;
        this.hint = hint;
        this.maxAttempts = maxAttempts;
        this.attemptsLeft = maxAttempts;
        this.won = false;
    }

    public abstract void playTurn(Scanner scanner);

    public void showStatus() {
        System.out.println("Sisa kesempatan: " + attemptsLeft + "/" + maxAttempts);
    }

    protected boolean isGuessValid(String guess) {
        return guess.length() == WORD_LENGTH;
    }

    protected String createFeedback(String guess) {
        String feedback = "";

        for (int i = 0; i < WORD_LENGTH; i++) {
            char guessLetter = guess.charAt(i);
            char secretLetter = secretWord.charAt(i);

            if (guessLetter == secretLetter) {
                feedback += "[" + guessLetter + " 🟩] ";
            } else if (secretWord.indexOf(guessLetter) >= 0) {
                feedback += "[" + guessLetter + " 🟨] ";
            } else {
                feedback += "[" + guessLetter + " ⬜] ";
            }
        }

        return feedback;
    }

    protected void reduceAttempt() {
        this.attemptsLeft--;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public String getHint() {
        return hint;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public void setAttemptsLeft(int attemptsLeft) {
        this.attemptsLeft = attemptsLeft;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }
}