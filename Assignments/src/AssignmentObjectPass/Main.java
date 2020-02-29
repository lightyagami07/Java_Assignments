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
public class Main {

    public static void main(String[] args) {
        MethodOne rectangle = new MethodOne(100, 10);
        MethodOne newrectangle = new MethodOne(rectangle);
        rectangle.area();
        newrectangle.area();
        
        MethodTwo data=new MethodTwo();
        SetInput in= new SetInput();
        in.setInput(data, 100, 10);
        in.getInput(data);
    }

}
