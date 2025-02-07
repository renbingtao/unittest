package org.example.algorithm.integer;

import org.example.algorithm.integer.helper.AlgorithCommonHelper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicates {

    @Test
    public void test() {

        int[] source = AlgorithCommonHelper.generateArray();
        System.out.println(Arrays.toString(source));

    }

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }

        int duplicateTimes = 0;
        int result = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            result++;
            if (nums[i] != nums[i + 1]) {
                duplicateTimes = 0;
            } else {
                duplicateTimes++;
                if (duplicateTimes > 1) {
                    result--;
                }
            }
        }

        return result;
    }

}
