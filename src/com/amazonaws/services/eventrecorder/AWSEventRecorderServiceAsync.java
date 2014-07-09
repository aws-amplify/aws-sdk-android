/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eventrecorder;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.eventrecorder.model.*;

/**
 * Interface for accessing AWSEventRecorderService asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * <p>
 * A service which is used to record Amazon Mobile Analytics events
 * </p>
 */
public interface AWSEventRecorderServiceAsync extends AWSEventRecorderService {
    /**
     * <p>
     * Record a batch of events
     * </p>
     *
     * @param putEventsRequest Container for the necessary parameters to
     *           execute the PutEvents operation on AWSEventRecorderService.
     * 
     * @return A Java Future object containing the response from the
     *         PutEvents service method, as returned by AWSEventRecorderService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSEventRecorderService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putEventsAsync(PutEventsRequest putEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Record a batch of events
     * </p>
     *
     * @param putEventsRequest Container for the necessary parameters to
     *           execute the PutEvents operation on AWSEventRecorderService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PutEvents service method, as returned by AWSEventRecorderService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSEventRecorderService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> putEventsAsync(PutEventsRequest putEventsRequest,
            AsyncHandler<PutEventsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        