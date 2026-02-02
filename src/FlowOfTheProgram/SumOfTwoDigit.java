package FlowOfTheProgram;

import java.util.Scanner;

public class SumOfTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1 : ");
        int x = sc.nextInt();
        System.out.print("Number 2 : ");
        int y = sc.nextInt();

        int sum = x+y;

        System.out.println("Sum is : " + sum);

    }
}
