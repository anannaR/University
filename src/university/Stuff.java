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
public class Stuff extends Employee{
    private int joinyear;
    int duration;

    public Stuff(String de, String in, String n, String e, double s, double i,int j,int d) {
        super(de, in, n, e, s, i);
        joinyear= j;
        duration =d;
    }
     public void view(){
        super.view();
        System.out.println("joinedYear "+joinyear+" "+"duration "+duration);
    }
    
}
