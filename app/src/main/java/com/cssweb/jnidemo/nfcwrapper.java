package com.cssweb.jnidemo;

/**
 * Created by chenhf on 15-9-16.
 */
public class nfcwrapper {
    public native String  stringFromJNI();

    //javah -d jni -classpath /home/chenhf/workspace/JniDemo/app/build/intermediates/classes/debug com.cssweb.jnidemo.nfcwrapper


}
