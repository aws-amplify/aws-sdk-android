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

import com.amazonaws.ClientConfiguration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class KinesisRecorderConfigTest {

    @Test
    public void ClientConfigConstructor() {
        ClientConfiguration cConfig = new ClientConfiguration();
        cConfig.withConnectionTimeout(0);
        cConfig.withMaxConnections(5000);

        KinesisRecorderConfig kConfig = new KinesisRecorderConfig(cConfig);
        assertEquals(kConfig.getClientConfiguration().getConnectionTimeout(), 0);
        assertEquals(kConfig.getClientConfiguration().getMaxConnections(), 5000);
    }

    @Test
    public void defaultConstructorUsesDefaultClientConfiguration() {
        KinesisRecorderConfig kConfig = new KinesisRecorderConfig();
        ClientConfiguration cConfig = new ClientConfiguration();

        assertEquals(kConfig.getClientConfiguration().getConnectionTimeout(),
                cConfig.getConnectionTimeout());
        assertEquals(kConfig.getClientConfiguration().getMaxConnections(),
                cConfig.getMaxConnections());
        assertEquals(kConfig.getClientConfiguration().getMaxErrorRetry(),
                cConfig.getMaxErrorRetry());
        assertEquals(kConfig.getClientConfiguration().getSocketTimeout(),
                cConfig.getSocketTimeout());
    }

    @Test
    public void copyConstructor() {
        KinesisRecorderConfig kConfig = new KinesisRecorderConfig();
        kConfig.withMaxStorageSize(5);

        KinesisRecorderConfig copiedConfig = new KinesisRecorderConfig(kConfig);

        assertEquals(kConfig.getMaxStorageSize(),
                copiedConfig.getMaxStorageSize());

    }

    @Test
    public void testSetters() {

        KinesisRecorderConfig kConfig = new KinesisRecorderConfig();
        kConfig.withMaxStorageSize(100);
        assertEquals(kConfig.getMaxStorageSize(), 100);
    }

}
