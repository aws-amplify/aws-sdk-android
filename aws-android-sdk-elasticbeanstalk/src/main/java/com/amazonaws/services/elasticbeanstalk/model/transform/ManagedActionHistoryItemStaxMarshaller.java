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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ManagedActionHistoryItem
 */
class ManagedActionHistoryItemStaxMarshaller {

    public void marshall(ManagedActionHistoryItem _managedActionHistoryItem, Request<?> request,
            String _prefix) {
        String prefix;
        if (_managedActionHistoryItem.getActionId() != null) {
            prefix = _prefix + "ActionId";
            String actionId = _managedActionHistoryItem.getActionId();
            request.addParameter(prefix, StringUtils.fromString(actionId));
        }
        if (_managedActionHistoryItem.getActionType() != null) {
            prefix = _prefix + "ActionType";
            String actionType = _managedActionHistoryItem.getActionType();
            request.addParameter(prefix, StringUtils.fromString(actionType));
        }
        if (_managedActionHistoryItem.getActionDescription() != null) {
            prefix = _prefix + "ActionDescription";
            String actionDescription = _managedActionHistoryItem.getActionDescription();
            request.addParameter(prefix, StringUtils.fromString(actionDescription));
        }
        if (_managedActionHistoryItem.getFailureType() != null) {
            prefix = _prefix + "FailureType";
            String failureType = _managedActionHistoryItem.getFailureType();
            request.addParameter(prefix, StringUtils.fromString(failureType));
        }
        if (_managedActionHistoryItem.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _managedActionHistoryItem.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_managedActionHistoryItem.getFailureDescription() != null) {
            prefix = _prefix + "FailureDescription";
            String failureDescription = _managedActionHistoryItem.getFailureDescription();
            request.addParameter(prefix, StringUtils.fromString(failureDescription));
        }
        if (_managedActionHistoryItem.getExecutedTime() != null) {
            prefix = _prefix + "ExecutedTime";
            java.util.Date executedTime = _managedActionHistoryItem.getExecutedTime();
            request.addParameter(prefix, StringUtils.fromDate(executedTime));
        }
        if (_managedActionHistoryItem.getFinishedTime() != null) {
            prefix = _prefix + "FinishedTime";
            java.util.Date finishedTime = _managedActionHistoryItem.getFinishedTime();
            request.addParameter(prefix, StringUtils.fromDate(finishedTime));
        }
    }

    private static ManagedActionHistoryItemStaxMarshaller instance;

    public static ManagedActionHistoryItemStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ManagedActionHistoryItemStaxMarshaller();
        return instance;
    }
}
