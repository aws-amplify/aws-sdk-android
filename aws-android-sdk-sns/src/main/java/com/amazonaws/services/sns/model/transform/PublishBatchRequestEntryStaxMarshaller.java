/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.Request;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PublishBatchRequestEntry
 */
class PublishBatchRequestEntryStaxMarshaller {

    public void marshall(PublishBatchRequestEntry _publishBatchRequestEntry, Request<?> request,
            String _prefix) {
        String prefix;
        if (_publishBatchRequestEntry.getId() != null) {
            prefix = _prefix + "Id";
            String id = _publishBatchRequestEntry.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_publishBatchRequestEntry.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _publishBatchRequestEntry.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
        if (_publishBatchRequestEntry.getSubject() != null) {
            prefix = _prefix + "Subject";
            String subject = _publishBatchRequestEntry.getSubject();
            request.addParameter(prefix, StringUtils.fromString(subject));
        }
        if (_publishBatchRequestEntry.getMessageStructure() != null) {
            prefix = _prefix + "MessageStructure";
            String messageStructure = _publishBatchRequestEntry.getMessageStructure();
            request.addParameter(prefix, StringUtils.fromString(messageStructure));
        }
        if (_publishBatchRequestEntry.getMessageAttributes() != null) {
            prefix = _prefix + "MessageAttributes";
            java.util.Map<String, MessageAttributeValue> messageAttributes = _publishBatchRequestEntry
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
        if (_publishBatchRequestEntry.getMessageDeduplicationId() != null) {
            prefix = _prefix + "MessageDeduplicationId";
            String messageDeduplicationId = _publishBatchRequestEntry.getMessageDeduplicationId();
            request.addParameter(prefix, StringUtils.fromString(messageDeduplicationId));
        }
        if (_publishBatchRequestEntry.getMessageGroupId() != null) {
            prefix = _prefix + "MessageGroupId";
            String messageGroupId = _publishBatchRequestEntry.getMessageGroupId();
            request.addParameter(prefix, StringUtils.fromString(messageGroupId));
        }
    }

    private static PublishBatchRequestEntryStaxMarshaller instance;

    public static PublishBatchRequestEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PublishBatchRequestEntryStaxMarshaller();
        return instance;
    }
}
