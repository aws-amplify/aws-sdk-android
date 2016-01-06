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

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.util.Arrays;

public class FileRecordTest {

    @Test
    public void testFileRecord() {
        String streamName = "stream";
        String data = "some data";
        byte[] bytes = data.getBytes(StringUtils.UTF8);
        String str = FileRecordParser.asString(streamName, bytes);

        FileRecordParser frp = new FileRecordParser();
        frp.parse(str);
        assertEquals("stream name", streamName, frp.streamName);
        assertTrue("data bytes", Arrays.equals(bytes, frp.bytes));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLineNoData() {
        String line = "line_without_data";
        FileRecordParser frp = new FileRecordParser();
        frp.parse(line);
    }
}
