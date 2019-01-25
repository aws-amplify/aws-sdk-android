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

package com.amazonaws.services.sqs.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ChangeMessageVisibilityRequest
 */
public class ChangeMessageVisibilityRequestMarshaller implements
        Marshaller<Request<ChangeMessageVisibilityRequest>, ChangeMessageVisibilityRequest> {

    public Request<ChangeMessageVisibilityRequest> marshall(
            ChangeMessageVisibilityRequest changeMessageVisibilityRequest) {
        if (changeMessageVisibilityRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ChangeMessageVisibilityRequest)");
        }

        Request<ChangeMessageVisibilityRequest> request = new DefaultRequest<ChangeMessageVisibilityRequest>(
                changeMessageVisibilityRequest, "AmazonSQS");
        request.addParameter("Action", "ChangeMessageVisibility");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (changeMessageVisibilityRequest.getQueueUrl() != null) {
            prefix = "QueueUrl";
            String queueUrl = changeMessageVisibilityRequest.getQueueUrl();
            request.addParameter(prefix, StringUtils.fromString(queueUrl));
        }
        if (changeMessageVisibilityRequest.getReceiptHandle() != null) {
            prefix = "ReceiptHandle";
            String receiptHandle = changeMessageVisibilityRequest.getReceiptHandle();
            request.addParameter(prefix, StringUtils.fromString(receiptHandle));
        }
        if (changeMessageVisibilityRequest.getVisibilityTimeout() != null) {
            prefix = "VisibilityTimeout";
            Integer visibilityTimeout = changeMessageVisibilityRequest.getVisibilityTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(visibilityTimeout));
        }

        return request;
    }
}
