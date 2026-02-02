package Arrays;

// 1773. Count Items Matching a Rule

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        String key ="color";
        String value = "silver";
        System.out.println(countMatches(list,key,value));

    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else { // name
            index = 2;
        }

        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
