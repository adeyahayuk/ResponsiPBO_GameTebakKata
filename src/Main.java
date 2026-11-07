import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("=================================");
        System.out.println("   TEBAK KATA BAHASA INDONESIA");
        System.out.println("=================================");

        while (playAgain) {
            int randomIndex = WordBank.getRandomIndex();

            String secretWord = WordBank.getWord(randomIndex);
            String hint = WordBank.getHint(randomIndex);

            String modeChoice = "";

            while (!modeChoice.equals("1") && !modeChoice.equals("2")) {
                System.out.println("\nPilih mode permainan:");
                System.out.println("1. Mode Mudah - 6 kesempatan dan 1 hint");
                System.out.println("2. Mode Sulit - 5 kesempatan tanpa hint");
                System.out.print("Pilihan: ");

                modeChoice = scanner.nextLine().trim();

                if (!modeChoice.equals("1") && !modeChoice.equals("2")) {
                    System.out.println("Pilihan hanya boleh 1 atau 2.");
                }
            }

            GameMode game;
            ScoreCalculator scoreCalculator;

            if (modeChoice.equals("1")) {
                EasyMode easyMode = new EasyMode(secretWord, hint);

                game = easyMode;
                scoreCalculator = easyMode;
            } else {
                HardMode hardMode = new HardMode(secretWord, hint);

                game = hardMode;
                scoreCalculator = hardMode;
            }

            while (game.getAttemptsLeft() > 0 && !game.isWon()) {
                game.playTurn(scanner);
            }

            System.out.println("\n=================================");

            if (game.isWon()) {
                System.out.println("Selamat! Kamu berhasil menebak kata.");
                System.out.println("Skor akhir: " + scoreCalculator.calculateScore());
            } else {
                System.out.println("Kesempatan habis.");
                System.out.println("Kata yang benar adalah: " + game.getSecretWord());
                System.out.println("Skor akhir: " + scoreCalculator.calculateScore());
            }

            System.out.println("=================================");

            System.out.print("Mau bermain lagi? (Y/N): ");
            String answer = scanner.nextLine().trim();

            playAgain = answer.equalsIgnoreCase("Y");
        }

        System.out.println("\nTerima kasih sudah bermain.");
        scanner.close();
    }
}