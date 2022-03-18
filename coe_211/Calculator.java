package coe_211;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String enter;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        num1 = scanCalc.nextInt();
        
        System.out.println("Input an operator: ");
        enter = scanCalc.nextLine();
        operator = scanCalc.nextLine();
        
        System.out.println("Input the second number: ");
        num2 = scanCalc.nextInt();
        
       
        
        switch (operator){
            
            case "+":
                System.out.println(add(num1, num2));
                break;
            
            case "-":
                System.out.println(subtract(num1, num2));
                break;
                
            case "*":
                System.out.println(multiply(num1, num2));
                break;
                
            case "/":
                System.out.println(divide(num1, num2));
                break;
        }
        
    }     
                
        
    public String add(int a, int b){
        
        int sum = a + b;
        String str1 = (a + " + " + b + " = " + sum);
        return str1;
        
        }     

    public String subtract(int a, int b) {
        
        int diff = a - b;
        String str2 = (a + " - " + b + " = " + diff);
        return str2;
        
    }

    public String multiply(int a, int b) {
        
        int prod = a*b;
        String str3 = (a + " * " + b + " = " + prod);
        return str3;
        
    }

    public String divide(int a, int b) {
        
        int quot = a/b;
        String str4 = (a + " / " + b + " = " + quot);
        return str4;
    }
    
    

    
}
    


