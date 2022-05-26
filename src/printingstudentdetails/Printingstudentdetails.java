/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printingstudentdetails;

/**
 *
 * @author harno
 */
public class Printingstudentdetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student [] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(20);
        
        Student s2 = new Student();
        s2.setName("Joseph");
        s2.setAge(21);
        
        Student s3 = new Student ();
        s3.setName("Paul");
        s3.setAge(22);
        
        list[0] == 1;
        list[1] == 2;
        list[2] == 3;
        
        
        
        for (int i=0; i < list.length; )
            
            System.out.println(list[i].getName() + " " + list[i].getAge());
            System.out.println("Learn github operations");
        }
        
        
        
    }
    
}
