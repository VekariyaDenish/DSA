package String;

//557. Reverse Words in a String III

public class ReverseWordinaStringIII {
    public static void main(String[] args) {
        String s = "Mr Ding";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int prev = 0, n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == ' ') {
                reverse(arr, prev, i - 1);
                prev = i + 1;
            }
        }
        reverse(arr, prev, n - 1);
        return String.valueOf(arr);
    }
    private static void reverse(char[] arr, int i, int j) {
        while(i < j) {
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }


//        StringBuilder sb = new StringBuilder();
//        String[] arr = s.split(" ");
//
//        String ch = "";
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = arr[i].length()-1; j >=0 ; j--) {
//                ch = ch + arr[i].charAt(j);
//            }
//            ch = ch + " ";
//            sb.append(ch);
//            ch = "";
//        }
//
//        String ans = sb.toString();
//        String newString = ans.trim();
//
//        return newString;

    }
}
