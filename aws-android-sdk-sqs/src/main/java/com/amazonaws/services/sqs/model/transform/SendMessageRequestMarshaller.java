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
 * StAX request marshaller for SendMessageRequest
 */
public class SendMessageRequestMarshaller implements
        Marshaller<Request<SendMessageRequest>, SendMessageRequest> {

    public Request<SendMessageRequest> marshall(SendMessageRequest sendMessageRequest) {
        if (sendMessageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendMessageRequest)");
        }

        Request<SendMessageRequest> request = new DefaultRequest<SendMessageRequest>(
                sendMessageRequest, "AmazonSQS");
        request.addParameter("Action", "SendMessage");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (sendMessageRequest.getQueueUrl() != null) {
            prefix = "QueueUrl";
            String queueUrl = sendMessageRequest.getQueueUrl();
            request.addParameter(prefix, StringUtils.fromString(queueUrl));
        }
        if (sendMessageRequest.getMessageBody() != null) {
            prefix = "MessageBody";
            String messageBody = sendMessageRequest.getMessageBody();
            request.addParameter(prefix, StringUtils.fromString(messageBody));
        }
        if (sendMessageRequest.getDelaySeconds() != null) {
            prefix = "DelaySeconds";
            Integer delaySeconds = sendMessageRequest.getDelaySeconds();
            request.addParameter(prefix, StringUtils.fromInteger(delaySeconds));
        }
        if (sendMessageRequest.getMessageAttributes() != null) {
            prefix = "MessageAttribute";
            java.util.Map<String, MessageAttributeValue> messageAttributes = sendMessageRequest
                    .getMessageAttributes();
            int messageAttributesIndex = 1;
            String messageAttributesPrefix = prefix + ".";
            for (java.util.Map.Entry<String, MessageAttributeValue> messageAttributesEntry : messageAttributes
                    .entrySet()) {
                prefix = messageAttributesPrefix + messageAttributesIndex;
                if (messageAttributesEntry.getKey() != null) {
                    request.addParameter(prefix + ".Name",
                            StringUtils.fromString(messageAttributesEntry.getKey()));
                }
                prefix += ".Value";
                if (messageAttributesEntry.getValue() != null) {
                    MessageAttributeValue messageAttributesValue = messageAttributesEntry
                            .getValue();
                    MessageAttributeValueStaxMarshaller.getInstance().marshall(
                            messageAttributesValue, request, prefix + ".");
                }
                messageAttributesIndex++;
            }
            prefix = messageAttributesPrefix;
        }
        if (sendMessageRequest.getMessageDeduplicationId() != null) {
            prefix = "MessageDeduplicationId";
            String messageDeduplicationId = sendMessageRequest.getMessageDeduplicationId();
            request.addParameter(prefix, StringUtils.fromString(messageDeduplicationId));
        }
        if (sendMessageRequest.getMessageGroupId() != null) {
            prefix = "MessageGroupId";
            String messageGroupId = sendMessageRequest.getMessageGroupId();
            request.addParameter(prefix, StringUtils.fromString(messageGroupId));
        }

        return request;
    }
}
