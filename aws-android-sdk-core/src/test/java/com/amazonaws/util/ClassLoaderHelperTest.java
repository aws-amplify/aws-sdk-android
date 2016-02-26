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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ClassLoaderHelperTest {

    @Test
    public void testGetResource() throws IOException {
        URL testURL = ClassLoaderHelper.getResource("ClassLoaderHelperTestFile", this.getClass());
        BufferedReader br = new BufferedReader(new FileReader(testURL.getFile()));
        assertEquals(br.readLine(), "TestFile");
        assertNull(br.readLine());
        br.close();

        testURL = ClassLoaderHelper.getResource("ClassLoaderHelperTestFile", true, String.class);
        br = new BufferedReader(new FileReader(testURL.getFile()));
        assertEquals(br.readLine(), "TestFile");
        assertNull(br.readLine());
        br.close();
    }

    @Test
    public void testGetResourceAsStream() throws IOException {
        InputStream is = ClassLoaderHelper.getResourceAsStream("ClassLoaderHelperTestFile",
                this.getClass());
        BufferedReader br = new BufferedReader(new InputStreamReader(is, StringUtils.UTF8));
        assertEquals(br.readLine(), "TestFile");
        assertNull(br.readLine());
        br.close();

        is = ClassLoaderHelper.getResourceAsStream("ClassLoaderHelperTestFile", true, String.class);
        br = new BufferedReader(new InputStreamReader(is, StringUtils.UTF8));
        assertEquals(br.readLine(), "TestFile");
        assertNull(br.readLine());
        br.close();
    }

    @Test
    public void testGetClass() throws ClassNotFoundException {
        Class<?> testClass = ClassLoaderHelper.loadClass(
                "com.amazonaws.util.ClassLoaderHelperTest", String.class);
        assertEquals(testClass.getName(), this.getClass().getName());

        testClass = ClassLoaderHelper.loadClass("com.amazonaws.util.ClassLoaderHelperTest", true,
                this.getClass());
        assertEquals(testClass.getName(), this.getClass().getName());
    }

}
