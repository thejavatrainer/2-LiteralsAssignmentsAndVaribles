package javatraining.module2;

import java.io.IOException;

abstract class AnAbstractClass {
    /* Java language, methods related */
    abstract int getAge();

    final boolean doWeNeedACoffe() {
        return this.getAge() > 18;
    }

    public String getMyFileContent() throws IOException, NumberFormatException {
        throw new IOException("File NOT Found!");
    }

    public static void PerformUtilityMethod() {

    }

    public strictfp float calculate(){
        return 1.2f;
    }
    // strictfp keyword is used to implement the strict precision of floating point
    // calculations on different platforms.
}
