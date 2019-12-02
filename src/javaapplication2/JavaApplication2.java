/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author kibat6204
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("***PRIME NUMBER GENERATOR***");
        System.out.print("How many numbers would you like to scan? -->");
        int numberOfNumbers = input.nextInt();
        numberOfNumbers = numberOfNumbers - 1;
        
        boolean trueFalse[] = new boolean[numberOfNumbers];
        int numbers[] = new int[numberOfNumbers];
        
        for(int i = 0; i<numberOfNumbers; i++)
        {
            trueFalse[i] = true;
        }
        
        for(int i = 0; i<numberOfNumbers; i++)
        {
            
        }
    }
    
}
