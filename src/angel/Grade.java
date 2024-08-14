
package angel;

import java.util.Scanner;

public class Grade {
    public static void getGrade (){
     Scanner input = new Scanner(System.in);
        String name;
        int Math,Science,English,Computer;
        double sum,ave;
        System.out.println("Marks");
        name = input.nextLine();
        System.out.print("Math: ");
        Math = input.nextInt();
        System.out.print("Science");
        Science = input.nextInt();
        System.out.print("English");
        English = input.nextInt();
        System.out.print("Computer");
        Computer = input.nextInt();
        
        System.out.print("Grade Datails: ");
        System.out.print("Name:"+name); 
        sum=Math+Science+English+Computer;
        float ave=sum/4;       
        System.out.print("\nTotal Marks:"+sum);
        System.out.print(String.format("Average:"+ave);
    }
}
