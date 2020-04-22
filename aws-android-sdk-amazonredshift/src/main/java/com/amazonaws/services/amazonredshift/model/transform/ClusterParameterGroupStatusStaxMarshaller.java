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
 * StAX marshaller for POJO ClusterParameterGroupStatus
 */
class ClusterParameterGroupStatusStaxMarshaller {

    public void marshall(ClusterParameterGroupStatus _clusterParameterGroupStatus,
            Request<?> request, String _prefix) {
        String prefix;
        if (_clusterParameterGroupStatus.getParameterGroupName() != null) {
            prefix = _prefix + "ParameterGroupName";
            String parameterGroupName = _clusterParameterGroupStatus.getParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(parameterGroupName));
        }
        if (_clusterParameterGroupStatus.getParameterApplyStatus() != null) {
            prefix = _prefix + "ParameterApplyStatus";
            String parameterApplyStatus = _clusterParameterGroupStatus.getParameterApplyStatus();
            request.addParameter(prefix, StringUtils.fromString(parameterApplyStatus));
        }
        if (_clusterParameterGroupStatus.getClusterParameterStatusList() != null) {
            prefix = _prefix + "ClusterParameterStatusList";
            java.util.List<ClusterParameterStatus> clusterParameterStatusList = _clusterParameterGroupStatus
                    .getClusterParameterStatusList();
            int clusterParameterStatusListIndex = 1;
            String clusterParameterStatusListPrefix = prefix;
            for (ClusterParameterStatus clusterParameterStatusListItem : clusterParameterStatusList) {
                prefix = clusterParameterStatusListPrefix + ".member."
                        + clusterParameterStatusListIndex;
                if (clusterParameterStatusListItem != null) {
                    ClusterParameterStatusStaxMarshaller.getInstance().marshall(
                            clusterParameterStatusListItem, request, prefix + ".");
                }
                clusterParameterStatusListIndex++;
            }
            prefix = clusterParameterStatusListPrefix;
        }
    }

    private static ClusterParameterGroupStatusStaxMarshaller instance;

    public static ClusterParameterGroupStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterParameterGroupStatusStaxMarshaller();
        return instance;
    }
}
