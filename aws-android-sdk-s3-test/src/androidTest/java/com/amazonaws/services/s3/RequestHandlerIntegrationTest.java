/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.Request;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.services.s3.model.DeleteBucketRequest;
import com.amazonaws.util.TimingInfo;

import org.junit.Test;

/**
 * Tests that new request handlers can be registered for a client, and that
 * they're correctly run during a request's lifecyle.
 */
public class RequestHandlerIntegrationTest extends S3IntegrationTestBase {

    @Test
    public void testRequestHandlers() throws Exception {
        final TestRequestHandler requestHandler = new TestRequestHandler();
        s3.addRequestHandler(requestHandler);

        try {
            s3.deleteBucket(new DeleteBucketRequest("asdfasdasdfasdf"));
            fail("Expected exception not thrown");
        } catch (final AmazonServiceException ase) {
            requestHandler.assertCallCounts(1, 0, 1);
        }

        requestHandler.resetCallCounts();
        s3.listBuckets();
        // region is now cached
        requestHandler.assertCallCounts(1, 1, 0);
    }

    /*
     * TODO: Duplicated in the SimpleDB tests for RequestHandler support in the
     * generated clients. It'd be nice to have a shared package that all SDK
     * clients could declare a test-dependency on to share utilities like this.
     */
    private final class TestRequestHandler implements RequestHandler {
        public int beforeRequestCallCount = 0;
        public int afterResponseCallCount = 0;
        public int afterErrorCallCount = 0;

        @Override
        public void beforeRequest(Request<?> request) {
            assertNotNull(request);
            beforeRequestCallCount++;
        }

        @Override
        public void afterResponse(Request<?> request, Object response, TimingInfo timingInfo) {
            assertNotNull(request);
            assertNotNull(response);
            assertNotNull(timingInfo);
            assertTrue(timingInfo.getStartEpochTimeMilli() > 0);
            assertTrue(timingInfo.getStartTimeNano() > 0);
            assertTrue(timingInfo.getEndTimeNano() > timingInfo.getStartTimeNano());
            assertTrue(timingInfo.getEndEpochTimeMilli() >= timingInfo.getStartEpochTimeMilli());
            afterResponseCallCount++;
        }

        @Override
        public void afterError(Request<?> request, Exception ace) {
            assertNotNull(request);
            assertNotNull(ace);
            afterErrorCallCount++;
        }

        public void resetCallCounts() {
            beforeRequestCallCount = 0;
            afterResponseCallCount = 0;
            afterErrorCallCount = 0;
        }

        public void assertCallCounts(int expectedBeforeRequestCount,
                int expectedAfterResponseCount,
                int expectedAfterErrorCount) {
            assertEquals(expectedBeforeRequestCount, beforeRequestCallCount);
            assertEquals(expectedAfterResponseCount, afterResponseCallCount);
            assertEquals(expectedAfterErrorCount, afterErrorCallCount);
        }
    }
}
