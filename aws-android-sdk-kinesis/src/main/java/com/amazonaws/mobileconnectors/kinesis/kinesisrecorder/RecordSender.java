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

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.AmazonClientException;

import java.util.List;

/**
 * Sender that sends a batch of data to a given stream.
 */
interface RecordSender {
    /**
     * Sends a batch of data to the given stream. If some data is rejected by
     * the server and is retryable, it should be added to the return list.
     *
     * @param streamName stream name
     * @param data a list of data to be sent
     * @return a list to data that is failed to send
     */
    List<byte[]> sendBatch(String streamName, List<byte[]> data);

    /**
     * Tests whether an exception is recoverable. If true, the list of data
     * which is failed to send can be retried at a later time.
     *
     * @param ace exception thrown by {@link #sendBatch(String, List, List)}
     * @return true if the exception is recoverable, or false otherwise
     */
    boolean isRecoverable(AmazonClientException ace);
}
