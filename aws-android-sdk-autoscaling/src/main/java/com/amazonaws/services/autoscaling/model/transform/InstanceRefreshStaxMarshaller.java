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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO InstanceRefresh
 */
class InstanceRefreshStaxMarshaller {

    public void marshall(InstanceRefresh _instanceRefresh, Request<?> request, String _prefix) {
        String prefix;
        if (_instanceRefresh.getInstanceRefreshId() != null) {
            prefix = _prefix + "InstanceRefreshId";
            String instanceRefreshId = _instanceRefresh.getInstanceRefreshId();
            request.addParameter(prefix, StringUtils.fromString(instanceRefreshId));
        }
        if (_instanceRefresh.getAutoScalingGroupName() != null) {
            prefix = _prefix + "AutoScalingGroupName";
            String autoScalingGroupName = _instanceRefresh.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (_instanceRefresh.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _instanceRefresh.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_instanceRefresh.getStatusReason() != null) {
            prefix = _prefix + "StatusReason";
            String statusReason = _instanceRefresh.getStatusReason();
            request.addParameter(prefix, StringUtils.fromString(statusReason));
        }
        if (_instanceRefresh.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _instanceRefresh.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_instanceRefresh.getEndTime() != null) {
            prefix = _prefix + "EndTime";
            java.util.Date endTime = _instanceRefresh.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (_instanceRefresh.getPercentageComplete() != null) {
            prefix = _prefix + "PercentageComplete";
            Integer percentageComplete = _instanceRefresh.getPercentageComplete();
            request.addParameter(prefix, StringUtils.fromInteger(percentageComplete));
        }
        if (_instanceRefresh.getInstancesToUpdate() != null) {
            prefix = _prefix + "InstancesToUpdate";
            Integer instancesToUpdate = _instanceRefresh.getInstancesToUpdate();
            request.addParameter(prefix, StringUtils.fromInteger(instancesToUpdate));
        }
    }

    private static InstanceRefreshStaxMarshaller instance;

    public static InstanceRefreshStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceRefreshStaxMarshaller();
        return instance;
    }
}
