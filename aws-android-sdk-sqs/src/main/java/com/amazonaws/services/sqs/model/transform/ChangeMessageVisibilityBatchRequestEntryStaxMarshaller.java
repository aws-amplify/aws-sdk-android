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
 * StAX marshaller for POJO ChangeMessageVisibilityBatchRequestEntry
 */
class ChangeMessageVisibilityBatchRequestEntryStaxMarshaller {

    public void marshall(
            ChangeMessageVisibilityBatchRequestEntry _changeMessageVisibilityBatchRequestEntry,
            Request<?> request, String _prefix) {
        String prefix;
        if (_changeMessageVisibilityBatchRequestEntry.getId() != null) {
            prefix = _prefix + "Id";
            String id = _changeMessageVisibilityBatchRequestEntry.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_changeMessageVisibilityBatchRequestEntry.getReceiptHandle() != null) {
            prefix = _prefix + "ReceiptHandle";
            String receiptHandle = _changeMessageVisibilityBatchRequestEntry.getReceiptHandle();
            request.addParameter(prefix, StringUtils.fromString(receiptHandle));
        }
        if (_changeMessageVisibilityBatchRequestEntry.getVisibilityTimeout() != null) {
            prefix = _prefix + "VisibilityTimeout";
            Integer visibilityTimeout = _changeMessageVisibilityBatchRequestEntry
                    .getVisibilityTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(visibilityTimeout));
        }
    }

    private static ChangeMessageVisibilityBatchRequestEntryStaxMarshaller instance;

    public static ChangeMessageVisibilityBatchRequestEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ChangeMessageVisibilityBatchRequestEntryStaxMarshaller();
        return instance;
    }
}
