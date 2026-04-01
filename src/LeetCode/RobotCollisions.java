package LeetCode;

//2751. Robot Collisions

import java.util.*;

public class RobotCollisions {
    public static void main(String[] args) {
        int [] position = {5,4,3,2,1};
        int [] health = {2,17,9,15,10};
        System.out.println(survivedRobotsHealths(position,health,"RRRRR"));
    }
    static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {

        int n = positions.length;
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) order[i] = i;
        Arrays.sort(order, (a, b) -> positions[a] - positions[b]);

        boolean[] dead = new boolean[n];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i : order) {
            if (directions.charAt(i) == 'R') {
                st.push(i);
            } else {
                while (!st.isEmpty() && directions.charAt(st.peek()) == 'R') {
                    int top = st.peek();
                    if (healths[top] > healths[i]) {
                        healths[top]--; dead[i] = true; break;
                    } else if (healths[top] < healths[i]) {
                        healths[i]--; dead[top] = true; st.pop();
                    } else {
                        dead[i] = dead[top] = true; st.pop(); break;
                    }
                }
                if (!dead[i]) st.push(i);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (!dead[i]) res.add(healths[i]);
        return res;


//        int n = positions.length;
//
//        // Step 1: Sort indices based on positions
//        Integer[] idx = new Integer[n];
//        for (int i = 0; i < n; i++) idx[i] = i;
//
//        Arrays.sort(idx, (a, b) -> positions[a] - positions[b]);
//
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i : idx) {
//            if (directions.charAt(i) == 'R') {
//                stack.push(i);
//            } else {
//                // 'L' robot
//                while (!stack.isEmpty() && health[i] > 0) {
//                    int j = stack.peek();
//
//                    if (health[j] < health[i]) {
//                        stack.pop();
//                        health[i]--;   // L survives, loses 1
//                        health[j] = 0;
//                    } else if (health[j] > health[i]) {
//                        health[j]--;   // R survives
//                        health[i] = 0;
//                    } else {
//                        // equal
//                        stack.pop();
//                        health[i] = 0;
//                        health[j] = 0;
//                    }
//                }
//            }
//        }
//
//        // Step 4: Collect survivors in original order
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (health[i] > 0) {
//                result.add(health[i]);
//            }
//        }
//
//        return result;
    }

//    int n = positions.length;
//
//    // Step 1: sort indices based on positions
//    Integer[] idx = new Integer[n];
//        for (int i = 0; i < n; i++) {
//        idx[i] = i;
//    }
//
//        Arrays.sort(idx, (a, b) -> positions[a] - positions[b]);
//
//    Stack<Integer> stack = new Stack<>();
//
//        for (int i : idx) {
//
//        if (directions.charAt(i) == 'R') {
//            stack.push(i);
//        } else {
//
//
//            while (!stack.isEmpty()) {
//
//                int j = stack.peek();
//
//
//                if (health[j] < health[i]) {
//                    stack.pop();
//                    health[i]--;   // L survives
//                } else if (health[j] > health[i]) {
//                    health[j]--;   // R survives
//                    break;
//                } else {
//                    // equal case
//                    stack.pop();
//                    health[i] = 0;
//                    break;
//                }
//            }
//        }
//    }
//
//
//    List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//        if (health[i] > 0) {
//            res.add(health[i]);
//        }
//    }
//
//        return res;
}
