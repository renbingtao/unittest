package org.example.algorithm.integer.helper;

import java.util.ArrayList;
import java.util.Random;

public class AlgorithCommonHelper {

    public static int[] generateArray() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            intList.add(new Random().nextInt(1000));
        }
        int[] result = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            result[i] = intList.get(i);
        }
        return result;
    }

}
