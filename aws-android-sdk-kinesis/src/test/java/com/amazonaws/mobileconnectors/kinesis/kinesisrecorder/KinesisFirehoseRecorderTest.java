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

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.io.IOException;

@RunWith(RobolectricTestRunner.class)
public class KinesisFirehoseRecorderTest {
    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    private KinesisFirehoseRecorder recorder;

    @Before
    public void setup() throws IOException {
        AWSCredentialsProvider provider = new StaticCredentialsProvider(
                new AnonymousAWSCredentials());
        recorder = new KinesisFirehoseRecorder(temp.newFolder(), Regions.US_WEST_2, provider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullRecord() throws IOException {
        recorder.saveRecord((byte[]) null, "stream");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyData() throws IOException {
        byte[] data = new byte[0];
        recorder.saveRecord(data, "stream");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyStream() throws IOException {
        recorder.saveRecord("valid".getBytes(StringUtils.UTF8), "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullStream() throws IOException {
        recorder.saveRecord("valid".getBytes(StringUtils.UTF8), null);
    }

}
