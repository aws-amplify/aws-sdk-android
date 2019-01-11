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

import com.amazonaws.Request;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Message
 */
class MessageStaxMarshaller {

    public void marshall(Message _message, Request<?> request, String _prefix) {
        String prefix;
        if (_message.getMessageId() != null) {
            prefix = _prefix + "MessageId";
            String messageId = _message.getMessageId();
            request.addParameter(prefix, StringUtils.fromString(messageId));
        }
        if (_message.getReceiptHandle() != null) {
            prefix = _prefix + "ReceiptHandle";
            String receiptHandle = _message.getReceiptHandle();
            request.addParameter(prefix, StringUtils.fromString(receiptHandle));
        }
        if (_message.getMD5OfBody() != null) {
            prefix = _prefix + "MD5OfBody";
            String mD5OfBody = _message.getMD5OfBody();
            request.addParameter(prefix, StringUtils.fromString(mD5OfBody));
        }
        if (_message.getBody() != null) {
            prefix = _prefix + "Body";
            String body = _message.getBody();
            request.addParameter(prefix, StringUtils.fromString(body));
        }
        if (_message.getAttributes() != null) {
            prefix = _prefix + "Attribute";
            java.util.Map<String, String> attributes = _message.getAttributes();
            int attributesIndex = 1;
            String attributesPrefix = prefix + ".";
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                prefix = attributesPrefix + attributesIndex;
                if (attributesEntry.getKey() != null) {
                    request.addParameter(prefix + ".Name",
                            StringUtils.fromString(attributesEntry.getKey()));
                }
                prefix += ".Value";
                if (attributesEntry.getValue() != null) {
                    String attributesValue = attributesEntry.getValue();
                    request.addParameter(prefix, StringUtils.fromString(attributesValue));
                }
                attributesIndex++;
            }
            prefix = attributesPrefix;
        }
        if (_message.getMD5OfMessageAttributes() != null) {
            prefix = _prefix + "MD5OfMessageAttributes";
            String mD5OfMessageAttributes = _message.getMD5OfMessageAttributes();
            request.addParameter(prefix, StringUtils.fromString(mD5OfMessageAttributes));
        }
        if (_message.getMessageAttributes() != null) {
            prefix = _prefix + "MessageAttribute";
            java.util.Map<String, MessageAttributeValue> messageAttributes = _message
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
    }

    private static MessageStaxMarshaller instance;

    public static MessageStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MessageStaxMarshaller();
        return instance;
    }
}
