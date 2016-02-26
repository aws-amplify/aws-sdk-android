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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayOutputStream;

public class DecodedStreamBufferTest {

    @Test
    public void testDecodedStreamBufferTest() {
        byte[] toBuff = "0123456789".getBytes(StringUtils.UTF8);
        assertEquals(toBuff.length, 10);

        DecodedStreamBuffer buff = new DecodedStreamBuffer(10);

        assertFalse(buff.hasNext());
        buff.buffer(toBuff[0]);
        buff.buffer(toBuff, 1, toBuff.length - 1);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        buff.startReadBuffer();
        while (buff.hasNext()) {
            baos.write(buff.next());
        }

        assertArrayEquals(toBuff, baos.toByteArray());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMustStartReadBuffer() {
        byte[] toBuff = "0123456789".getBytes(StringUtils.UTF8);
        assertEquals(toBuff.length, 10);

        DecodedStreamBuffer buff = new DecodedStreamBuffer(10);

        buff.buffer(toBuff[0]);

        buff.next();
    }

    @Test(expected = AmazonClientException.class)
    public void testBufferTooMuch() {
        byte[] toBuff = "0123456789".getBytes(StringUtils.UTF8);
        assertEquals(toBuff.length, 10);

        DecodedStreamBuffer buff = new DecodedStreamBuffer(5);

        buff.buffer(toBuff, 0, toBuff.length);
        buff.startReadBuffer();
    }

    @Test
    public void testReadOnlyBufferedAmount() {
        byte[] toBuff = "0123456789".getBytes(StringUtils.UTF8);
        assertEquals(toBuff.length, 10);

        DecodedStreamBuffer buff = new DecodedStreamBuffer(20);

        buff.buffer(toBuff, 0, toBuff.length);
        buff.startReadBuffer();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        buff.startReadBuffer();
        while (buff.hasNext()) {
            baos.write(buff.next());
        }

        assertArrayEquals(toBuff, baos.toByteArray());
    }

}
