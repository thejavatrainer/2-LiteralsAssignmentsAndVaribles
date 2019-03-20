/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

@SuppressWarnings("all")
public class Logical {
    public static void main(String[] args) {
        boolean a = false, b = true;
        boolean x = false, y = false, z = false, t = false;
        boolean c = a | b;                              // true
        boolean d = a & b;                              // false
        boolean e = a ^ b;                              // true
        boolean f = !a;                                 // true
        boolean g = (!a & b) | (a & !b);                // true
        boolean h = (a && (x = b)) || (a || (y = b));   // x = false, y = true
        boolean i = (a & (z = b)) | (a | (t = b));      // z = true, t = true

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("z = " + z + ", t = " + t);
    }
}
