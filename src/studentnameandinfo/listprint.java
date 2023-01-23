/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentnameandinfo;

/**
 *
 * @author Smit Dobariya
 */
public class listprint {
    public static void main(String[] args){
    // Store and print the student list
    Student[] list=new Student[3];
    Student s1=new Student();
    s1.setName("Smit");
    s1.setAge(21);
    
    Student s2=new Student();
    s2.setName("Smit");
    s2.setAge(21);
    
    Student s3=new Student();
    s3.setName("Smit");
    s3.setAge(21);
    
    list[0]=s1;
    list[1]=s2;
    list[2]=s3;
    
    for(int i=0; i<list.length; i++)
    {
    
     System.out.println(list[i].getName()+" "+list[i].getAge());
    }
    
    
    
    }
}