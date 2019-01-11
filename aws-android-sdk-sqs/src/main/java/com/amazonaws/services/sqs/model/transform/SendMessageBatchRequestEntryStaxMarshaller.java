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
 * StAX marshaller for POJO SendMessageBatchRequestEntry
 */
class SendMessageBatchRequestEntryStaxMarshaller {

    public void marshall(SendMessageBatchRequestEntry _sendMessageBatchRequestEntry,
            Request<?> request, String _prefix) {
        String prefix;
        if (_sendMessageBatchRequestEntry.getId() != null) {
            prefix = _prefix + "Id";
            String id = _sendMessageBatchRequestEntry.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_sendMessageBatchRequestEntry.getMessageBody() != null) {
            prefix = _prefix + "MessageBody";
            String messageBody = _sendMessageBatchRequestEntry.getMessageBody();
            request.addParameter(prefix, StringUtils.fromString(messageBody));
        }
        if (_sendMessageBatchRequestEntry.getDelaySeconds() != null) {
            prefix = _prefix + "DelaySeconds";
            Integer delaySeconds = _sendMessageBatchRequestEntry.getDelaySeconds();
            request.addParameter(prefix, StringUtils.fromInteger(delaySeconds));
        }
        if (_sendMessageBatchRequestEntry.getMessageAttributes() != null) {
            prefix = _prefix + "MessageAttribute";
            java.util.Map<String, MessageAttributeValue> messageAttributes = _sendMessageBatchRequestEntry
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
        if (_sendMessageBatchRequestEntry.getMessageDeduplicationId() != null) {
            prefix = _prefix + "MessageDeduplicationId";
            String messageDeduplicationId = _sendMessageBatchRequestEntry
                    .getMessageDeduplicationId();
            request.addParameter(prefix, StringUtils.fromString(messageDeduplicationId));
        }
        if (_sendMessageBatchRequestEntry.getMessageGroupId() != null) {
            prefix = _prefix + "MessageGroupId";
            String messageGroupId = _sendMessageBatchRequestEntry.getMessageGroupId();
            request.addParameter(prefix, StringUtils.fromString(messageGroupId));
        }
    }

    private static SendMessageBatchRequestEntryStaxMarshaller instance;

    public static SendMessageBatchRequestEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SendMessageBatchRequestEntryStaxMarshaller();
        return instance;
    }
}
