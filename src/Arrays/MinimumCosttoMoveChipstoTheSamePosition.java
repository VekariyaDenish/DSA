package Arrays;


//1217. Minimum Cost to Move Chips to The Same Position

public class MinimumCosttoMoveChipstoTheSamePosition {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(minCostToMoveChips(arr));

    }
    static int minCostToMoveChips(int[] position) {
        int even = 0 , odd = 0;
        for ( int p : position) {
            if(p%2==0){
                even++;
            }else {
                odd ++;
            }
        }
        return Math.min(odd,even);
    }
}
