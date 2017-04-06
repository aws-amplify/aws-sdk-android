package com.amazonaws.mobileconnectors.s3.transferutility;

public interface Function<P,R> {
    R call(P p);
}
