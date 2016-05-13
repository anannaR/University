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
public class Alumny extends Community {
    private String name;
    private int PassYear;
    public Alumny(String de,String ins,String n,int py){
           super.setD(de);
        super.setI(ins);
        name=n;
       PassYear=py;
    }
     public void view(){
        super.view();
        System.out.println("name "+name+" "+"passed year "+PassYear);
    }
    
}
