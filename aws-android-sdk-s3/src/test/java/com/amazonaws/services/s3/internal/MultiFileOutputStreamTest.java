package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.UploadObjectObserver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Random;

public class MultiFileOutputStreamTest {
    private MultiFileOutputStream mfos;

    @Before
    public void setup() {
        mfos = new MultiFileOutputStream();
    }

    @After
    public void destroy() throws IOException {
        mfos.cleanup();
        mfos.close();
        Assert.assertTrue(mfos.isClosed());
    }

    @Test
    public void testRead() throws IOException {
        mfos.init(Mockito.mock(UploadObjectObserver.class), 100, Long.MAX_VALUE);
        int count = 0;
        while (count < 10000) {
            mfos.write(count);
            count++;
        }

        Assert.assertNotNull(mfos.getFile(2));
        Assert.assertEquals(mfos.getNumFilesWritten(), 100);
    }

    @Test
    public void testRead2() throws IOException {
        mfos.init(Mockito.mock(UploadObjectObserver.class), 100, Long.MAX_VALUE);
        mfos.cleanup();
        mfos.flush();
        int count = 0;
        while (count < 200) {
            final byte[] b = new byte[50];
            new Random().nextBytes(b);
            mfos.write(b);
            count++;
        }

        Assert.assertNotNull(mfos.getFile(2));
        Assert.assertEquals(mfos.getNumFilesWritten(), 100);
    }

    @Test
    public void testRead3() throws IOException {
        mfos.init(Mockito.mock(UploadObjectObserver.class), 100, Long.MAX_VALUE);
        mfos.cleanup();
        int count = 0;
        while (count < 200) {
            final byte[] b = new byte[50];
            new Random().nextBytes(b);
            mfos.write(b, 0, 50);
            count++;
        }

        Assert.assertNotNull(mfos.getFile(2));
        Assert.assertEquals(mfos.getNumFilesWritten(), 100);
        Assert.assertEquals(mfos.getPartSize(), 100);
        Assert.assertNotNull(mfos.getNamePrefix());
        Assert.assertEquals(mfos.getDiskLimit(), Long.MAX_VALUE);
        Assert.assertEquals(mfos.getTotalBytesWritten(), 10000);
        Assert.assertNotNull(mfos.getRoot());
    }

}
