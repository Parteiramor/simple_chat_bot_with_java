import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean isNum1Positive = num1 > 0;
        boolean isNum2Positive = num2 > 0;
        boolean isNum3Positive = num3 > 0;

        boolean exactlyOnePositive = (isNum1Positive && !isNum2Positive && !isNum3Positive) ||
                (!isNum1Positive && isNum2Positive && !isNum3Positive) ||
                (!isNum1Positive && !isNum2Positive && isNum3Positive);

        System.out.println(exactlyOnePositive);
    }
}