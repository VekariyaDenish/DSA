package Search;


//278. First Bad Version


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start < end){
            int mid = start + (end -start)/2;

            if(isBadVersion(mid)){
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }

    static int bad = 4; // change this to test

    static boolean isBadVersion(int version) {
        return version >= bad;
    }

}
