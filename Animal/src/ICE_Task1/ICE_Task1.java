/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ICE_Task1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ICE_Task1 {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        Animal animal = new Animal();
        Bird brd = new Bird();
        Reptile rept = new Reptile();
        String whichAnimal;
        System.out.println("Please enter if you want to catalogue a bird or a reptile");
        whichAnimal = kb.nextLine();
        
        switch (whichAnimal){
            case "bird" : 
                System.out.println("Please enter which type of bird you want to catalougue");
                animal.setSpecies(kb.nextLine());
                System.out.println("Please enter the bird ID");
                animal.setIDTag(kb.nextInt());
                System.out.println("The ID of the bird is: "+animal.getIDTag() + "\n" + "The bird species is: " + animal.getSpecies());
                brd.input();
                brd.output(); break;
            case "reptile" :
                System.out.println("Please enter which type of reptile you want to catalougue");
                animal.setSpecies(kb.nextLine());
                System.out.println("Please enter the reptile ID");
                animal.setIDTag(kb.nextInt());
                System.out.println("The ID of the reptile is: "+animal.getIDTag() + "\n" + "The reptile species is: " + animal.getSpecies());
                rept.input();
                rept.output(); break;
             default : System.out.println("Enter the valid option - bird -reptile");break;
             
        }
        
        
       
    }
    
}
