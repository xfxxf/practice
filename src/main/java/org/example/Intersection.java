package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap1 = new HashMap<>();
        for (int num : nums1) {
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (countMap1.containsKey(num) && countMap1.get(num) > 0) {
                intersection.add(num);
                countMap1.put(num, countMap1.get(num) - 1);
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersect(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = intersect(nums3, nums4);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
