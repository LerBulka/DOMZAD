/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class TemperaturConverter {
    private final Scanner scanner;

    public TemperaturConverter() {
        this.scanner = new Scanner(System.in);
    }
    
    public TemperaturConverter(Scanner scanner) {
        this.scanner = scanner;
    }
    public void doConvert() {
        boolean reapeat = true;
        do{
            System.out.println("Конвертор температуры ");
            System.out.println("Выберите направлние конвертации: ");
            System.out.println("0. закончить функцию конвертации ");
            System.out.print("1. целсий -> Фаренгейт ");
            System.out.print("2. фаренгейт -> целсий ");
            System.out.print("номер задачи: ");
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("выбран выход из конвертера температутры");
                    reapeat=false;
                    
                    break;
                case 1:
                    System.out.print("Введите температуру в градусах Цельсия: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("Температура в градусах Фаренгейта: " + fahrenheit);
                    
                    break;
                case 2:
                    System.out.print("Введите температуру в градусах Фаренгейта: ");
                    double fahrenheitInput = scanner.nextDouble();
                    double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);
                    System.out.println("Температура в градусах Цельсия: " + celsiusOutput);
                  
                    break;
                default:
                    System.out.println("выберите номер из списка");
                    
            }
            
        }while(reapeat);
    }

    private double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
    }

    private double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
    }

    private static class NumberParser {

        public NumberParser() {
        }
    }

}
