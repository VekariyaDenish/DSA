package Arrays;

//1854. Maximum Population Year

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int [][] ans = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(ans));
    }
    static int maximumPopulation(int[][] logs) {
        // Step 1: Array for population changes (1950–2050)
        int[] pop = new int[2051];

        // Step 2: Mark birth and death changes
        for (int i = 0; i < logs.length; i++) {
            int birth = logs[i][0];
            int death = logs[i][1];

            pop[birth]++;   // person born
            pop[death]--;   // person dies (excluded)
        }

        // Step 3: Find year with maximum population
        int maxPopulation = 0;
        int currentPopulation = 0;
        int year = 1950;

        for (int y = 1950; y <= 2050; y++) {
            currentPopulation += pop[y];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                year = y;
            }
        }

        return year;

        //tried but only pass one case failed in other

//        int max = logs[0][0];
//        // for largest yr
//        for (int i = 0; i < logs.length; i++) {
//            for (int j = 0; j < logs[i].length; j++) {
//                if(max<logs[i][j]){
//                    max = logs[i][j];
//                }
//            }
//        }
//        int smallest = logs[0][0];
//        // for smallest
//        for (int i = 0; i < logs.length ; i++) {
//            for (int j = 0; j < logs[i].length; j++) {
//                if(smallest>logs[i][j]){
//                    smallest=logs[i][j];
//                }
//            }
//        }
//        int count =0;
//        int year = 0;
//
//            for (int i = 0; i < logs.length; i++) {
//                for (int j = 0; j < logs[i].length; j++) {
//                    if(logs[i][j]>smallest && max> logs[i][j]){
//                        count ++;
//                        year=smallest;
//                    }
//                }
//            }
//
//        return year;
    }

}
