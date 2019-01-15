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
 * StAX request marshaller for ReceiveMessageRequest
 */
public class ReceiveMessageRequestMarshaller implements
        Marshaller<Request<ReceiveMessageRequest>, ReceiveMessageRequest> {

    public Request<ReceiveMessageRequest> marshall(ReceiveMessageRequest receiveMessageRequest) {
        if (receiveMessageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ReceiveMessageRequest)");
        }

        Request<ReceiveMessageRequest> request = new DefaultRequest<ReceiveMessageRequest>(
                receiveMessageRequest, "AmazonSQS");
        request.addParameter("Action", "ReceiveMessage");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (receiveMessageRequest.getQueueUrl() != null) {
            prefix = "QueueUrl";
            String queueUrl = receiveMessageRequest.getQueueUrl();
            request.addParameter(prefix, StringUtils.fromString(queueUrl));
        }
        if (receiveMessageRequest.getAttributeNames() != null) {
            prefix = "AttributeName";
            java.util.List<String> attributeNames = receiveMessageRequest.getAttributeNames();
            int attributeNamesIndex = 1;
            String attributeNamesPrefix = prefix;
            for (String attributeNamesItem : attributeNames) {
                prefix = attributeNamesPrefix + "." + attributeNamesIndex;
                if (attributeNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(attributeNamesItem));
                }
                attributeNamesIndex++;
            }
            prefix = attributeNamesPrefix;
        }
        if (receiveMessageRequest.getMessageAttributeNames() != null) {
            prefix = "MessageAttributeName";
            java.util.List<String> messageAttributeNames = receiveMessageRequest
                    .getMessageAttributeNames();
            int messageAttributeNamesIndex = 1;
            String messageAttributeNamesPrefix = prefix;
            for (String messageAttributeNamesItem : messageAttributeNames) {
                prefix = messageAttributeNamesPrefix + "." + messageAttributeNamesIndex;
                if (messageAttributeNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(messageAttributeNamesItem));
                }
                messageAttributeNamesIndex++;
            }
            prefix = messageAttributeNamesPrefix;
        }
        if (receiveMessageRequest.getMaxNumberOfMessages() != null) {
            prefix = "MaxNumberOfMessages";
            Integer maxNumberOfMessages = receiveMessageRequest.getMaxNumberOfMessages();
            request.addParameter(prefix, StringUtils.fromInteger(maxNumberOfMessages));
        }
        if (receiveMessageRequest.getVisibilityTimeout() != null) {
            prefix = "VisibilityTimeout";
            Integer visibilityTimeout = receiveMessageRequest.getVisibilityTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(visibilityTimeout));
        }
        if (receiveMessageRequest.getWaitTimeSeconds() != null) {
            prefix = "WaitTimeSeconds";
            Integer waitTimeSeconds = receiveMessageRequest.getWaitTimeSeconds();
            request.addParameter(prefix, StringUtils.fromInteger(waitTimeSeconds));
        }
        if (receiveMessageRequest.getReceiveRequestAttemptId() != null) {
            prefix = "ReceiveRequestAttemptId";
            String receiveRequestAttemptId = receiveMessageRequest.getReceiveRequestAttemptId();
            request.addParameter(prefix, StringUtils.fromString(receiveRequestAttemptId));
        }

        return request;
    }
}
