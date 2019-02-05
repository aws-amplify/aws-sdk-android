
package com.amazonaws.test.util;

import java.io.IOException;

/**
 * Subclass of RandomInputStream that, in addition to spitting out a set length
 * of random characters, throws an IOException. Intended for testing error
 * recovery in the client library.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class UnreliableRandomInputStream extends RandomInputStream {

    /** True if this stream has already triggered an exception */
    private boolean hasTriggeredAnException = false;

    /**
     * Constructs a new unreliable random data input stream of the specified
     * number of bytes.
     *
     * @param lengthInBytes The number of bytes of data contained in the new
     *            stream.
     */
    public UnreliableRandomInputStream(long lengthInBytes) {
        super(lengthInBytes);
    }

    /**
     * @see com.amazonaws.util.RandomInputStream#read()
     */
    @Override
    public int read() throws IOException {
        triggerException();
        int read = super.read();
        return read;
    }

    /*
     * If we're more than half way through the bogus data, and we haven't fired
     * an exception yet, go ahead and fire one.
     */
    private void triggerException() throws IOException {
        if (remainingBytes <= (lengthInBytes / 2) && !hasTriggeredAnException) {
            hasTriggeredAnException = true;
            throw new IOException("UnreliableBogusInputStream fired an IOException!");
        }
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        triggerException();
        int read = super.read(b, off, len);
        return read;
    }

}
