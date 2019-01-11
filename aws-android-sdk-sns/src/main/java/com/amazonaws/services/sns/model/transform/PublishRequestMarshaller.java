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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PublishRequest
 */
public class PublishRequestMarshaller implements
        Marshaller<Request<PublishRequest>, PublishRequest> {

    public Request<PublishRequest> marshall(PublishRequest publishRequest) {
        if (publishRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PublishRequest)");
        }

        Request<PublishRequest> request = new DefaultRequest<PublishRequest>(publishRequest,
                "AmazonSNS");
        request.addParameter("Action", "Publish");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (publishRequest.getTopicArn() != null) {
            prefix = "TopicArn";
            String topicArn = publishRequest.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (publishRequest.getTargetArn() != null) {
            prefix = "TargetArn";
            String targetArn = publishRequest.getTargetArn();
            request.addParameter(prefix, StringUtils.fromString(targetArn));
        }
        if (publishRequest.getPhoneNumber() != null) {
            prefix = "PhoneNumber";
            String phoneNumber = publishRequest.getPhoneNumber();
            request.addParameter(prefix, StringUtils.fromString(phoneNumber));
        }
        if (publishRequest.getMessage() != null) {
            prefix = "Message";
            String message = publishRequest.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
        if (publishRequest.getSubject() != null) {
            prefix = "Subject";
            String subject = publishRequest.getSubject();
            request.addParameter(prefix, StringUtils.fromString(subject));
        }
        if (publishRequest.getMessageStructure() != null) {
            prefix = "MessageStructure";
            String messageStructure = publishRequest.getMessageStructure();
            request.addParameter(prefix, StringUtils.fromString(messageStructure));
        }
        if (publishRequest.getMessageAttributes() != null) {
            prefix = "MessageAttributes";
            java.util.Map<String, MessageAttributeValue> messageAttributes = publishRequest
                    .getMessageAttributes();
            int messageAttributesIndex = 1;
            String messageAttributesPrefix = prefix + ".entry.";
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

        return request;
    }
}
