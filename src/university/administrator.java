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
public class administrator extends Faculty {
    private String position;
    private double duration;
    

    public administrator(String de, String in, String n, String e, double s, double i, int fc, String d, int jy,String pos,double dr) {
        super(de, in, n, e, s, i, fc, d, jy);
        position =pos;
        duration= dr;
    }
    public void view(){
        super.view();
        System.out.println("position "+position+" "+"duration "+duration);
    }
    
}
