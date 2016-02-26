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

package com.amazonaws.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class BinaryUtilsTest {

    @Test
    public void testToAndFromHex() {
        byte[] b = {
                -1, 0, 127, -128
        };
        // ff 00 7f 80
        String hex = BinaryUtils.toHex(b);
        assertEquals(hex.substring(0, 2), "ff");
        assertEquals(hex.substring(2, 4), "00");
        assertEquals(hex.substring(4, 6), "7f");
        assertEquals(hex.substring(6, 8), "80");
        byte[] bytes = BinaryUtils.fromHex(hex);
        assertArrayEquals(b, bytes);
    }

    @Test
    public void testByteBufferToStream() throws IOException {
        byte[] content = "content".getBytes(StringUtils.UTF8);
        ByteBuffer bb = ByteBuffer.wrap(content);
        InputStream is = BinaryUtils.toStream(bb);
        int curr = -1;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((curr = is.read()) != -1) {
            baos.write(curr);
        }
        assertArrayEquals(content, baos.toByteArray());
    }

}
