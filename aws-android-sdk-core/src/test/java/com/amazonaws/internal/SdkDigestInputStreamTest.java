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

package com.amazonaws.internal;

import static org.junit.Assert.assertArrayEquals;

import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SdkDigestInputStreamTest {

    @Test
    public void testSkip() throws NoSuchAlgorithmException, IOException {
        byte[] bytes = "Content".getBytes(StringUtils.UTF8);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // Calculate the expected digest
        byte[] expected = md.digest(bytes);

        SdkDigestInputStream sdis = new SdkDigestInputStream(bais, md);
        sdis.skip(2);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int curr = -1;
        while ((curr = sdis.read()) != -1) {
            baos.write(curr);
        }
        baos.flush();

        MessageDigest inputStreamMD = sdis.getMessageDigest();
        assertArrayEquals(expected, inputStreamMD.digest());
        assertArrayEquals("ntent".getBytes(StringUtils.UTF8), baos.toByteArray());
    }

}
