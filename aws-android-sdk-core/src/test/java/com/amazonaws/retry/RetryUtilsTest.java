package com.amazonaws.retry;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AbortedException;

import org.junit.Test;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class RetryUtilsTest {

    @Test
    public void testIsInterruptedException() {
        assertTrue(RetryUtils.isInterrupted(new AbortedException()));
        Exception interrupted = new Exception(new InterruptedException());
        assertTrue(RetryUtils.isInterrupted(interrupted));
        Exception interruptedio = new Exception(new InterruptedIOException());
        assertTrue(RetryUtils.isInterrupted(interruptedio));
        Exception socketTimeout = new Exception(new SocketTimeoutException());
        assertFalse(RetryUtils.isInterrupted(socketTimeout));
    }
}
