/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StackSetOperationSummary
 */
class StackSetOperationSummaryStaxMarshaller {

    public void marshall(StackSetOperationSummary _stackSetOperationSummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_stackSetOperationSummary.getOperationId() != null) {
            prefix = _prefix + "OperationId";
            String operationId = _stackSetOperationSummary.getOperationId();
            request.addParameter(prefix, StringUtils.fromString(operationId));
        }
        if (_stackSetOperationSummary.getAction() != null) {
            prefix = _prefix + "Action";
            String action = _stackSetOperationSummary.getAction();
            request.addParameter(prefix, StringUtils.fromString(action));
        }
        if (_stackSetOperationSummary.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _stackSetOperationSummary.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_stackSetOperationSummary.getCreationTimestamp() != null) {
            prefix = _prefix + "CreationTimestamp";
            java.util.Date creationTimestamp = _stackSetOperationSummary.getCreationTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(creationTimestamp));
        }
        if (_stackSetOperationSummary.getEndTimestamp() != null) {
            prefix = _prefix + "EndTimestamp";
            java.util.Date endTimestamp = _stackSetOperationSummary.getEndTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(endTimestamp));
        }
    }

    private static StackSetOperationSummaryStaxMarshaller instance;

    public static StackSetOperationSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackSetOperationSummaryStaxMarshaller();
        return instance;
    }
}
