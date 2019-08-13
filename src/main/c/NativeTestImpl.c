#include "NativeTest.h"         /* Generated earlier. */
#include <stdio.h>         /* Standard C IO stuff. */
#include <stdlib.h>

jdouble JNICALL Java_javatraining_module2_NativeTest_callNative(JNIEnv * env, jobject nativeTest)
{
    double result = rand()/33000.0;
    return (jdouble)result;
}
