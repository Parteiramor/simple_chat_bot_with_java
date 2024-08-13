
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int countReady = 0;
        int countFixed = 0;
        int countRejects = 0;

        for (int i = 0; i < n; i++) {
            int parts = scanner.nextInt();
            if (parts == 0) {
                countReady++;
            } else if (parts == 1) {
                countFixed++;
            } else {
                countRejects++;
            }
        }

        System.out.println(countReady + " " + countFixed + " " + countRejects);
    }
}
