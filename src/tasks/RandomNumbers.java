/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class RandomNumbers {
    private final Scanner scanner; // Добавьте поле scanner

    public RandomNumbers(Scanner scanner) { // Измените конструктор
        this.scanner = scanner;
    }

    public void generateAndCalculateAverage() {
        // использовать поле scanner для ввода данных
        int[] numbers = new int[20];
        Random random = new Random();

        // Заполнение массива случайными четными числами
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(1000); // Генерируем случайное число до 1000
            } while (randomNumber % 2 != 0); // Проверяем, что число четное
            numbers[i] = randomNumber;
        }

       

        System.out.println("Сгенерированный массив из 20 случайных четных чисел: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
    }
}
