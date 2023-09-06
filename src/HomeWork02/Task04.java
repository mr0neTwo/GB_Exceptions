package HomeWork02;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        boolean isValidInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!isValidInput){
            try {
                String userInput = scanner.nextLine();

                if (userInput.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя.");
                }

                System.out.println("Вы ввели: " + userInput);
                isValidInput = true;

            } catch (Exception e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }


    }


}
