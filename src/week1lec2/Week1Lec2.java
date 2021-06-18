/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1lec2;
//absoulte path
import myjava.mylang.MyMath;

//relative path - will include all files from mylang package
//import myjava.mylang.*;

import javax.swing.JOptionPane;
/**
 * 
 * @author User
 * @version 1.0
 */
public class Week1Lec2 {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        double num1 = Double.valueOf
        (JOptionPane.showInputDialog("Input a number to find cube"));
         JOptionPane.showMessageDialog(null, "cube of "+ num1+" is "+
                 MyMath.cube(num1));
         
         //non-static method
         int num = Integer.parseInt(JOptionPane.showInputDialog
        ("Input a number to reverse"));
         
        MyMath obj = new MyMath();
        JOptionPane.showMessageDialog(null,
                "Reverse of "+num+" is "+obj.reverse(num));
        
        double n1 = Double.valueOf
        (JOptionPane.showInputDialog("num1"));
        double n2 = Double.valueOf
        (JOptionPane.showInputDialog("num2"));      
         double n3 = Double.valueOf
        (JOptionPane.showInputDialog("num3"));      
         double n4 = Double.valueOf
        (JOptionPane.showInputDialog("num4"));  
         JOptionPane.showConfirmDialog(null, "Max all of out is " + 
                 MyMath.max4(n1,n2, n3, n4));
        
        
    }
    
}
