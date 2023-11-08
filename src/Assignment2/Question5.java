package Assignment2;

import java.util.Scanner;

//5- You will take number from the user Write a java program to print its factorial.
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Please Enter A Number: ");
        int Number = scanner.nextInt();

        calculateFactorial(Number);
    }

    public static void calculateFactorial(int number){
        int factorial=1;
        for (int i =1; i<=number; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
