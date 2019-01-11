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

package com.amazonaws.services.cloudwatch.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SetAlarmStateRequest
 */
public class SetAlarmStateRequestMarshaller implements
        Marshaller<Request<SetAlarmStateRequest>, SetAlarmStateRequest> {

    public Request<SetAlarmStateRequest> marshall(SetAlarmStateRequest setAlarmStateRequest) {
        if (setAlarmStateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetAlarmStateRequest)");
        }

        Request<SetAlarmStateRequest> request = new DefaultRequest<SetAlarmStateRequest>(
                setAlarmStateRequest, "AmazonCloudWatch");
        request.addParameter("Action", "SetAlarmState");
        request.addParameter("Version", "2010-08-01");

        String prefix;
        if (setAlarmStateRequest.getAlarmName() != null) {
            prefix = "AlarmName";
            String alarmName = setAlarmStateRequest.getAlarmName();
            request.addParameter(prefix, StringUtils.fromString(alarmName));
        }
        if (setAlarmStateRequest.getStateValue() != null) {
            prefix = "StateValue";
            String stateValue = setAlarmStateRequest.getStateValue();
            request.addParameter(prefix, StringUtils.fromString(stateValue));
        }
        if (setAlarmStateRequest.getStateReason() != null) {
            prefix = "StateReason";
            String stateReason = setAlarmStateRequest.getStateReason();
            request.addParameter(prefix, StringUtils.fromString(stateReason));
        }
        if (setAlarmStateRequest.getStateReasonData() != null) {
            prefix = "StateReasonData";
            String stateReasonData = setAlarmStateRequest.getStateReasonData();
            request.addParameter(prefix, StringUtils.fromString(stateReasonData));
        }

        return request;
    }
}
