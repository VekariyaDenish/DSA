package Extra;

import java.util.*;

public class CheckDuplicate {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 2, 4, 5, 1, 6};
        System.out.println(findDuplicates(arr));

    }
    static List<Integer> check(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {

            int j = i + 1;

            while (j < arr.length) {

                if (arr[i] == arr[j]) {
                    list.add(arr[i]);
                    break;
                }

                j++;
            }

            i++;
        }
        return list;
    }


    static List<Integer> check2(int [] arr){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                list.add(arr[i]);
            }
        }

        return list;
    }

    static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return new ArrayList<>(duplicates);
    }
}
