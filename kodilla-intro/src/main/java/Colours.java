import java.util.Scanner;

public class Colours {
    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first letter of the colour: ");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "R": return "Red";
                case "B": return "Black";
                case "C": return "Cyan";
                case "V": return "Violet";
                case "G": return "Green";
                case "Y": return "Yellow";
                default:
                    System.out.println("No required colour in database! Try again!");
            }
        }
    }
}
