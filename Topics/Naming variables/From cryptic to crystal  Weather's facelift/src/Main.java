import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int t = scanner.nextInt();
        int h = scanner.nextInt();
        float w = scanner.nextFloat();
        boolean p = scanner.nextBoolean();

        // TODO: Refactor variable names and print the results
        System.out.println("temperature = " + t);
        System.out.println("humidity = " + h);
        System.out.println("windSpeed = " + w);
        System.out.println("isPrecipitating = " + p);

        scanner.close();
    }
}