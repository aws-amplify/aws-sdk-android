/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesisvideosignaling;

import android.support.test.runner.AndroidJUnit4;

import com.amazonaws.services.kinesisvideo.AWSKinesisVideoClient;
import com.amazonaws.testutils.AWSTestBase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class KinesisVideoSignalingInstrumentedTest extends AWSTestBase {

    private AWSKinesisVideoClient kvClient;
    private AWSKinesisVideoSignalingClient signalingClient;

    private String TAG = KinesisVideoSignalingInstrumentedTest.class.getSimpleName();

    @Before
    public void setUp() {
        setUpCredentials();
        kvClient = new AWSKinesisVideoClient(credentials);
        signalingClient = new AWSKinesisVideoSignalingClient(credentials);
    }

    @Test
    public void testSignalingClient() {
        // Temporarily no-op
    }

}
