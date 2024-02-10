import java.util.Scanner;

public class Heat {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter the amount of water in kilograms: ");
        double mass = scanner.nextDouble();

        System.out.print("Enter the initial temperature in degrees Celsius: ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature in degrees Celsius: ");
        double finalTemperature = scanner.nextDouble();

        double energy = calculateHeatEnergy(mass, initialTemperature, finalTemperature);

        // Display the result
        System.out.printf("The energy needed to heat the water is %.2f joules.%n", energy);
    }

    public static double calculateHeatEnergy(double mass, double initialTemperature, double finalTemperature) {
        // Calculate energy using the formula Q = M * (finalTemp - initialTemp) * 4148
        return mass * (finalTemperature - initialTemperature) * 4184;
    }
}