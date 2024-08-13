import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();

            if (element % 4 == 0 && element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }


}