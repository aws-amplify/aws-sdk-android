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
 * StAX request marshaller for DescribeUpdateActionsRequest
 */
public class DescribeUpdateActionsRequestMarshaller implements
        Marshaller<Request<DescribeUpdateActionsRequest>, DescribeUpdateActionsRequest> {

    public Request<DescribeUpdateActionsRequest> marshall(
            DescribeUpdateActionsRequest describeUpdateActionsRequest) {
        if (describeUpdateActionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeUpdateActionsRequest)");
        }

        Request<DescribeUpdateActionsRequest> request = new DefaultRequest<DescribeUpdateActionsRequest>(
                describeUpdateActionsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeUpdateActions");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeUpdateActionsRequest.getServiceUpdateName() != null) {
            prefix = "ServiceUpdateName";
            String serviceUpdateName = describeUpdateActionsRequest.getServiceUpdateName();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateName));
        }
        if (describeUpdateActionsRequest.getReplicationGroupIds() != null) {
            prefix = "ReplicationGroupIds";
            java.util.List<String> replicationGroupIds = describeUpdateActionsRequest
                    .getReplicationGroupIds();
            int replicationGroupIdsIndex = 1;
            String replicationGroupIdsPrefix = prefix;
            for (String replicationGroupIdsItem : replicationGroupIds) {
                prefix = replicationGroupIdsPrefix + ".member." + replicationGroupIdsIndex;
                if (replicationGroupIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(replicationGroupIdsItem));
                }
                replicationGroupIdsIndex++;
            }
            prefix = replicationGroupIdsPrefix;
        }
        if (describeUpdateActionsRequest.getCacheClusterIds() != null) {
            prefix = "CacheClusterIds";
            java.util.List<String> cacheClusterIds = describeUpdateActionsRequest
                    .getCacheClusterIds();
            int cacheClusterIdsIndex = 1;
            String cacheClusterIdsPrefix = prefix;
            for (String cacheClusterIdsItem : cacheClusterIds) {
                prefix = cacheClusterIdsPrefix + ".member." + cacheClusterIdsIndex;
                if (cacheClusterIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(cacheClusterIdsItem));
                }
                cacheClusterIdsIndex++;
            }
            prefix = cacheClusterIdsPrefix;
        }
        if (describeUpdateActionsRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = describeUpdateActionsRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (describeUpdateActionsRequest.getServiceUpdateStatus() != null) {
            prefix = "ServiceUpdateStatus";
            java.util.List<String> serviceUpdateStatus = describeUpdateActionsRequest
                    .getServiceUpdateStatus();
            int serviceUpdateStatusIndex = 1;
            String serviceUpdateStatusPrefix = prefix;
            for (String serviceUpdateStatusItem : serviceUpdateStatus) {
                prefix = serviceUpdateStatusPrefix + ".member." + serviceUpdateStatusIndex;
                if (serviceUpdateStatusItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(serviceUpdateStatusItem));
                }
                serviceUpdateStatusIndex++;
            }
            prefix = serviceUpdateStatusPrefix;
        }
        if (describeUpdateActionsRequest.getServiceUpdateTimeRange() != null) {
            prefix = "ServiceUpdateTimeRange";
            TimeRangeFilter serviceUpdateTimeRange = describeUpdateActionsRequest
                    .getServiceUpdateTimeRange();
            TimeRangeFilterStaxMarshaller.getInstance().marshall(serviceUpdateTimeRange, request,
                    prefix + ".");
        }
        if (describeUpdateActionsRequest.getUpdateActionStatus() != null) {
            prefix = "UpdateActionStatus";
            java.util.List<String> updateActionStatus = describeUpdateActionsRequest
                    .getUpdateActionStatus();
            int updateActionStatusIndex = 1;
            String updateActionStatusPrefix = prefix;
            for (String updateActionStatusItem : updateActionStatus) {
                prefix = updateActionStatusPrefix + ".member." + updateActionStatusIndex;
                if (updateActionStatusItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(updateActionStatusItem));
                }
                updateActionStatusIndex++;
            }
            prefix = updateActionStatusPrefix;
        }
        if (describeUpdateActionsRequest.getShowNodeLevelUpdateStatus() != null) {
            prefix = "ShowNodeLevelUpdateStatus";
            Boolean showNodeLevelUpdateStatus = describeUpdateActionsRequest
                    .getShowNodeLevelUpdateStatus();
            request.addParameter(prefix, StringUtils.fromBoolean(showNodeLevelUpdateStatus));
        }
        if (describeUpdateActionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeUpdateActionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeUpdateActionsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeUpdateActionsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
