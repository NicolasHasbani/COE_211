package expense;

import java.io.*;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string
      
        Scanner scan = new Scanner(System.in);
	FileWriter flw = new FileWriter(new File("expenses.txt"));
        PrintWriter prw = new PrintWriter(flw);
        
        String answer;
        
        do{
        System.out.println("Input your name: ");
        String name = scan.nextLine();
        
        System.out.println("What did you purchase?");
        String item = scan.nextLine();
        
        System.out.println("How much did you pay? (in USD)");
        double price = scan.nextDouble();
        scan.nextLine();
 
        prw.print(name + " purchased " + item + " for " + price + " US Dollars.\n");
        
        System.out.println("Would you like to log another purchase? (y/n)");
        answer = scan.nextLine();
        
        }
        while(answer.equals("y"));
        prw.close();
        scan.close();
                
        System.out.println("Get off of ZoodMall!");
  }
}
