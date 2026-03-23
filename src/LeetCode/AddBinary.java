package LeetCode;

//67. Add Binary

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));

    }
    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                if (a.charAt(i) == '1') sum += 1;
                i--;
            }

            if (j >= 0) {
                if (b.charAt(j) == '1') sum += 1;
                j--;
            }

            if (sum == 0) {
                sb.append('0');
                carry = 0;
            } else if (sum == 1) {
                sb.append('1');
                carry = 0;
            } else if (sum == 2) {
                sb.append('0');
                carry = 1;
            } else { // sum == 3
                sb.append('1');
                carry = 1;
            }
        }

        return sb.reverse().toString();
//
//        for (int i = a.length()-1; i >=0; i--) {
//            for (int j = b.length()-1;j  >= 0; j--) {
//                if(a.charAt(i) == '1' && b.charAt(j) == '1'){
//                    sb.append('0');
//                } else if ((a.charAt(i) == '1' || a.charAt(i) =='0') && (b.charAt(j) == '0' || b.charAt(j) == '1')) {
//                    sb.append('1');
//                } else if (a.charAt(i) == '0' && b.charAt(j) == '0'){
//                    sb.append('0');
//                }
//            }
//        }
//        return sb.reverse().toString();
    }
}
