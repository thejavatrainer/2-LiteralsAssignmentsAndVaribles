package javatraining.module2;

import java.util.Arrays;

public class MainTest2 {
    static {
        System.out.println("Hello from a new world!");
    }

    public static void main(String[] args) {
        int myArray[] = new int[]{1, 5, 6, 7, 8};
/*        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));
        int matrice[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrice);
        System.out.println(Arrays.deepToString(matrice));*/
        System.out.println("DONE");
        System.out.println(-7%4);
        int x=-7;
        if(x%2==1){
            System.out.println("impar");
        }else{
            System.out.println("par");
        }
        double d=7.2; d=d+1;
        d++;
        String s="Luca";
        x=x*7;
        x*=7;
        int y=x;
        System.out.println(x);
        x*=(7+8/9);
        System.out.println(x);
        y = y*(7+8/9);
        System.out.println(y);
    }

    public void muha() {
        int arr[] = new int[2];
        System.out.println(arr[1]);
    }
}
