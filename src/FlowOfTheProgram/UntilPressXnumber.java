package FlowOfTheProgram;

import java.util.Scanner;

public class UntilPressXnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i = 0;

        while (true){
            if(i!=x){
                System.out.println(i);
                i++;
            }
            else{
            break;
        }
    }
    }
}
