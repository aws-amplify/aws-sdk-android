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
 * StAX marshaller for POJO DeleteMessageBatchRequestEntry
 */
class DeleteMessageBatchRequestEntryStaxMarshaller {

    public void marshall(DeleteMessageBatchRequestEntry _deleteMessageBatchRequestEntry,
            Request<?> request, String _prefix) {
        String prefix;
        if (_deleteMessageBatchRequestEntry.getId() != null) {
            prefix = _prefix + "Id";
            String id = _deleteMessageBatchRequestEntry.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_deleteMessageBatchRequestEntry.getReceiptHandle() != null) {
            prefix = _prefix + "ReceiptHandle";
            String receiptHandle = _deleteMessageBatchRequestEntry.getReceiptHandle();
            request.addParameter(prefix, StringUtils.fromString(receiptHandle));
        }
    }

    private static DeleteMessageBatchRequestEntryStaxMarshaller instance;

    public static DeleteMessageBatchRequestEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteMessageBatchRequestEntryStaxMarshaller();
        return instance;
    }
}
