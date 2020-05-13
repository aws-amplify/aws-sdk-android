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
 * StAX request marshaller for DescribeReplicationGroupsRequest
 */
public class DescribeReplicationGroupsRequestMarshaller implements
        Marshaller<Request<DescribeReplicationGroupsRequest>, DescribeReplicationGroupsRequest> {

    public Request<DescribeReplicationGroupsRequest> marshall(
            DescribeReplicationGroupsRequest describeReplicationGroupsRequest) {
        if (describeReplicationGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeReplicationGroupsRequest)");
        }

        Request<DescribeReplicationGroupsRequest> request = new DefaultRequest<DescribeReplicationGroupsRequest>(
                describeReplicationGroupsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeReplicationGroups");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeReplicationGroupsRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = describeReplicationGroupsRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (describeReplicationGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeReplicationGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeReplicationGroupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeReplicationGroupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
