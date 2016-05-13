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
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("information of teacher");
        Community ob= new Teacher("CSE","Buet","a","1001",100000,2000,101,"teacher",3,4,5.0);
        ob.view();
        System.out.println("information of administrator");
        Community ob1= new administrator("CSE","Buet","a","1001",10000,3000,102,"administrator",7,"administrator",4);
        ob1.view();
    }
    
}
