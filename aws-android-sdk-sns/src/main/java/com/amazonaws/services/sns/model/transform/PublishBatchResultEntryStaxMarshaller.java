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
 * StAX marshaller for POJO PublishBatchResultEntry
 */
class PublishBatchResultEntryStaxMarshaller {

    public void marshall(PublishBatchResultEntry _publishBatchResultEntry, Request<?> request,
            String _prefix) {
        String prefix;
        if (_publishBatchResultEntry.getId() != null) {
            prefix = _prefix + "Id";
            String id = _publishBatchResultEntry.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_publishBatchResultEntry.getMessageId() != null) {
            prefix = _prefix + "MessageId";
            String messageId = _publishBatchResultEntry.getMessageId();
            request.addParameter(prefix, StringUtils.fromString(messageId));
        }
        if (_publishBatchResultEntry.getSequenceNumber() != null) {
            prefix = _prefix + "SequenceNumber";
            String sequenceNumber = _publishBatchResultEntry.getSequenceNumber();
            request.addParameter(prefix, StringUtils.fromString(sequenceNumber));
        }
    }

    private static PublishBatchResultEntryStaxMarshaller instance;

    public static PublishBatchResultEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PublishBatchResultEntryStaxMarshaller();
        return instance;
    }
}
