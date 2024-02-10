import java.util.Random;

public class Coinflip {
    public static void main(String[] args) {
        Random rand = new Random();
        int numFlips = 1000000;
        int numHeads = 0;
        int numTails = 0;

        for (int i = 0; i < numFlips; i++) {
            int flip = rand.nextInt(2);
            if (flip == 0) {
                numHeads++;
            } else {
                numTails++;
            }
        }

        System.out.println("Number of heads: " + numHeads);
        System.out.println("Number of tails: " + numTails);
    }
}