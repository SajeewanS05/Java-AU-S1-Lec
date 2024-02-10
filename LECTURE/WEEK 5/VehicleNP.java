import java.util.Random;
import java.util.Scanner;

public class VehicleNP {
    public static void main(String[] args) {
        String generatedPlateNumber = generatePlateNumber();
        System.out.println("Generated plate number: " + generatedPlateNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guessed plate number: ");
        String guessedPlateNumber = scanner.nextLine();

        if (generatedPlateNumber.equals(guessedPlateNumber)) {
            System.out.println("Congratulations! The plate numbers are the same.");
        } else {
            System.out.println("Sorry, the plate numbers are not the same.");
        }
    }

    public static String generatePlateNumber() {
        Random random = new Random();

        char alpha1 = (char) ('A' + random.nextInt('Z' - 'A' + 1));
        char alpha2 = (char) ('A' + random.nextInt('Z' - 'A' + 1));
        char alpha3 = (char) ('A' + random.nextInt('Z' - 'A' + 1));

        int digit1 = random.nextInt(10);
        int digit2 = random.nextInt(10);
        int digit3 = random.nextInt(10);
        int digit4 = random.nextInt(10);

        return "" + alpha1 + alpha2 + alpha3 + digit1 + digit2 + digit3 + digit4;
    }
}