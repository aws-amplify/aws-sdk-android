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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for IncreaseNodeGroupsInGlobalReplicationGroupRequest
 */
public class IncreaseNodeGroupsInGlobalReplicationGroupRequestMarshaller
        implements
        Marshaller<Request<IncreaseNodeGroupsInGlobalReplicationGroupRequest>, IncreaseNodeGroupsInGlobalReplicationGroupRequest> {

    public Request<IncreaseNodeGroupsInGlobalReplicationGroupRequest> marshall(
            IncreaseNodeGroupsInGlobalReplicationGroupRequest increaseNodeGroupsInGlobalReplicationGroupRequest) {
        if (increaseNodeGroupsInGlobalReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(IncreaseNodeGroupsInGlobalReplicationGroupRequest)");
        }

        Request<IncreaseNodeGroupsInGlobalReplicationGroupRequest> request = new DefaultRequest<IncreaseNodeGroupsInGlobalReplicationGroupRequest>(
                increaseNodeGroupsInGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "IncreaseNodeGroupsInGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (increaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            prefix = "GlobalReplicationGroupId";
            String globalReplicationGroupId = increaseNodeGroupsInGlobalReplicationGroupRequest
                    .getGlobalReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupId));
        }
        if (increaseNodeGroupsInGlobalReplicationGroupRequest.getNodeGroupCount() != null) {
            prefix = "NodeGroupCount";
            Integer nodeGroupCount = increaseNodeGroupsInGlobalReplicationGroupRequest
                    .getNodeGroupCount();
            request.addParameter(prefix, StringUtils.fromInteger(nodeGroupCount));
        }
        if (increaseNodeGroupsInGlobalReplicationGroupRequest.getRegionalConfigurations() != null) {
            prefix = "RegionalConfigurations";
            java.util.List<RegionalConfiguration> regionalConfigurations = increaseNodeGroupsInGlobalReplicationGroupRequest
                    .getRegionalConfigurations();
            int regionalConfigurationsIndex = 1;
            String regionalConfigurationsPrefix = prefix;
            for (RegionalConfiguration regionalConfigurationsItem : regionalConfigurations) {
                prefix = regionalConfigurationsPrefix + "." + regionalConfigurationsIndex;
                if (regionalConfigurationsItem != null) {
                    RegionalConfigurationStaxMarshaller.getInstance().marshall(
                            regionalConfigurationsItem, request, prefix + ".");
                }
                regionalConfigurationsIndex++;
            }
            prefix = regionalConfigurationsPrefix;
        }
        if (increaseNodeGroupsInGlobalReplicationGroupRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = increaseNodeGroupsInGlobalReplicationGroupRequest
                    .getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }

        return request;
    }
}
