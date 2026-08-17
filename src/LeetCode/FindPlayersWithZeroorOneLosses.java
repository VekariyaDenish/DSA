package LeetCode;

//2225. Find Players With Zero or One Losses

import java.util.ArrayList;
import java.util.*;

public class FindPlayersWithZeroorOneLosses {
    public static void main(String[] args) {

    }
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];
        Arrays.fill(losses, -1);

        for (int[] match : matches) {

            int winner = match[0];
            int loser = match[1];

            if (losses[winner] == -1)
                losses[winner] = 0;

            if (losses[loser] == -1)
                losses[loser] = 1;
            else
                losses[loser]++;
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int i = 1; i < losses.length; i++) {

            if (losses[i] == 0)
                zeroLoss.add(i);

            else if (losses[i] == 1)
                oneLoss.add(i);
        }

        return Arrays.asList(zeroLoss, oneLoss);
    }


    // 2nd approach --> time complexity is more

    static List<List<Integer>> findWinners2(int[][] matches) {
        Map<Integer, Integer> lost = new HashMap<>();

        for (int[] it : matches) {
            int lose = it[1];
            lost.put(lose, lost.getOrDefault(lose, 0) + 1);
        }

        List<Integer> notLost = new ArrayList<>();
        List<Integer> oneLos = new ArrayList<>();

        for (int[] it : matches) {
            int lose = it[1];
            int win = it[0];

            if (lost.get(lose) == 1) {
                oneLos.add(lose);
            }
            if (!lost.containsKey(win)) {
                notLost.add(win);
                lost.put(win, 2);
            }
        }

        Collections.sort(notLost);
        Collections.sort(oneLos);

        return Arrays.asList(notLost, oneLos);
    }

}
