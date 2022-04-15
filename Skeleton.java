/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skeleton;

import java.util.*;
/**
 *
 * @author Nick
 */
public class Skeleton {
    public static void main(String[] args) {
        // Initialize array of integers

        // for loop to get user input & store in array

        // for loop to iterate over the array & perform calculations

        // display output to user
        
     Scanner scan = new Scanner(System.in);

        int[] grades = new int[5];
        double att, mid;
        double assignment;
        double sum = 0;

        for (int i = 0 ; i < 5 ; i++) {
            
            System.out.print("Input the grade of assignment " + (i+1) + ": ");
            int grade = scan.nextInt();
            grades[i] = grade;
        }

        System.out.print("Input the number of attended labs: ");
        att = scan.nextInt();

        System.out.print("Input the midterm grade: ");
        mid = scan.nextInt();

        for (int j = 0; j <= 4 ; j++){
            sum += grades[j];
        }

        assignment = (sum/5.0)*0.3;
        
        att = (att/7.0)*100*0.05;
       
        mid *= 0.3;

        System.out.println("Assignment(30%): "+ assignment);
        System.out.println("Attendance(5%): "+ att);
        System.out.println("Midterm(30%): "+ mid);

    }
}