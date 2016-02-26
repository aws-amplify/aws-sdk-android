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

import static com.amazonaws.util.StringUtils.UTF8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.util.Locale;

/**
 * Unit tests for the StringUtils class.
 */
public class StringUtilsTest {

    /**
     * Tests that {@link StringUtils#fromByteBuffer(ByteBuffer)} correctly
     * base64 encodes the contents in a ByteBuffer and returns the correct
     * result.
     */
    @Test
    public void testFromByteBuffer() {
        String expectedData = "hello world";
        String expectedEncodedData = "aGVsbG8gd29ybGQ=";

        ByteBuffer byteBuffer = ByteBuffer.wrap(expectedData.getBytes(UTF8));
        String encodedData = StringUtils.fromByteBuffer(byteBuffer);

        assertEquals(expectedEncodedData, encodedData);
    }

    /**
     * Tests that we can correctly convert Bytes to strings.
     */
    @Test
    public void testFromByte() {
        assertEquals("123", StringUtils.fromByte(new Byte("123")));
        assertEquals("-99", StringUtils.fromByte(new Byte("-99")));
    }

    @Test
    public void testUTF8Charset() {
        assertEquals(UTF8.displayName(), "UTF-8");
    }

    @Test
    public void testReplace() {
        String orig = "To have or not to have";
        String replacement = "be";
        assertEquals(StringUtils.replace(orig, "have", replacement), "To be or not to be");
    }

    @Test
    public void testJoiner() {
        String part1 = "one";
        String part2 = "two";
        String part3 = "one";
        String part4 = "four";
        String join1 = StringUtils.join("+", part1, part2, part3);
        assertEquals(StringUtils.join("=", join1, part4), "one+two+one=four");
    }

    @Test
    public void testLowerCase() {
        assertNull("null", StringUtils.lowerCase(null));
        assertEquals("empty string", "", StringUtils.lowerCase(""));
        assertEquals("aBc -> abc", "abc", StringUtils.lowerCase("aBc"));

        // https://github.com/aws/aws-sdk-android/issues/96
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(new Locale("tr", "TR"));
        assertEquals("turkish locale", "x-amz-invocation-type",
                StringUtils.lowerCase("X-Amz-Invocation-Type"));
        Locale.setDefault(defaultLocale);
    }

    @Test
    public void testUpperCase() {
        assertNull("null", StringUtils.upperCase(null));
        assertEquals("empty string", "", StringUtils.upperCase(""));
        assertEquals("aBc -> ABC", "ABC", StringUtils.upperCase("aBc"));

        // https://github.com/aws/aws-sdk-android/issues/96
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(new Locale("tr", "TR"));
        assertEquals("turkish locale", "X-AMZ-INVOCATION-TYPE",
                StringUtils.upperCase("X-Amz-Invocation-Type"));
        Locale.setDefault(defaultLocale);
    }
}
