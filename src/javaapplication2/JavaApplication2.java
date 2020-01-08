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
    public static void factorialNumberGenerator()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("***FACTORIAL GENERATOR***");
        System.out.print("\nEnter a number -->");
        int factorial = input.nextInt();
        int lastNumber = 1;
        
        for(int i = 1; i<factorial; i++)
        {
            lastNumber = lastNumber * (i+1);
        }
        int output = lastNumber;
        System.out.println("\nfactorial = "+output);
    }
    
    public static void fibonacciNumberGenerator()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("***FIBONACCI GENERATOR***");
        System.out.println("\nEnter a term number -->");
        
        int length = input.nextInt();
        
        if(length == 1)
        {
            System.out.println("factorial term = 1");
        }
        else if(length == 2)
        {
            System.out.println("factorial term = 2");
        }
        else
        {
        int sequence[] = new int[length];
        
        sequence[0] = 0;
        sequence[1] = 1;
        
        for(int i = 2; i<=length-1; i++)
        {
            sequence[i] = sequence[i-2]+sequence[i-1];
        }
            System.out.println("factorial term = "+sequence[length-1]);
        }
    }
    public static void primeNumberGenerator() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("***PRIME NUMBER GENERATOR***");
        System.out.print("How many numbers would you like to scan? -->");
        boolean errorRepeat = true;
        
        while(errorRepeat == true)
        {
        try
        {
        int numberOfNumbers = input.nextInt();
        
        boolean trueFalse[] = new boolean[numberOfNumbers+1];
        int numbers[] = new int[numberOfNumbers+1];
        int number  = 0;
        
        for(int i = 0; i<numberOfNumbers+1; i++)
        {
            trueFalse[i] = true;
        }
        
        for(int i = 0; i<numberOfNumbers+1; i++)
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
            try
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
                        index = index+1;
                    }
                }
                
            }
            }
            catch(Exception e)
            {
                repeat = false;
            }
        }
        repeat = true;
        index = 0;
        while(repeat == true)
        {
            try
            {
            if(trueFalse[index] == true)
            {
                System.out.println(numbers[index]);
                index = index+1;
            }
            else
            {
                index = index+1;
            }
            }
            catch(Exception e)
            {
                repeat = false;
                errorRepeat = false;
            }
        }
        }
        catch(Exception e)
        {
            System.out.print("The number you have entered is too large or contains characters.  Try again -->");
            errorRepeat = true;
        }
        }
    }
    public static void main(String[] args){
        
        boolean repeat = true;
        
        Scanner input = new Scanner(System.in);
        
        while (repeat == true);
        {
        System.out.println("***NUMBER CALCULATOR***");
        System.out.println("\n1... Prime number generator");
        System.out.println("\n2... Factorial number generator");
        System.out.println("\n3... Fibonacci number generator");
        System.out.println("\n4... Exit");
        System.out.print("\nSelect program number-->");
        
        int selection = input.nextInt();
        
        if(selection == 1)
        {
            System.out.println("");
            primeNumberGenerator();
        }
        if(selection == 2)
        {
            System.out.println("");
            factorialNumberGenerator();
        }
        if(selection == 3)
        {
            System.out.println("");
            fibonacciNumberGenerator();
        }
        if(selection == 4)
        {
            repeat = false;
        }
        }
    }
}

