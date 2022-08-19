import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double res;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nВыберите действие (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '*' -> res = num1 * num2;
            case '/' -> res = num1 / num2;
            default -> {
                System.out.print("Вы выбрали не правильное действие!");
                return;
            }
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + res);
    }
}