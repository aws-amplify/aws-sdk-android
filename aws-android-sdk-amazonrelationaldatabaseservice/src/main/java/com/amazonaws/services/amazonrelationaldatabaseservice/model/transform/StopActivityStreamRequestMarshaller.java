/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for StopActivityStreamRequest
 */
public class StopActivityStreamRequestMarshaller implements
        Marshaller<Request<StopActivityStreamRequest>, StopActivityStreamRequest> {

    public Request<StopActivityStreamRequest> marshall(
            StopActivityStreamRequest stopActivityStreamRequest) {
        if (stopActivityStreamRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StopActivityStreamRequest)");
        }

        Request<StopActivityStreamRequest> request = new DefaultRequest<StopActivityStreamRequest>(
                stopActivityStreamRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "StopActivityStream");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (stopActivityStreamRequest.getResourceArn() != null) {
            prefix = "ResourceArn";
            String resourceArn = stopActivityStreamRequest.getResourceArn();
            request.addParameter(prefix, StringUtils.fromString(resourceArn));
        }
        if (stopActivityStreamRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = stopActivityStreamRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }

        return request;
    }
}
