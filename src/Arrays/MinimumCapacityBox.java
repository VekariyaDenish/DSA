package Arrays;

//3861. Minimum Capacity Box

public class MinimumCapacityBox {
    public static void main(String[] args) {

        int[] arr = {1,5,3,7};
        System.out.println(minimumIndex(arr,3));

    }
    static int minimumIndex(int[] capacity, int itemSize) {

        int minCapacity = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize && capacity[i] < minCapacity) {
                minCapacity = capacity[i];
                index = i;
            }
        }
        return index;
    }
}
