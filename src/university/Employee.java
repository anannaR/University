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
public class Employee extends Community{
    private String name;
    private String EmployeeID;
    private double salary;
    private double increament;
   
    
    public Employee(String de,String in,String n,String e,double s,double i){
        super.setD(de);
        super.setI(in);
        name=n;
        EmployeeID=e;
        salary=s;
        increament=i;
        
        
    }
    public void view(){
        super.view();
        System.out.println("name "+name+" "+"employeeiD "+EmployeeID+" "+"salary "+salary+" "+"increament "+increament);
    }
    
}
