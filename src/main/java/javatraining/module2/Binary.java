/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

@SuppressWarnings("all")
public class Binary {
    public static void main(String[] args) {
        int x = 4;           // 00000000000000000000000000000100
        int y = ~x;          // 11111111111111111111111111111011
        int z = x | 1;       // 00000000000000000000000000000101
        int t = x & 5  ;     // 00000000000000000000000000000100
        int u = x << 2;      // 00000000000000000000000000010000
        int v = x << 32;     // 00000000000000000000000000000100

        System.out.println(String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(z)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(t)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(u)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(v)).replace(' ', '0'));

    }
}
