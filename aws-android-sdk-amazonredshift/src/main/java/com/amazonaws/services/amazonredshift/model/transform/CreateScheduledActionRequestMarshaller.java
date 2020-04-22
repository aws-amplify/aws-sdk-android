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
 * StAX request marshaller for CreateScheduledActionRequest
 */
public class CreateScheduledActionRequestMarshaller implements
        Marshaller<Request<CreateScheduledActionRequest>, CreateScheduledActionRequest> {

    public Request<CreateScheduledActionRequest> marshall(
            CreateScheduledActionRequest createScheduledActionRequest) {
        if (createScheduledActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateScheduledActionRequest)");
        }

        Request<CreateScheduledActionRequest> request = new DefaultRequest<CreateScheduledActionRequest>(
                createScheduledActionRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateScheduledAction");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createScheduledActionRequest.getScheduledActionName() != null) {
            prefix = "ScheduledActionName";
            String scheduledActionName = createScheduledActionRequest.getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }
        if (createScheduledActionRequest.getTargetAction() != null) {
            prefix = "TargetAction";
            ScheduledActionType targetAction = createScheduledActionRequest.getTargetAction();
            ScheduledActionTypeStaxMarshaller.getInstance().marshall(targetAction, request,
                    prefix + ".");
        }
        if (createScheduledActionRequest.getSchedule() != null) {
            prefix = "Schedule";
            String schedule = createScheduledActionRequest.getSchedule();
            request.addParameter(prefix, StringUtils.fromString(schedule));
        }
        if (createScheduledActionRequest.getIamRole() != null) {
            prefix = "IamRole";
            String iamRole = createScheduledActionRequest.getIamRole();
            request.addParameter(prefix, StringUtils.fromString(iamRole));
        }
        if (createScheduledActionRequest.getScheduledActionDescription() != null) {
            prefix = "ScheduledActionDescription";
            String scheduledActionDescription = createScheduledActionRequest
                    .getScheduledActionDescription();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionDescription));
        }
        if (createScheduledActionRequest.getStartTime() != null) {
            prefix = "StartTime";
            java.util.Date startTime = createScheduledActionRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (createScheduledActionRequest.getEndTime() != null) {
            prefix = "EndTime";
            java.util.Date endTime = createScheduledActionRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (createScheduledActionRequest.getEnable() != null) {
            prefix = "Enable";
            Boolean enable = createScheduledActionRequest.getEnable();
            request.addParameter(prefix, StringUtils.fromBoolean(enable));
        }

        return request;
    }
}
