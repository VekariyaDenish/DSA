package String;

//168. Excel Sheet Column Title

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(29);
    }
    static String convertToTitle(int columnNumber) {

        StringBuilder ans = new StringBuilder();


        while(columnNumber > 0){
            columnNumber--;
            ans.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }

        return ans.reverse().toString();


//        String result = "";
//
//        while (n > 0) {
//
//            n = n - 1;
//            int rem = n % 26;
//            char ch = (char)(65 + rem);
//            result = ch + result;
//            n = n / 26;
//
//        }
//
//        return result;
    }
}
