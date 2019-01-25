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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO BulkEmailDestinationStatus
 */
class BulkEmailDestinationStatusStaxMarshaller {

    public void marshall(BulkEmailDestinationStatus _bulkEmailDestinationStatus,
            Request<?> request, String _prefix) {
        String prefix;
        if (_bulkEmailDestinationStatus.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _bulkEmailDestinationStatus.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_bulkEmailDestinationStatus.getError() != null) {
            prefix = _prefix + "Error";
            String error = _bulkEmailDestinationStatus.getError();
            request.addParameter(prefix, StringUtils.fromString(error));
        }
        if (_bulkEmailDestinationStatus.getMessageId() != null) {
            prefix = _prefix + "MessageId";
            String messageId = _bulkEmailDestinationStatus.getMessageId();
            request.addParameter(prefix, StringUtils.fromString(messageId));
        }
    }

    private static BulkEmailDestinationStatusStaxMarshaller instance;

    public static BulkEmailDestinationStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BulkEmailDestinationStatusStaxMarshaller();
        return instance;
    }
}
