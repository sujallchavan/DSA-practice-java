package Heap;

import java.util.Arrays;

public class TaskScheduler {
    public int leastInterval(char[] task, int n) {

        int[] freq = new int[26];

        for (char c : task) {
            freq[c - 'A']++;
        }

        // sort the frequency array to get the max frequency at the end
        Arrays.sort(freq);

        int maxFre = freq[25];
        int cnt = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == maxFre) {
                cnt++;
            } else {
                break;
            }
        }

        int part = (maxFre - 1) * (n + 1) + cnt;

        return Math.max(task.length, part);
    }

    public static void main(String[] args) {
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;

        TaskScheduler ob = new TaskScheduler();

        int result = ob.leastInterval(tasks, n);

        System.out.println("Minimum intervals needed: " + result);
    }
}
