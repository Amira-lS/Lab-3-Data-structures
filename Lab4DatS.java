
package lab4dats;

import java.util.Scanner;


public class Lab4DatS {
static int numberOfRecursiveCalls = 0;
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Please enter two numbers;");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("GCD is: " + calculateGCD(number1, number2));
        System.out.println(numberOfRecursiveCalls);
    }

    public static int calculateGCD(int max, int min) {
        if (min != 0) {
            numberOfRecursiveCalls++;
            return calculateGCD(min, max % min);
        } else {
            return max;
        }
    }
}


    
