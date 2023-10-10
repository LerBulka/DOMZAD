/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class NumbersArray {
    private final Scanner scanner;
    
    public NumbersArray(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void printResult() {
        System.out.println("Массив случайных чисел: ");
        int[] myArray = new int[20];
        int min = 0;
        int max = 0;
        int sum = 0;
        
        System.out.println("min = " + min);
        System.out.println("min = " + max);
        System.out.println("Среднеарифмитическое = " + sum);
                      
    }

  
}
