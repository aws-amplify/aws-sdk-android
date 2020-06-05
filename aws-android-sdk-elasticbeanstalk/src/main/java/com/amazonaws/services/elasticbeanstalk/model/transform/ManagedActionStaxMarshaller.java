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
 * StAX marshaller for POJO ManagedAction
 */
class ManagedActionStaxMarshaller {

    public void marshall(ManagedAction _managedAction, Request<?> request, String _prefix) {
        String prefix;
        if (_managedAction.getActionId() != null) {
            prefix = _prefix + "ActionId";
            String actionId = _managedAction.getActionId();
            request.addParameter(prefix, StringUtils.fromString(actionId));
        }
        if (_managedAction.getActionDescription() != null) {
            prefix = _prefix + "ActionDescription";
            String actionDescription = _managedAction.getActionDescription();
            request.addParameter(prefix, StringUtils.fromString(actionDescription));
        }
        if (_managedAction.getActionType() != null) {
            prefix = _prefix + "ActionType";
            String actionType = _managedAction.getActionType();
            request.addParameter(prefix, StringUtils.fromString(actionType));
        }
        if (_managedAction.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _managedAction.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_managedAction.getWindowStartTime() != null) {
            prefix = _prefix + "WindowStartTime";
            java.util.Date windowStartTime = _managedAction.getWindowStartTime();
            request.addParameter(prefix, StringUtils.fromDate(windowStartTime));
        }
    }

    private static ManagedActionStaxMarshaller instance;

    public static ManagedActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ManagedActionStaxMarshaller();
        return instance;
    }
}
