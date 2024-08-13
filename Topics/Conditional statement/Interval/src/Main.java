import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();

        boolean inInterval = (number > -15 && number <= 12) ||
                (number > 14 && number < 17) ||
                (number >= 19);

        if (inInterval) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}