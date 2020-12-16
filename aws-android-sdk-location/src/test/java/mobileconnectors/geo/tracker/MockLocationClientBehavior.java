/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package mobileconnectors.geo.tracker;

import com.amazonaws.services.geo.AmazonLocationClient;
import com.amazonaws.services.geo.model.BatchUpdateDevicePositionRequest;
import com.amazonaws.services.geo.model.BatchUpdateDevicePositionResult;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.concurrent.CountDownLatch;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

class MockLocationClientBehavior {

    public static void latchedBatchUpdates(final AmazonLocationClient mockLocationClient, final CountDownLatch latch) {
        when(mockLocationClient.batchUpdateDevicePosition(any(BatchUpdateDevicePositionRequest.class)))
            .then(new Answer<BatchUpdateDevicePositionResult>() {
                @Override
                public BatchUpdateDevicePositionResult answer(InvocationOnMock invocation) throws Throwable {
                    latch.countDown();
                    return new BatchUpdateDevicePositionResult();
                }
            });
    }
}
