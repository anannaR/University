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
public class Community {
    private  String dept;
    private   String institute;
    public void setD(String a){
        dept=a;
    }
    public void setI(String a){
        institute=a;
    }
    public void view(){
        System.out.println("dept "+dept);
        System.out.println("institute "+institute);
    }
}
