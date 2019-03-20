/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

@SuppressWarnings("all")
public class Strings {
    public static void main(String[] args) {
        String s = "this is a string";
        String s1 = new String("this is a string");
        String s2 = new String(new char[] {'a', ' ', 's', 't', 'r', 'i', 'n', 'g'});
        String s3 = String.valueOf(new char[] {'a', ' ', 's', 't', 'r', 'i', 'n', 'g'});
        String s4 = new StringBuilder().append("this").append(' ').append("is").append(' ').append("string!").toString();

        System.out.println(s.length());                     // 16
        System.out.println(s.isEmpty());                    // false
        System.out.println(s.lastIndexOf('t'));             // 11
        System.out.println(s.equals("this is a string"));   // true
        System.out.println(s.compareTo("hello") > 0);       // true
        System.out.println(s.charAt(5));                    // i
        System.out.println(s.replaceFirst(" ", "_"));       // "this_is a string"

    }
}
