/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc.sc.comp603;

import java.util.Scanner;

/**
 *
 * @author eh155
 */
public class QnALogIn {
       
    public static void main(String[] args) {
        String input = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("**QNA SYSTEM**");
        System.out.println("Teacher or Student Log in (T or S):");
        input = scan.nextLine();
        if (input.equals("T")|| input.equals("t"))
        {
            System.out.println("Teachers Login.");
            System.out.println("Enter Teacher Code:");
            int teacherCode = scan.nextInt();
        }
        else if (input.equals("S")|| input.equals("s"))
        {
               System.out.println("Students Login.");
               System.out.println("Enter Name");
                 String studentName = scan.nextLine();
                System.out.println("Enter class Code:");
            int classCode = scan.nextInt();
        }
        else 
        {
            System.out.println("Sorry incorrect input. Please try again.");
            System.out.println("Teacher or Student Log in (T or S):");
        }  
    }  
}
