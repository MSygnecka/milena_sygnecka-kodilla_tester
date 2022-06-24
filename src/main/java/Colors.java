import java.util.Scanner;
public class Colors {
    public static String getColors() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first letter of the color: ");
            String colors = scanner.nextLine().trim();
            if (colors.length() > 1) {
                return colors;
            }
            System.out.println("Name too long. Try again.");
        }
    }
    public static String colorSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color (W-white, B-blue, P-pink, R-red, G-green):");
            String colorSelected = scanner.nextLine().trim().toUpperCase();
            String result;
            switch (colorSelected) {
                case "W":
                    result = "white";
                    break;
                case "B":
                    result = "blue";
                    break;
                case "P":
                    result = "pink";
                    break;
                case "R":
                    result = "red";
                    break;
                case "G":
                    result = "green";
                    break;
                default: return "invalid abbreviation";
            }
            return result;
        }
    }
}