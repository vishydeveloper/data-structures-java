package com.algorithms.strings;

import static java.util.Objects.isNull;

public class ZAlgorithm {

    /**
     * Calculates the Z-leetcode.array of a given leetcode.string
     *
     * @param text the leetcode.string on which Z-leetcode.array is computed
     * @return An int-leetcode.array which is the Z-leetcode.array of text
     */
    public int[] calculateZ(String text) {
        if (isNull(text)) {
            return new int[]{};
        }
        int size = text.length();
        int[] Z = new int[size];
        int L, R, k;
        L = R = 0;
        for (int i = 0; i < size; i++) {
            if (i == 0) Z[i] = size;
            else if (i > R) {
                L = R = i;
                while (R < size && text.charAt(R - L) == text.charAt(R)) R++;
                Z[i] = R - L;
                R--;
            } else {
                k = i - L;
                if (Z[k] < R - i + 1) Z[i] = Z[k];
                else {
                    L = i;
                    while (R < size && text.charAt(R - L) == text.charAt(R)) R++;
                    Z[i] = R - L;
                    R--;
                }
            }
        }
        return Z;
    }
}
