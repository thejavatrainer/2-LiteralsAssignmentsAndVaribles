/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

public class Area {
    public static void main(String[] args) {
        long x = 1_000_000; // as of Java 7
        int y = 15;
        long area = x * y;
        System.out.println("area = " + area);
    }
}
