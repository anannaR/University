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
public class Faculty extends Employee {
    private int Fcode;
    private String designation;
    private int joinyear;

    public Faculty(String de, String in, String n, String e, double s, double i,int fc,String d,int jy) {
        super(de, in, n, e, s, i);
        Fcode= fc;
        designation=d;
        joinyear=jy;
    }
     public void view(){
        super.view();
        System.out.println("facultycode "+Fcode+" "+"designation "+designation+" "+"joindyear "+joinyear);
        
    }

   
        
    
    
    
    
}
