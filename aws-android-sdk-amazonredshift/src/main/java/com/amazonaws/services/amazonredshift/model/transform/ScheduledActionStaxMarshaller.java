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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ScheduledAction
 */
class ScheduledActionStaxMarshaller {

    public void marshall(ScheduledAction _scheduledAction, Request<?> request, String _prefix) {
        String prefix;
        if (_scheduledAction.getScheduledActionName() != null) {
            prefix = _prefix + "ScheduledActionName";
            String scheduledActionName = _scheduledAction.getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }
        if (_scheduledAction.getTargetAction() != null) {
            prefix = _prefix + "TargetAction";
            ScheduledActionType targetAction = _scheduledAction.getTargetAction();
            ScheduledActionTypeStaxMarshaller.getInstance().marshall(targetAction, request,
                    prefix + ".");
        }
        if (_scheduledAction.getSchedule() != null) {
            prefix = _prefix + "Schedule";
            String schedule = _scheduledAction.getSchedule();
            request.addParameter(prefix, StringUtils.fromString(schedule));
        }
        if (_scheduledAction.getIamRole() != null) {
            prefix = _prefix + "IamRole";
            String iamRole = _scheduledAction.getIamRole();
            request.addParameter(prefix, StringUtils.fromString(iamRole));
        }
        if (_scheduledAction.getScheduledActionDescription() != null) {
            prefix = _prefix + "ScheduledActionDescription";
            String scheduledActionDescription = _scheduledAction.getScheduledActionDescription();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionDescription));
        }
        if (_scheduledAction.getState() != null) {
            prefix = _prefix + "State";
            String state = _scheduledAction.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
        if (_scheduledAction.getNextInvocations() != null) {
            prefix = _prefix + "NextInvocations";
            java.util.List<java.util.Date> nextInvocations = _scheduledAction.getNextInvocations();
            int nextInvocationsIndex = 1;
            String nextInvocationsPrefix = prefix;
            for (java.util.Date nextInvocationsItem : nextInvocations) {
                prefix = nextInvocationsPrefix + "." + nextInvocationsIndex;
                if (nextInvocationsItem != null) {
                    request.addParameter(prefix, StringUtils.fromDate(nextInvocationsItem));
                }
                nextInvocationsIndex++;
            }
            prefix = nextInvocationsPrefix;
        }
        if (_scheduledAction.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _scheduledAction.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_scheduledAction.getEndTime() != null) {
            prefix = _prefix + "EndTime";
            java.util.Date endTime = _scheduledAction.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
    }

    private static ScheduledActionStaxMarshaller instance;

    public static ScheduledActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledActionStaxMarshaller();
        return instance;
    }
}
