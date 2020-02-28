/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentFibonacci;

/**
 *
 * @author User
 */
public class Fibs {

    public int fibonacciNum(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        }

        return fibonacciNum(num - 1) + fibonacciNum(num - 2);
    }

}
