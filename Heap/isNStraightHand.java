package Heap;

import java.util.TreeMap;

public class isNStraightHand {
    public boolean isNStraightHand1(int[] hand, int group) {

        if (hand.length % group != 0) {
            return true;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int h : hand) {
            map.put(h, map.getOrDefault(h, 0) + 1);
        }

        for (int h : map.keySet()) {
            int freq = map.get(h);
            if (freq == 0)
                continue;

            for (int curr = h; curr < h + group; curr++) {
                if (map.getOrDefault(curr, 0) > freq) {
                    return false;
                }

                map.put(curr, map.get(curr) - freq);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] hand = { 1, 2, 3, 4, 5 };

        int group = 3;

        isNStraightHand ob = new isNStraightHand();

        boolean flag = ob.isNStraightHand1(hand, group);

        if (flag) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
