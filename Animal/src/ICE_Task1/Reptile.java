/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICE_Task1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Reptile extends Animal{
    
    double bloodTemp;
    Scanner kb = new Scanner(System.in);
    
      @Override
    public void input(){
          System.out.println("Please enter the reptiles blood Temperature");
          bloodTemp = kb.nextDouble();
   }
    @Override
   public void output(){
        System.out.println("The temperture of the crocodile is: " + bloodTemp);
   } 
}
