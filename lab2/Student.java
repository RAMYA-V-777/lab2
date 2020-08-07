/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;
import java.util.Scanner;

class Stud{

    
    int m1,m2,m3,m4,m5;
    String status;
    int gradepoints;
    String lettergrade;
   
    void getmarks()
    {
     
       Scanner obj=new Scanner(System.in);
      System.out.println("Enter Mark-1");
       m1=obj.nextInt();
        System.out.println("Enter Mark-2");
       m2=obj.nextInt();
        System.out.println("Enter Mark-3");
       m3=obj.nextInt();
        System.out.println("Enter Mark-4");
       m4=obj.nextInt();
         System.out.println("Enter Mark-5");
        m5=obj.nextInt();
    }
    void caltotal()
    {
      double ave=((m1+m2+m3+m4+m5)/5);
        if((ave<=100)&&(ave>=91)){
              status="Outstanding";
               gradepoints=10;
                lettergrade="O";
      }         

     
       else if((ave<=90)&&(ave>=81))
       {
           status="Excellent";
           gradepoints=9;
           lettergrade="A+";
       } 
       else if(ave<=80&&ave>=71)
       {
           status="VeryGood";
           gradepoints=8;
           lettergrade="A";
       }  
       else if(ave<=70&&ave>=61)
       {
           status="Good";
           gradepoints=7;
           lettergrade="B+";
       }  
       else if((ave<=60)&&(ave>=51))
              {   
           status="Average";
           gradepoints=6;
           lettergrade="B";
               }  
       else if(ave<50)
               {
               status="Fail";
               gradepoints=0;
               lettergrade="RA";
               }
       
    }
    void displaygrade()
    {
       
         System.out.println("The student's marks system are:");
         System.out.println("Mark-1:"+m1);
         System.out.println("Mark-2:"+m2);
         System.out.println("Mark-3:"+m3);
          System.out.println("Mark-4:"+m4);
         System.out.println("Mark-5:"+m5);
         System.out.println("Total mark of the student:"+(m1+m2+m3+m4+m5));
        System.out.println("average mark of the student:"+(m1+m2+m3+m4+m5)/5);
     
              System.out.println("Status:"+status);
          System.out.println("Grade points:"+gradepoints);
          System.out.println("Letter Grade:"+lettergrade);
         
       
        
       
    }
        
}
/*
 *
 * @author velmurugan
 */
public class Student {
    public static void main(String[] args){
       
      Stud obj=new Stud();
    
         obj=new Stud();
         obj.getmarks();
         obj.caltotal();
         obj.displaygrade();
     }
        
    }
    

