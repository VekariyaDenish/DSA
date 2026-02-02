package ConditionLoop;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Denish";
        int n = name.length();

        for (int i = n; i >0; i--) {
            System.out.print(name.charAt(i-1));
        }
    }
}
