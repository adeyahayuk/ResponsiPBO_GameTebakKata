import java.util.Scanner;

public class HardMode extends GameMode implements ScoreCalculator {

    public HardMode(String secretWord, String hint) {
        super(secretWord, hint, 5);
    }

    @Override
    public void playTurn(Scanner scanner) {
        System.out.println("\n=== MODE SULIT ===");
        super.showStatus();

        System.out.print("Masukkan tebakan 5 huruf: ");
        String guess = scanner.nextLine().trim().toUpperCase();

        if (!isGuessValid(guess)) {
            System.out.println("Tebakan harus terdiri dari 5 huruf.");
        } else {
            System.out.println(createFeedback(guess));

            if (guess.equals(getSecretWord())) {
                setWon(true);
                System.out.println("Tebakan kamu benar!");
            } else {
                reduceAttempt();
                System.out.println("Tebakan belum benar.");
            }
        }
    }

    @Override
    public int calculateScore() {
        if (!isWon()) {
            return 0;
        }

        return (getAttemptsLeft() * 15) + 30;
    }
}