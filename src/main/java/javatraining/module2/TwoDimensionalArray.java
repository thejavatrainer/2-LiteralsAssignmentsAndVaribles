/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

@SuppressWarnings("all")
public class TwoDimensionalArray {
    public static void main(String[] args) {
        char twoD[][] = new char[][]{
                {'x', 'o', 'o'},
                {'o', 'x', 'o'},
                {'x', 'o', 'x'}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
