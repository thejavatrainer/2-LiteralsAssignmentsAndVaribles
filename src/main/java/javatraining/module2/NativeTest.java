package javatraining.module2;

public class NativeTest {
    static
    {
        System.loadLibrary ("nativetest"); // this loads the file 'libnativetest.so'
    }
    public static void main(String[] args) {
        System.out.println(new NativeTest().printNativeNumber());
    }

    private native double callNative();

    public String printNativeNumber() {
        return String.format("Native:%f", callNative());
    }
}
