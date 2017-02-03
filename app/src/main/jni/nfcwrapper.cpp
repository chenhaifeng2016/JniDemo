//
// Created by chenhf on 15-9-16.
//

//#include <string.h>
//#include <jni.h>

#include "com_cssweb_jnidemo_nfcwrapper.h"

 jstring  Java_com_cssweb_jnidemo_nfcwrapper_stringFromJNI
        (JNIEnv * env, jobject thiz)
{
    return env->NewStringUTF("Hello from JNI !");
}