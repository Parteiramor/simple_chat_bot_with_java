import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        boolean triangle = A + B > C && A + C > B && B + C > A;

        if (triangle) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}