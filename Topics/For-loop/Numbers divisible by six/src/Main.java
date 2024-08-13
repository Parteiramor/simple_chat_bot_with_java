import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int numberOfElements = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < numberOfElements; i++ ) {
            int elements = scanner.nextInt();

            if (elements % 6 == 0) {
                sum += elements;
            }
        }
        System.out.println(sum);

        }
    }