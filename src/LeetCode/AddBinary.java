package LeetCode;

//67. Add Binary

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));

    }
    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = a.length()-1; i >=0; i--) {
            for (int j = b.length()-1;j  >= 0; j--) {
                if(a.charAt(i) == '1' && b.charAt(j) == '1'){
                    sb.append('0');
                } else if ((a.charAt(i) == '1' || a.charAt(i) =='0') && (b.charAt(j) == '0' || b.charAt(j) == '1')) {
                    sb.append('1');
                } else if (a.charAt(i) == '0' && b.charAt(j) == '0'){
                    sb.append('0');
                }
            }
        }
        return sb.reverse().toString();
    }
}
