/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

@SuppressWarnings("all")
public class Arrays {
    public static void main(String[] args) {
        int month_days[] = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        // same as
        // int month_days[] = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("April has " + month_days[3] + " days.");

        int numbers[] = new int[] {1, 2, 3, 4};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Average is " + sum / numbers.length);   // Average is 2.5
    }
}
