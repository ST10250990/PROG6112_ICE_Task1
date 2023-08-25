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
 
public class Bird extends Animal {
   Scanner kb = new Scanner(System.in); 
   int birdColour ;
  
   @Override
    public void input(){
       System.out.println("Please enter the birds colour\n 1 -> grey \n 2 -> white \n 3 -> black");
       birdColour = kb.nextInt();
   }
    @Override
   public void output(){
       
        if (birdColour == 1) {
            System.out.println("Bird colour is grey");
        }else if (birdColour == 2){
            System.out.println("Bird colour is white");
        }else if (birdColour == 3){
            System.out.println("Bird colour is black");
        }
            

   } 
}
