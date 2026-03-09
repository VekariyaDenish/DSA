package String;

//3697. Compute Decimal Representation

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputeDecimalRepresentation {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(decimalRepresentation(567)));

    }
    static int[] decimalRepresentation(int n) {

        int temp=1;
        List<Integer> list=new ArrayList<>();
        while(n!=0){
            int rem=n%10;
            if(rem!=0){
                list.add(rem*temp);
            }
            temp*=10;
            n/=10;
        }
        int [] ans=new int[list.size()];
        int count=0;
        for(int i=list.size()-1;i>=0;i--){
            ans[i]=list.get(count++);
        }
        return ans;


//        String str = String.valueOf(n);
//        int len = str.length();
//        int i = 0;
//        int [] ans = new int[len];
//        while (0<len){
//            int temp = (int)(str.charAt(i));
//           int power = (int) Math.pow(10,len-1);
//            int solution = temp*power;
//            ans[i] = solution;
//            len --;
//            i++;
//        }
//        return ans;
    }
}
