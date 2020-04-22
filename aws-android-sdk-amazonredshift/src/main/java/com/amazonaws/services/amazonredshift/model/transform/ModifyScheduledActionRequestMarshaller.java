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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyScheduledActionRequest
 */
public class ModifyScheduledActionRequestMarshaller implements
        Marshaller<Request<ModifyScheduledActionRequest>, ModifyScheduledActionRequest> {

    public Request<ModifyScheduledActionRequest> marshall(
            ModifyScheduledActionRequest modifyScheduledActionRequest) {
        if (modifyScheduledActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyScheduledActionRequest)");
        }

        Request<ModifyScheduledActionRequest> request = new DefaultRequest<ModifyScheduledActionRequest>(
                modifyScheduledActionRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyScheduledAction");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (modifyScheduledActionRequest.getScheduledActionName() != null) {
            prefix = "ScheduledActionName";
            String scheduledActionName = modifyScheduledActionRequest.getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }
        if (modifyScheduledActionRequest.getTargetAction() != null) {
            prefix = "TargetAction";
            ScheduledActionType targetAction = modifyScheduledActionRequest.getTargetAction();
            ScheduledActionTypeStaxMarshaller.getInstance().marshall(targetAction, request,
                    prefix + ".");
        }
        if (modifyScheduledActionRequest.getSchedule() != null) {
            prefix = "Schedule";
            String schedule = modifyScheduledActionRequest.getSchedule();
            request.addParameter(prefix, StringUtils.fromString(schedule));
        }
        if (modifyScheduledActionRequest.getIamRole() != null) {
            prefix = "IamRole";
            String iamRole = modifyScheduledActionRequest.getIamRole();
            request.addParameter(prefix, StringUtils.fromString(iamRole));
        }
        if (modifyScheduledActionRequest.getScheduledActionDescription() != null) {
            prefix = "ScheduledActionDescription";
            String scheduledActionDescription = modifyScheduledActionRequest
                    .getScheduledActionDescription();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionDescription));
        }
        if (modifyScheduledActionRequest.getStartTime() != null) {
            prefix = "StartTime";
            java.util.Date startTime = modifyScheduledActionRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (modifyScheduledActionRequest.getEndTime() != null) {
            prefix = "EndTime";
            java.util.Date endTime = modifyScheduledActionRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (modifyScheduledActionRequest.getEnable() != null) {
            prefix = "Enable";
            Boolean enable = modifyScheduledActionRequest.getEnable();
            request.addParameter(prefix, StringUtils.fromBoolean(enable));
        }

        return request;
    }
}
