/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentFibonacci;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Printer {

    public static void main(String[] args) {
        System.out.println("Enter the number of fibonacci position");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        Fibs print=new Fibs();
        System.out.println("Fibonacci Series :");
        int i;
        for (i = 0; i <position; i++) {
            System.out.print(print.fibonacciNum(i) + " ");
        }
    }
}


