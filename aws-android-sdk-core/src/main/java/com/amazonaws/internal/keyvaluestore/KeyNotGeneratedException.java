package com.amazonaws.internal.keyvaluestore;

public class KeyNotGeneratedException extends Exception {
    public KeyNotGeneratedException() {
        super();
    }

    public KeyNotGeneratedException(String s) {
        super(s);
    }

    public KeyNotGeneratedException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public KeyNotGeneratedException(Throwable throwable) {
        super(throwable);
    }
}

