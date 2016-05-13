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
public class Student extends Community{
    
    private String name;
    private String StudentID;
    private String status;
    public Student(String dp,String ins,String n,String SI,String st){
         super.setD(dp);
        super.setI(ins);
        name=n;
        StudentID=SI;
        status=st;
       
        
        
    }
     public void view(){
        super.view();
        System.out.println("name "+name+" "+"StdID "+StudentID+" "+"status "+status);
    }
    
    
}
