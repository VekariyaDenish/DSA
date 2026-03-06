package String;

//1528. Shuffle String

public class ShuffleString {
    public static void main(String[] args) {
        int [] index = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",index));

    }
    static String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] a=new char[n];
        for(int i=0;i<n;i++){
            a[indices[i]]=s.charAt(i);
        }
        return new String(a);
    }
}
