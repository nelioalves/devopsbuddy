package com.devopsbuddy.exceptions;

/**
 * Created by nelio on 23/12/2016.
 */
public class S3Exception extends RuntimeException {

    public S3Exception(Throwable e) {
        super(e);
    }

    public S3Exception(String s) {
        super(s);
    }
}
