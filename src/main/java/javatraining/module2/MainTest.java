package javatraining.module2;

import java.io.File;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Starting....");
        MainTest2.main(args);
    }

    static{
        System.out.println("ORICE");
        int arr[] = new int[2];
        System.out.println(arr[1]);
    }
}
