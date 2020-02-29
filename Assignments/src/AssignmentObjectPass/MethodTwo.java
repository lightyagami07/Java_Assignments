/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentObjectPass;

/**
 *
 * @author User
 */
public class MethodTwo {

    int input1, input2;
}

    class SetInput {

        void setInput(MethodTwo mt, int in1, int in2) {
            mt.input1 = in1;
            mt.input2 = in2;
        }

        void getInput(MethodTwo mt) {
            System.out.println("Input one = " + mt.input1
                    + "\nInput two = " + mt.input2);
        }
    }


