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
public class MethodOne {

    int height, width;

    MethodOne(int h, int w) {
        height = h;
        width = w;
    }

    MethodOne(MethodOne obp) {
        height = obp.height;
        width = obp.width;
    }

    void area() {
        System.out.println(height * width);
    }

}
