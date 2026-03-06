package String;

//1773. Count Items Matching a Rule

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingaRule {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();

//        list.add(new String[]{"phone", "blue", "pixel"},
//                new String[]{"computer", "silver", "lenovo"},
//                new String[]{"phone", "gold", "iphone"});

//       String[][] items = {{"phone","blue","pixel"},
//                           {"computer","silver","lenovo"},
//                           {"phone","gold","iphone"}};
//
//        for (int i = 0; i < items.length; i++) {
//            for (int j = 0; j < items[i].length; j++) {
//                list.add(Collections.singletonList(items[i][j]));
//            }
//        }


        System.out.println(countMatches(list ,"color","silver"));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index ;
        if(ruleKey.equals("type")){
            index  = 0;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        }
        else{
            index =2;
        }
        int count = 0;
        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)){
                count ++;
            }
        }
        return count ;
    }
}
