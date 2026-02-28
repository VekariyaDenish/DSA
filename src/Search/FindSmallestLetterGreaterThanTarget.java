package Search;


//744. Find Smallest Letter Greater Than Target

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'a'));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // If start goes past the end of the array, wrap around
        return letters[start % letters.length];
    }

}
