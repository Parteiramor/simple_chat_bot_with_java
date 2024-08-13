import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value

        // Read the number of Reese's peanut butter cups

        int numberOfCups = scanner.nextInt();

        // Read the boolean value for the weekend

        boolean isWeekend = scanner.nextBoolean();

        // Determine if the party is successful
        boolean isSuccessful;
        if (isWeekend) {
            // Weekend condition: 15 to 25 cups inclusive
            isSuccessful = numberOfCups >= 15 && numberOfCups <= 25;
        } else {
            // Weekday condition: 10 to 20 cups inclusive
            isSuccessful = numberOfCups >= 10 && numberOfCups <= 20;
        }

        // Print the result
        System.out.println(isSuccessful);

        scanner.close();

    }
}