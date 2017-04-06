package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.services.s3.model.ProgressEvent;
import com.amazonaws.services.s3.model.ProgressListener;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProgressReportingInputStreamTest {
    private File testFile;
    private final int numberOfBytesToWrite = 17408;
    private InputStream is;

    @Before
    public void setup() throws IOException {
        testFile = File.createTempFile("AndroidProgressReportingInputStreamTest", null);
        final FileOutputStream fos = new FileOutputStream(testFile);

        final byte[] dummyData = new byte[numberOfBytesToWrite];
        final Random rand = new Random();
        rand.nextBytes(dummyData);

        fos.write(dummyData);
        fos.flush();
        fos.close();

        is = new FileInputStream(testFile);
    }

    @After
    public void teardown() throws IOException {
        assertTrue(testFile.delete());
    }

    @Test
    public void testNotifiedOfAllByteWithEventCompletedFired() throws IOException {
        final Map<Long, Integer> countMap = new HashMap<Long, Integer>();
        final ProgressListener listener = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                synchronized (countMap) {
                    if (countMap.size() >= 3) {
                        fail("Unexpected progress event found: " + progressEvent);
                    }
                    if (progressEvent.getBytesTransferred() == 1024) {
                        assertTrue(
                                progressEvent.getEventCode() == ProgressEvent.COMPLETED_EVENT_CODE);
                    }
                    Integer curr = countMap.get(progressEvent.getBytesTransferred());
                    if (curr == null) {
                        curr = 0;
                    }
                    countMap.put(progressEvent.getBytesTransferred(), ++curr);
                    countMap.notifyAll();
                }
            }
        };

        ProgressReportingInputStream testStream = null;
        try {
            testStream = new ProgressReportingInputStream(is, listener);
            testStream.setFireCompletedEvent(true);
            while (testStream.read() != -1) {
            }
        } finally {
            testStream.close();
        }

        assertTrue(countMap.size() == 2);
        assertEquals(countMap.get(new Long(1024)).intValue(), 1);
        assertEquals(countMap.get(new Long(8192)).intValue(), 2);

    }

    @Test
    public void testNotifiedOfReset() throws InterruptedException,
            IOException {
        final byte[] buff = new byte[numberOfBytesToWrite];
        is.read(buff);
        final ByteArrayInputStream bais = new ByteArrayInputStream(buff);

        final Map<Long, Integer> countMap = new HashMap<Long, Integer>();
        final ProgressListener listener = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {

                synchronized (countMap) {
                    if (countMap.size() >= 2) {
                        fail("Unexpected progress event found: " + progressEvent);
                    }
                    if (progressEvent.getBytesTransferred() == 500) {
                        assertTrue(progressEvent.getEventCode() == ProgressEvent.RESET_EVENT_CODE);
                        Integer curr = countMap.get(progressEvent.getBytesTransferred());
                        if (curr == null) {
                            curr = 0;
                        }

                        countMap.put(progressEvent.getBytesTransferred(), ++curr);
                        countMap.notifyAll();
                    }
                }

            }

        };

        ProgressReportingInputStream testStream = null;
        try {
            testStream = new ProgressReportingInputStream(bais, listener);
            testStream.mark(600);
            final byte[] bytes = new byte[500];
            testStream.read(bytes);
            testStream.reset();
        } finally {
            testStream.close();
        }

        assertTrue(countMap.size() == 1);
        assertEquals(countMap.get(new Long(500)).intValue(), 1);
    }

    @Test
    public void testNotifiedOfAllBytesNoEventCompletedFired() throws InterruptedException,
            IOException {
        // By default we should not recieve a event completed event

        final Map<Long, Integer> countMap = new HashMap<Long, Integer>();
        final ProgressListener listener = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {

                synchronized (countMap) {
                    if (countMap.size() >= 3) {
                        fail("Unexpected progress event found: " + progressEvent);
                    }
                    Integer curr = countMap.get(progressEvent.getBytesTransferred());
                    if (curr == null) {
                        curr = 0;
                    }
                    countMap.put(progressEvent.getBytesTransferred(), ++curr);
                    countMap.notifyAll();
                }

            }

        };

        ProgressReportingInputStream testStream = null;
        try {
            testStream = new ProgressReportingInputStream(is, listener);
            while (testStream.read() != -1) {
            }
        } finally {
            testStream.close();
        }

        assertTrue(countMap.size() == 2);
        assertEquals(countMap.get(new Long(1024)).intValue(), 1);
        assertEquals(countMap.get(new Long(8192)).intValue(), 2);
    }

}
