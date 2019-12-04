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
        int number  = 0;
        
        for(int i = 0; i<numberOfNumbers; i++)
        {
            trueFalse[i] = true;
        }
        
        for(int i = 0; i<numberOfNumbers; i++)
        {
            numbers[i] = number;
            number = number+1;
        }
        
        trueFalse[0] = false;
        trueFalse[1] = false;
        
        int index = 2;
        boolean repeat = true;
        int additionFactor;
        int lastNumber;
        while(repeat == true)
        {
            if(trueFalse[index] == false)
            {
                index = index+1;
            }
            else
            {
                additionFactor = numbers[index];
                lastNumber = numbers[index];
                boolean exit = false;
                
                while (exit == false)
                {
                    try
                    {
                        lastNumber = lastNumber+additionFactor;
                        trueFalse[lastNumber] = false;
                        exit = false;
                    }
                    catch(Exception e)
                    {
                        exit = true;
                    }
                }
                
            }
        }
    }
    
}
