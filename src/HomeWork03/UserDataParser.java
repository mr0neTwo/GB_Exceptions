package HomeWork03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String input = getInput(scanner);

            String[] parts = input.split(" ");
            checkDataAmount(parts);

            String lastName = parts[0];
            String stringPhoneNumber = parts[3];

            checkPhoneNumber(stringPhoneNumber);
            writeData(input, lastName);

        } catch (NumberFormatException e) {
            System.err.println("Ошибка: Неверный формат номера телефона.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void checkDataAmount(String[] parts) throws Exception {
        if (parts.length != 4) {
            throw new Exception("Ошибка: Вы ввели неверное количество данных.");
        }
    }

    private static String getInput(Scanner scanner) {
        System.out.println("Введите Фамилию Имя Отчество и номер телефона, разделенные пробелом:");
        return scanner.nextLine();
    }

    private static void checkPhoneNumber(String stringPhoneNumber) throws Exception {
        long phoneNumber = Long.parseLong(stringPhoneNumber);
        if (phoneNumber < 7_000_000_00_00L || phoneNumber > 7_999_999_99_99L) {
            throw new Exception("Ошибка: Неверный формат номера телефона.");
        }
    }

    private static void writeData(String input, String lastName) throws IOException {
        String fileName = lastName + ".txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(input);
        writer.newLine();
        writer.close();

        System.out.println("Данные успешно записаны в файл: " + fileName);
    }
}

