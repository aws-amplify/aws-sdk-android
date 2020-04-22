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
 * StAX marshaller for POJO ClusterAssociatedToSchedule
 */
class ClusterAssociatedToScheduleStaxMarshaller {

    public void marshall(ClusterAssociatedToSchedule _clusterAssociatedToSchedule,
            Request<?> request, String _prefix) {
        String prefix;
        if (_clusterAssociatedToSchedule.getClusterIdentifier() != null) {
            prefix = _prefix + "ClusterIdentifier";
            String clusterIdentifier = _clusterAssociatedToSchedule.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (_clusterAssociatedToSchedule.getScheduleAssociationState() != null) {
            prefix = _prefix + "ScheduleAssociationState";
            String scheduleAssociationState = _clusterAssociatedToSchedule
                    .getScheduleAssociationState();
            request.addParameter(prefix, StringUtils.fromString(scheduleAssociationState));
        }
    }

    private static ClusterAssociatedToScheduleStaxMarshaller instance;

    public static ClusterAssociatedToScheduleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterAssociatedToScheduleStaxMarshaller();
        return instance;
    }
}
