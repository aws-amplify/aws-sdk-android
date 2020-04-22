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
 * StAX marshaller for POJO ScheduledActionType
 */
class ScheduledActionTypeStaxMarshaller {

    public void marshall(ScheduledActionType _scheduledActionType, Request<?> request,
            String _prefix) {
        String prefix;
        if (_scheduledActionType.getResizeCluster() != null) {
            prefix = _prefix + "ResizeCluster";
            ResizeClusterMessage resizeCluster = _scheduledActionType.getResizeCluster();
            ResizeClusterMessageStaxMarshaller.getInstance().marshall(resizeCluster, request,
                    prefix + ".");
        }
        if (_scheduledActionType.getPauseCluster() != null) {
            prefix = _prefix + "PauseCluster";
            PauseClusterMessage pauseCluster = _scheduledActionType.getPauseCluster();
            PauseClusterMessageStaxMarshaller.getInstance().marshall(pauseCluster, request,
                    prefix + ".");
        }
        if (_scheduledActionType.getResumeCluster() != null) {
            prefix = _prefix + "ResumeCluster";
            ResumeClusterMessage resumeCluster = _scheduledActionType.getResumeCluster();
            ResumeClusterMessageStaxMarshaller.getInstance().marshall(resumeCluster, request,
                    prefix + ".");
        }
    }

    private static ScheduledActionTypeStaxMarshaller instance;

    public static ScheduledActionTypeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledActionTypeStaxMarshaller();
        return instance;
    }
}
