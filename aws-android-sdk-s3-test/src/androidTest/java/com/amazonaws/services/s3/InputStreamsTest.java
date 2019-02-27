/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;

import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.crypto.ByteRangeCapturingInputStream;
import com.amazonaws.util.CountingInputStream;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Unit tests for various InputStream subclasses.
 */
public class InputStreamsTest {

    String sampleData =
            "__________1234567890__________12345678901234567890"
                    + "12345678901234567890123456789012345678901234567890"
                    + "12345678901234567890123456789012345678901234567890"
                    + "12345678901234567890123456789012345678901234567890"
                    + "12345678901234567890123456789012345678909876543210";

    /**
     * Tests that we can properly capture a byte range with the
     * ByteRangeCapturingInputStream class.
     */
    @Test
    public void testByteRangeCapturingInputStream() throws Exception {
        int sampleDataLength = sampleData.length();
        ByteRangeCapturingInputStream in = new ByteRangeCapturingInputStream(
                new ByteArrayInputStream(sampleData.getBytes(StringUtils.UTF8)),
                sampleDataLength - 10,
                sampleDataLength);
        in.mark(100);
        in.read(new byte[sampleDataLength - 10]);
        in.reset();
        in.read(new byte[sampleDataLength]);
        assertEquals("9876543210", new String(in.getBlock(), StringUtils.UTF8));

        in = new ByteRangeCapturingInputStream(new ByteArrayInputStream(
                sampleData.getBytes(StringUtils.UTF8)), 10,
                20);
        in.read(new byte[sampleDataLength]);
        assertEquals("1234567890", new String(in.getBlock(), StringUtils.UTF8));
    }

    /** Tests the simple use case for InputSubstream */
    @Test
    public void testSimple() throws Exception {
        InputSubstream in = new InputSubstream(new ByteArrayInputStream(
                sampleData.getBytes(StringUtils.UTF8)), 10,
                10, true);
        assertEquals(10, in.available());
        byte[] buffer = new byte[10];
        assertEquals(10, in.read(buffer));
        assertEquals("1234567890", new String(buffer, StringUtils.UTF8));
        assertEquals(0, in.available());

        CountingInputStream countingStream = new CountingInputStream(new InputSubstream(
                new ByteArrayInputStream(sampleData.getBytes(StringUtils.UTF8)), 10, 10, true));
        int c;
        System.out.print("Data: ");
        while ((c = countingStream.read()) > -1) {
            System.out.print((char) c);
        }
        System.out.println();
        assertEquals(10, countingStream.getByteCount());

        countingStream = new CountingInputStream(new InputSubstream(new ByteArrayInputStream(
                sampleData.getBytes(StringUtils.UTF8)), 10, 10, true));
        byte[] bytes = new byte[1];
        System.out.print("Data: ");
        while ((c = countingStream.read(bytes)) > -1) {
            System.out.print((char) bytes[0]);
        }
        System.out.println();
        assertEquals(10, countingStream.getByteCount());
    }

    /**
     * Tests that we can combine InputSubstream with RepeatableFileInputStream
     * and correctly mark/reset the streams.
     */
    @Test
    public void testMarkReset() throws Exception {
        File tempFile = File.createTempFile("aws-java-sdk-inputsubstream-test", ".dat");
        FileOutputStream outputStream = new FileOutputStream(tempFile);
        outputStream.write(sampleData.getBytes(StringUtils.UTF8));
        outputStream.close();

        RepeatableFileInputStream repeatableFileInputStream = new RepeatableFileInputStream(
                tempFile);
        InputSubstream in = new InputSubstream(repeatableFileInputStream, 10, 10, true);
        assertEquals(10, in.available());
        byte[] buffer = new byte[5];

        in.mark(1024);
        assertEquals(5, in.read(buffer));
        assertEquals("12345", new String(buffer, StringUtils.UTF8));
        assertEquals(5, in.available());

        in.reset();
        assertEquals(10, in.available());
        assertEquals(5, in.read(buffer));
        assertEquals("12345", new String(buffer, StringUtils.UTF8));
        assertEquals(5, in.available());

        assertEquals(5, in.read(buffer));
        assertEquals("67890", new String(buffer, StringUtils.UTF8));
        assertEquals(0, in.available());
    }
}
