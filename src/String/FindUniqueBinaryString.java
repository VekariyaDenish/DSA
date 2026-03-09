package String;

//1980. Find Unique Binary String

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        String [] s = {"10","01"};
        System.out.println(findDifferentBinaryString(s));

    }
    static String findDifferentBinaryString(String[] nums) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            char ch = nums[i].charAt(i);

            sb.append(ch == '0' ? '1' : '0');

        }
        return sb.toString();

        //condition ? value_if_true : value_if_false

        //also write as
        //if (condition) {
        //    return value_if_true;
        //} else {
        //    return value_if_false;
        //}
    }
}
