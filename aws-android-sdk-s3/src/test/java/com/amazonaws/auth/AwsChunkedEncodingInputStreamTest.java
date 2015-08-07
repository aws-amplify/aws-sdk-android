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

package com.amazonaws.auth;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.util.BinaryUtils;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AwsChunkedEncodingInputStreamTest {

    AwsChunkedEncodingInputStream aceis = null;

    @Before
    public void setup() throws FileNotFoundException {
        File data = new File(getClass().getResource("/com/amazonaws/auth/RandomTestData.txt")
                .getPath());

        FileInputStream fis = new FileInputStream(data);
        byte[] key = BinaryUtils.fromBase64("3CzwdoZjnC/7siQkeHrlEmv0PE12RkMFZVG5qKt096s=");
        String keyPath = "20150513/us-west-2/s3/aws4_request";
        String headerSignature = "c61bd05d152a8ca5ca2a024ec45d0670c0f4aa2aa67ee26be9de8657f6cfea37";
        String dateTime = "20150513T222354Z";
        aceis = new AwsChunkedEncodingInputStream(fis, 262144, key,
                dateTime,
                keyPath, headerSignature, new AWSS3V4Signer());
    }

    @Test
    public void testRead() throws IOException {
        // Get the output created
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Make sure single reads work
        baos.write(aceis.read());
        baos.write(aceis.read());
        baos.write(aceis.read());

        // Make sure buffer reads work
        byte[] buf = new byte[2048];
        int read = -1;
        while ((read = aceis.read(buf)) != -1) {
            baos.write(buf, 0, read);
        }
        aceis.close();
        baos.flush();

        assertArrayEquals(getExpectedOutput(), baos.toByteArray());
    }

    @Test
    public void testMarkAndReset() throws IOException {
        assertTrue(aceis.markSupported());

        // Get the output created
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Read some data and then reset, docs say what you put for mark is
        // irrelevant
        aceis.mark(100);
        byte[] junk = new byte[1024];
        aceis.read(junk, 0, 1024);
        // We expect it to go back to beginning
        aceis.reset();

        // Make sure buffer reads work
        byte[] buf = new byte[2048];
        int read = -1;
        while ((read = aceis.read(buf)) != -1) {
            baos.write(buf, 0, read);
        }
        aceis.close();
        baos.flush();

        assertArrayEquals(getExpectedOutput(), baos.toByteArray());
    }

    @Test
    public void testSkip() throws IOException {
        // Get the output created
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Skip the first 100 bytes
        aceis.skip(100);

        // Consume remaining
        byte[] buf = new byte[2048];
        int read = -1;
        while ((read = aceis.read(buf)) != -1) {
            baos.write(buf, 0, read);
        }
        aceis.close();
        baos.flush();

        // Get the output we expect
        File written = new File(getClass().getResource("/com/amazonaws/auth/SignedTestData.txt")
                .getPath());
        ByteArrayOutputStream expected = new ByteArrayOutputStream();
        FileInputStream writtenFis = new FileInputStream(written);

        // Skip 100 bytes
        writtenFis.skip(100);
        int transferred = -1;
        byte[] transferBuf = new byte[2048];
        while ((transferred = writtenFis.read(transferBuf)) != -1) {
            expected.write(transferBuf, 0, transferred);
        }
        expected.flush();
        writtenFis.close();

        assertArrayEquals(expected.toByteArray(), baos.toByteArray());
    }

    private byte[] getExpectedOutput() throws IOException {
        // Get the output we expect
        File written = new File(getClass().getResource("/com/amazonaws/auth/SignedTestData.txt")
                .getPath());
        ByteArrayOutputStream expected = new ByteArrayOutputStream();
        FileInputStream writtenFis = new FileInputStream(written);
        int transferred = -1;
        byte[] transferBuf = new byte[2048];
        while ((transferred = writtenFis.read(transferBuf)) != -1) {
            expected.write(transferBuf, 0, transferred);
        }
        expected.flush();
        writtenFis.close();
        return expected.toByteArray();
    }
}
