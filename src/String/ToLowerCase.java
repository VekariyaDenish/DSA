package String;

//709. To Lower Case

public class ToLowerCase {
    public static void main(String[] args) {
        String word = "WorLd";
        System.out.println(toLowerCase(word));
    }
    static String toLowerCase(String s) {

       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ch = (int)s.charAt(i);

            if(ch>=65 && ch<=90){
                  ch = ch+32;
                  char a = (char)ch;
                sb.append(a);
            }else{
                char b = (char)ch;
                sb.append(b);
            }
        }
        return sb.toString();
    }
}
