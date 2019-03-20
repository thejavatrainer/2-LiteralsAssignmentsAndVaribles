/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

public class Conversion {
    public static void main(String[] args) {
        int a = 950;            // 00000000000000000000001110110110
        byte b = (byte) a;      // 10110110

        double d = 950.23;
        byte bb = (byte) d;

        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));

        System.out.println(b);
        System.out.println(bb);
    }
}
