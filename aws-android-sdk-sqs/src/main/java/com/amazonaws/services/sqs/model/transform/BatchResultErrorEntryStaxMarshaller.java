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
 * StAX marshaller for POJO BatchResultErrorEntry
 */
class BatchResultErrorEntryStaxMarshaller {

    public void marshall(BatchResultErrorEntry _batchResultErrorEntry, Request<?> request,
            String _prefix) {
        String prefix;
        if (_batchResultErrorEntry.getId() != null) {
            prefix = _prefix + "Id";
            String id = _batchResultErrorEntry.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_batchResultErrorEntry.getSenderFault() != null) {
            prefix = _prefix + "SenderFault";
            Boolean senderFault = _batchResultErrorEntry.getSenderFault();
            request.addParameter(prefix, StringUtils.fromBoolean(senderFault));
        }
        if (_batchResultErrorEntry.getCode() != null) {
            prefix = _prefix + "Code";
            String code = _batchResultErrorEntry.getCode();
            request.addParameter(prefix, StringUtils.fromString(code));
        }
        if (_batchResultErrorEntry.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _batchResultErrorEntry.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
    }

    private static BatchResultErrorEntryStaxMarshaller instance;

    public static BatchResultErrorEntryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BatchResultErrorEntryStaxMarshaller();
        return instance;
    }
}
