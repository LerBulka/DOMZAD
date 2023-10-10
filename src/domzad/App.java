/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domzad;

import tasks.ArrayBooks;
import tasks.RandomNumbers;
import java.util.Scanner;
import tasks.TemperaturConverter;
import tasks.NumberParser;

/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        boolean repeat = true;
        do {
            System.out.println("Выберите задачу: ");
            System.out.println("0. закончить программу: ");
            System.out.println("1. конвертор температуры ");
            System.out.println("2. парсинг числа ");
            System.out.println("3. 20 случайных чисел ");
            System.out.println("4. Mассив книг ");
            System.out.print("Nомер задачи: ");
            int task = scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    TemperaturConverter temperaturConverter = new TemperaturConverter(scanner);
                    temperaturConverter.doConvert();
                    break;
                case 2:
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                case 3:
                    RandomNumbers randomNumbers = new RandomNumbers(scanner);
                    randomNumbers.generateAndCalculateAverage();
                    System.out.println("Нажмите Enter, чтобы продолжить...");
                    scanner.nextLine(); // Очистка буфера ввода
                    scanner.nextLine(); // Ожидание ввода пользователя
                    break;
                case 4:
                    ArrayBooks arrayBooks;
                    arrayBooks = new ArrayBooks();
                    arrayBooks.showBooks();      
                    break;
                default:
                    System.out.println("выберите номер из списка");
            }
        } while (repeat);
    }
}
    

