package FlowOfTheProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Year : ");
        int Year = sc.nextInt();

        if(Year %400 == 0 || Year %4 == 0 && Year %100 !=0 ){
            System.out.println(Year + " is Leap Year");
        }
        else {
            System.out.println(Year + " is Not Leap Year");
        }
    }
}
