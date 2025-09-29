package PROG6112_Question2;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("The cricketer name: ");
        String batsmanName = input.nextLine();
        
        System.out.print("Enter the stadium: ");
        String stadiumName = input.nextLine();
        
        System.out.print("Enter the total runs scored by " + batsmanName + " at " + stadiumName + ": ");
        int runsScored = input.nextInt();
        
        CricketRunsScored report = new CricketRunsScored(batsmanName, stadiumName, runsScored);
        
        System.out.println();
        report.printReport();
        
        input.close();
    }
    
}
