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

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.util.Md5Utils;
import com.amazonaws.util.StringUtils;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class MD5DigestCalculatingInputStreamTest {
    private static final boolean DEBUG = true;

    @Test
    public void test() throws Exception {
        byte[] data = "0123456789abcdefghijklmnopqrstuvwxyz!@#$%^&*()_+-="
                .getBytes(StringUtils.UTF8);
        byte[] md5Expected = Md5Utils.computeMD5Hash(data);
        byte[] baExpected;
        {
            MD5DigestCalculatingInputStream is = new MD5DigestCalculatingInputStream(
                    new ByteArrayInputStream(data));
            baExpected = IOUtils.toByteArray(is);
            byte[] md5 = is.getMd5Digest();
            assertTrue(Arrays.equals(md5Expected, md5));
        }
        {
            MD5DigestCalculatingInputStream is = new MD5DigestCalculatingInputStream(
                    new ByteArrayInputStream(data));
            is.mark(-1);
            baExpected = IOUtils.toByteArray(is);
            byte[] md5 = is.getMd5Digest();
            assertTrue(Arrays.equals(md5Expected, md5));

            is.reset();
            byte[] ba = IOUtils.toByteArray(is);
            byte[] md5_2 = is.getMd5Digest();
            assertTrue(Arrays.equals(md5Expected, md5_2));
            assertTrue(Arrays.equals(baExpected, ba));
        }
        {
            MD5DigestCalculatingInputStream is = new MD5DigestCalculatingInputStream(
                    new ByteArrayInputStream(data));
            is.mark(-1);
            is.read(new byte[10]);
            is.reset();
            byte[] ba = IOUtils.toByteArray(is);
            if (DEBUG)
                System.out.println("ba.length: " + ba.length);
            assertTrue(Arrays.equals(baExpected, ba));
            byte[] md5 = is.getMd5Digest();
            assertTrue(Arrays.equals(md5Expected, md5));
        }
        {
            MD5DigestCalculatingInputStream is = new MD5DigestCalculatingInputStream(
                    new ByteArrayInputStream(data));
            is.mark(-1);
            is.read(new byte[10]);
            is.mark(-1);
            is.read(new byte[10]);
            is.reset();
            byte[] ba = IOUtils.toByteArray(is);
            if (DEBUG)
                System.out.println("ba.length: " + ba.length);
            assertFalse(Arrays.equals(baExpected, ba));
            byte[] md5 = is.getMd5Digest();
            assertTrue(Arrays.equals(md5Expected, md5));
        }
        {
            MD5DigestCalculatingInputStream is = new MD5DigestCalculatingInputStream(
                    new ByteArrayInputStream(data));
            is.read(new byte[10]);
            is.mark(-1);
            is.read(new byte[10]);
            is.reset();
            is.read(new byte[10]);
            is.mark(-1);
            is.read();
            is.reset();
            byte[] ba = IOUtils.toByteArray(is);
            if (DEBUG)
                System.out.println("ba.length: " + ba.length);
            assertFalse(Arrays.equals(baExpected, ba));
            byte[] md5 = is.getMd5Digest();
            assertTrue(Arrays.equals(md5Expected, md5));
        }
    }

}
