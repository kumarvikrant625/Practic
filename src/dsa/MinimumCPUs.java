package dsa;

import java.util.*;

public class MinimumCPUs {

    public static void main(String[] args) {
        int[] startTime = {1, 2, 4, 6, 7, 10};
        int[] endTime = {2, 4, 6, 7, 10, 12};

        System.out.println(minimumCPUsNeeded(startTime, endTime));
    }

    public static int minimumCPUsNeeded(int[] startTime, int[] endTime) {
        int n = startTime.length;

        // Create a list of all events
        List<int[]> event1= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            event1.add(new int[]{startTime[i], 1}); // 1 means process starts
            event1.add(new int[]{endTime[i], -1});// -1 means process ends
        }

        // Sort events by time, if times are equal, end event (-1) should come before start event (1)
        Collections.sort(event1, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        int maxCPUs = 0;
        int currentCPUs = 0;

        // Traverse the events
        for (int[] event : event1) {
            currentCPUs += event[1];
            if (currentCPUs > maxCPUs) {
                maxCPUs = currentCPUs;
            }
        }
        return maxCPUs;
    }
}
