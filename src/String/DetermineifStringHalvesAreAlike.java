package String;

//1704. Determine if String Halves Are Alike

public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "Uo";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int count1 = 0;
        for (int i = 0; i <s.length()/2 ; i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count1 ++;
            }
        }

        int count2 = 0;
        for (int i = s.length()/2; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count2 ++;
            }
        }

        return count1 == count2;
    }
}
