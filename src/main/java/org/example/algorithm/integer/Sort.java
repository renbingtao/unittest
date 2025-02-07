package org.example.algorithm.integer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sort {

    @Test
    public void test() {
        Integer[] source = generateArray();
        System.out.println(Arrays.toString(source));

        this.bubblesSort(source);
        System.out.println(Arrays.toString(source));
    }

    private Integer[] generateArray() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            intList.add(new Random().nextInt(1000));
        }
        return intList.toArray(new Integer[0]);
    }

    //冒泡
    private void bubblesSort(Integer[] ori) {
        if (ori == null || ori.length <= 1) {
            return;
        }
        for (int i = 0; i < ori.length - 1; i++) {
            for (int j = 0; j < ori.length - i - 1; j++) {
                if (ori[j] > ori[j + 1]) {
                    int tmp = ori[j];
                    ori[j] = ori[j + 1];
                    ori[j + 1] = tmp;
                }
            }
        }
    }

}
