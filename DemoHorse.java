import java.util.Scanner;

public class DemoHorses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get data for a regular Horse
        System.out.println("Enter the name of the horse: ");
        String horseName = scanner.nextLine();
        System.out.println("Enter the color of the horse: ");
        String horseColor = scanner.nextLine();
        System.out.println("Enter the birth year of the horse: ");
        int horseBirthYear = scanner.nextInt();
        scanner.nextLine();

        Horse horse = new Horse(horseName, horseColor, horseBirthYear);

        // Display Horse details
        System.out.println("\nHorse Details: ");
        System.out.println("Name: " + horse.getName());
        System.out.println("Color: " + horse.getColor());
        System.out.println("Birth Year: " + horse.getBirthYear());

        // Get data for a RaceHorse
        System.out.println("\nEnter the name of the racehorse: ");
        String raceHorseName = scanner.nextLine();
        System.out.println("Enter the color of the racehorse: ");
        String raceHorseColor = scanner.nextLine();
        System.out.println("Enter the birth year of the racehorse: ");
        int raceHorseBirthYear = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline
        System.out.println("Enter the number of races the racehorse has competed in: ");
        int numberOfRaces = scanner.nextInt();

        RaceHorse raceHorse = new RaceHorse(raceHorseName, raceHorseColor, raceHorseBirthYear, numberOfRaces);

        // Display RaceHorse details
        System.out.println("\nRaceHorse Details: ");
        System.out.println("Name: " + raceHorse.getName());
        System.out.println("Color: " + raceHorse.getColor());
        System.out.println("Birth Year: " + raceHorse.getBirthYear());
        System.out.println("Number of Races: " + raceHorse.getNumberOfRaces());

        scanner.close();
    }
}
