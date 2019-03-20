/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

@SuppressWarnings("all")
public class Visibility {
    public static void main(String[] args) {
        int x = 10;                         // available in main method
        if (x == 10) {
            int y = 20;                     // available in if block
            x = y;
            System.out.println("x = " + x); // x = 20
        }
        // System.out.println("y = " + y);  // ERROR, y not available
    }
}
