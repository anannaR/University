/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author user
 */
public class Teacher extends Faculty {
    private int noofcourse;
    private double weeklyhour;

    public Teacher(String de, String in, String n, String e, double s, double i, int fc, String d, int jy,int no,double wh) {
        super(de, in, n, e, s, i, fc, d, jy);
        noofcourse= no;
        weeklyhour= wh;
    }
     public void view(){
        super.view();
        System.out.println("no of course "+noofcourse+" "+"weekly hour "+weeklyhour);
    }
    
    
}
