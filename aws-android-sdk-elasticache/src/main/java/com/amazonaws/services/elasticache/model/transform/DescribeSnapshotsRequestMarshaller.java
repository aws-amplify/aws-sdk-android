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
 * StAX request marshaller for DescribeSnapshotsRequest
 */
public class DescribeSnapshotsRequestMarshaller implements
        Marshaller<Request<DescribeSnapshotsRequest>, DescribeSnapshotsRequest> {

    public Request<DescribeSnapshotsRequest> marshall(
            DescribeSnapshotsRequest describeSnapshotsRequest) {
        if (describeSnapshotsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeSnapshotsRequest)");
        }

        Request<DescribeSnapshotsRequest> request = new DefaultRequest<DescribeSnapshotsRequest>(
                describeSnapshotsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeSnapshots");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeSnapshotsRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = describeSnapshotsRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (describeSnapshotsRequest.getCacheClusterId() != null) {
            prefix = "CacheClusterId";
            String cacheClusterId = describeSnapshotsRequest.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (describeSnapshotsRequest.getSnapshotName() != null) {
            prefix = "SnapshotName";
            String snapshotName = describeSnapshotsRequest.getSnapshotName();
            request.addParameter(prefix, StringUtils.fromString(snapshotName));
        }
        if (describeSnapshotsRequest.getSnapshotSource() != null) {
            prefix = "SnapshotSource";
            String snapshotSource = describeSnapshotsRequest.getSnapshotSource();
            request.addParameter(prefix, StringUtils.fromString(snapshotSource));
        }
        if (describeSnapshotsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeSnapshotsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeSnapshotsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeSnapshotsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeSnapshotsRequest.getShowNodeGroupConfig() != null) {
            prefix = "ShowNodeGroupConfig";
            Boolean showNodeGroupConfig = describeSnapshotsRequest.getShowNodeGroupConfig();
            request.addParameter(prefix, StringUtils.fromBoolean(showNodeGroupConfig));
        }

        return request;
    }
}
