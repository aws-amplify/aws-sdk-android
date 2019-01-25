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
 * StAX marshaller for POJO SendMessageBatchResultEntry
 */
class SendMessageBatchResultEntryStaxMarshaller {

    public void marshall(SendMessageBatchResultEntry _sendMessageBatchResultEntry,
            Request<?> request, String _prefix) {
        String prefix;
        if (_sendMessageBatchResultEntry.getId() != null) {
            prefix = _prefix + "Id";
            String id = _sendMessageBatchResultEntry.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_sendMessageBatchResultEntry.getMessageId() != null) {
            prefix = _prefix + "MessageId";
            String messageId = _sendMessageBatchResultEntry.getMessageId();
            request.addParameter(prefix, StringUtils.fromString(messageId));
        }
        if (_sendMessageBatchResultEntry.getMD5OfMessageBody() != null) {
            prefix = _prefix + "MD5OfMessageBody";
            String mD5OfMessageBody = _sendMessageBatchResultEntry.getMD5OfMessageBody();
            request.addParameter(prefix, StringUtils.fromString(mD5OfMessageBody));
        }
        if (_sendMessageBatchResultEntry.getMD5OfMessageAttributes() != null) {
            prefix = _prefix + "MD5OfMessageAttributes";
            String mD5OfMessageAttributes = _sendMessageBatchResultEntry
                    .getMD5OfMessageAttributes();
            request.addParameter(prefix, StringUtils.fromString(mD5OfMessageAttributes));
        }
        if (_sendMessageBatchResultEntry.getSequenceNumber() != null) {
            prefix = _prefix + "SequenceNumber";
            String sequenceNumber = _sendMessageBatchResultEntry.getSequenceNumber();
            request.addParameter(prefix, StringUtils.fromString(sequenceNumber));
        }
    }

    private static SendMessageBatchResultEntryStaxMarshaller instance;

    public static SendMessageBatchResultEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SendMessageBatchResultEntryStaxMarshaller();
        return instance;
    }
}
