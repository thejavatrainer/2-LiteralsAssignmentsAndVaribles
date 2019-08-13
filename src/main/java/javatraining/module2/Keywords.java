package javatraining.module2;

import java.io.IOException;
import java.io.Serializable;

public class Keywords implements Serializable {
    /* types */
    boolean aBoolean;
    byte aByte;
    char aChar;
    double aDouble;
    float aFloat;
    int anInt;
    long aLong;
    short aShort;
    enum Months {
        JANUARY, FEBRUARY
    }

    /* visibility identifiers */
    private boolean aPrivateBoolean;
    protected byte aProtectedByte;
    public char aPublicChar;

    static long A_STATIC_LONG;
    /* Java language objects related */
    // package
    // class
    // interface
    // import
    // new
    // static
    // super

    /* multithreaded context */ {
        synchronized (Keywords.class) {
            // kind of semaphore implementation
        }
    }
    transient int aTransientInt; // Variables may be marked transient to indicate that
    // they are not part of the persistent state of an object.
    volatile byte aVolatileByte; // Keyword is used to mark a variable as
    // "being stored in main memory", every read/write of a volatile variable
    // will be read/written from/to the computer's main memory and not from the CPU cache
    ///////////////////////////


    /* operations related */ {
        if(aPrivateBoolean){
            //fulfilled
        }else{
            //not fulfilled
        }

        //////////////////////

        boolean isTrue=true;
        do {
            // at least one time this block is executed
            if(anInt<2) {
                continue;
            }
        } while (isTrue);

        while(isTrue){

        }
        //////////////////////

        for (int i = 0; i < 2; i++) {
            break;
        }

        //////////////////////

        try {
            "ABC".getBytes("UTF-8");
        } catch (IOException e) {
            // error happened
        } finally {
            // in any case
        }

        //////////////////////

        switch (aChar){
            case 'a':{
                // aChar has value aChar
                break;
            }
            case 'b':{
                // aChar has value aChar
                break;
            }
            default:{
                // was not found in any case
                break;
            }
        }

        //////////////////////
label:
        if(this.getClass() instanceof Serializable){
            // this class is serializable
        }

        //////////////////////

        /* typical Java9, usually module related
            module
            exports
            open
            opens
            provides
            requires
            transitive
            to
            uses
            with
        */

        /* unusual/not really used */

        assert aPrivateBoolean : "Not Meet";
        // const, goto and _ - NOT used at all!

        /* platform dependent */
        // native
    }

    public void whileTest(){
        while(true){
        }
    }
}
