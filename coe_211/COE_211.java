/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe_211;
import java.util.*;
/**
 *
 * @author Nick
 */
public class COE_211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Which service would you like to use?");
        System.out.println("[1]: Basic week visualizer");
        System.out.println("[2]: Advanced week visualizer");
        System.out.println("[3]: Basic calculator");
        System.out.println("[4]: Employee repertoire");
        
        String choice = scan.nextLine();
        
        switch(choice){
            case "1":
                BasicWeek basic = new BasicWeek();
                basic.printDays();
                break;
            
            case "2": 
                AdvancedWeek advanced = new AdvancedWeek();
                advanced.printDays();
                break;
                
            case "3":
                Calculator calc = new Calculator();
                break;
                    
                
            
            case "4":
  
                Employee emp = new Employee();
                System.out.println(emp.toString());
                break;
                
            default:
                System.out.println("Enter a number between 1 and 4");
        }
        
    }
    
}
