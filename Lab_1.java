import java.util.Scanner;

public class Lab_1 {
    // Функція отримання даних користувача:
    public static int user_input(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        if(input.hasNextInt()) return input.nextInt();
        return user_input("Некоректний ввід! Введіть ціле число: ");
    }

    public static void main(String[] args) {
        // Початкові дані за варіантом 1108:
        System.out.println("C2 = " + 1108 % 2 + " -> O1 = +");
        System.out.println("C3 = " + 1108 % 3 + " -> C = 1, отже щоб уникнути ділення на 0, a повинне бути > -1");
        System.out.println("C5 = " + 1108 % 5 + " -> O2 = +");
        System.out.println("C7 = " + 1108 % 7 + " -> type int");
        int C = 1108 % 3;
        // Ввід даних:
        int a = user_input("Введіть ціле a > -1: ");
        if(a <= -1) a = user_input("Значення а повинне бути > 1! Ведіть інше a: ");
        int b = user_input("Введіть ціле b: ");
        int n = user_input("Введіть ціле n більше " + a + ": ");
        if(n < a) n = user_input("Значення n не може бути менше " + a + "! Введіть інше n: ");
        int m = user_input("Введіть ціле m більше " + b + ": ");
        if(m < b) m = user_input("Значення m не може бути менше " + b + "! Введіть інше m: ");
        // Обчислення:
        if(n < a || m < b) System.out.println("Результат: S = 0");
        else {
            float sum1, S = 0;
            for (int i = a; i <= n; i++) {
                sum1 = 0;
                for (int j = b; j <= m; j++) {
                    sum1 += ((float) i + j) / (i + C);
                }
                S += sum1;
            }
            System.out.println("Результат: S = " + S);
        }
    }
}
