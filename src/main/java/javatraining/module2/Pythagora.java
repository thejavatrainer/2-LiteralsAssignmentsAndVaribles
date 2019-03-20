/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

public class Pythagora {
    public static void main(String[] args) {
        double ab, ac, bc;
        ab = 3.0;
        ac = 4;
        bc = Math.sqrt(ab * ab + Math.pow(ac, 2));
        System.out.println("bc = " + bc);
    }
}
