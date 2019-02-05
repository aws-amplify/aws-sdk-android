
package com.amazonaws.test.util;

import com.amazonaws.internal.SdkInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;

/**
 * A test input stream that always return the same value.
 */
public class ConstantInputStream extends SdkInputStream {
    private final byte val;
    private long remaining;
    private final boolean randomlyReturnZeros;
    private int randomZerosCount;

    private static final Random rand = new Random();

    public ConstantInputStream(long total, byte val) {
        this.remaining = total;
        this.val = val;
        this.randomlyReturnZeros = false;
    }

    public ConstantInputStream(long total, byte val, boolean randomlyReturnZeros) {
        this.remaining = total;
        this.val = val;
        this.randomlyReturnZeros = randomlyReturnZeros;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        if (randomlyReturnZeros && rand.nextBoolean()) {
            randomZerosCount++;
            return 0;
        }
        if (remaining <= 0)
            return -1;
        if (len > remaining)
            len = (int) remaining;
        remaining -= len;
        Arrays.fill(b, off, len, val);
        return len;
    }

    @Override
    public int read() throws IOException {
        if (randomlyReturnZeros && rand.nextBoolean()) {
            randomZerosCount++;
            return 0;
        }
        if (remaining <= 0)
            return -1;
        remaining--;
        return val;
    }

    public int getRandomZerosCount() {
        return randomZerosCount;
    }

    @Override
    protected InputStream getWrappedInputStream() {
        return null;
    }
}
