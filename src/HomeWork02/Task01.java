package HomeWork02;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task01 {

    public static void main(String[] args) {
        float enteredValue = getValidFloatInput();
        System.out.println("Результат: " + enteredValue);
    }

    public static float getValidFloatInput() {
        float result = 0.0f;
        boolean isValidInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!isValidInput) {
            System.out.print("Введите дробное число (типа float): ");

            try {
                result = Float.parseFloat(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Повторите попытку");
            }
        }

        return result;
    }
}