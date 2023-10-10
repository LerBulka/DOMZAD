/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domzad;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class DOMZAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        App app = new App(scanner);
        app.run();
    }
    
}
