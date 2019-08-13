package javatraining.module2;

import java.io.IOException;

public class AnImplementedClass extends AnAbstractClass {

    @Override
    int getAge() {
        return 22;
    }

    public void readFile() {
        try {
            super.getMyFileContent();
        } catch (IOException e) {
            // error happened, fallback to other mechanisms
        }

    }

    public void showDataTypes(){
        int x = 7;
        int y = 8;
        int sum = x + y;
        int average = (x+y)/2;

        print("x=" + x);
        print("y=" + y);
        print("sum=" + sum);
        print("average="+average);

        //sum = "Frequentis";

        print("sum' =" + sum);
    }

    private void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        int x=65;
/*        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toOctalString(x));*/

/*        System.out.println("This is a new line: \r\nXYZ");
        System.out.printf("This is a new line: %n123");
        System.out.println(String.format("This is a new line: %nABC"));*/

        int y;

        y=x;
        System.out.println(String.format("X=%d, Y=%d", x, y));
        x=17;
        System.out.println(String.format("X=%d, Y=%d", x, y));


        final int[] myArray = new int[]{1,7};
        //myArray= new int[]{3,6};

        myArray[0]=19;
    }
}
