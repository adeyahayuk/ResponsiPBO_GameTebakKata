import java.util.Scanner;

public class EasyMode extends GameMode implements HintProvider, ScoreCalculator {
    private boolean hintUsed;

    public EasyMode(String secretWord, String hint) {
        super(secretWord, hint, 6);
        this.hintUsed = false;
    }

    @Override
    public void playTurn(Scanner scanner) {
        System.out.println("\n=== MODE MUDAH ===");
        super.showStatus();

        System.out.println("1. Tebak kata");
        System.out.println("2. Gunakan hint");
        System.out.print("Pilih menu: ");

        String choice = scanner.nextLine().trim();

        if (choice.equals("2")) {
            showHint();
        } else if (choice.equals("1")) {
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
        } else {
            System.out.println("Pilihan menu tidak tersedia.");
        }
    }

    @Override
    public void showHint() {
        if (!hintUsed) {
            System.out.println("Hint: " + getHint());
            this.hintUsed = true;
        } else {
            System.out.println("Hint sudah digunakan.");
        }
    }

    @Override
    public int calculateScore() {
        if (!isWon()) {
            return 0;
        }

        int score = getAttemptsLeft() * 10;

        if (!hintUsed) {
            score += 20;
        }

        return score;
    }

    public boolean isHintUsed() {
        return hintUsed;
    }

    public void setHintUsed(boolean hintUsed) {
        this.hintUsed = hintUsed;
    }
}