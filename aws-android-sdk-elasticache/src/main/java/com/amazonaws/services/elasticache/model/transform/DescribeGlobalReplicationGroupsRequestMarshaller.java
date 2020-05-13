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
 * StAX request marshaller for DescribeGlobalReplicationGroupsRequest
 */
public class DescribeGlobalReplicationGroupsRequestMarshaller
        implements
        Marshaller<Request<DescribeGlobalReplicationGroupsRequest>, DescribeGlobalReplicationGroupsRequest> {

    public Request<DescribeGlobalReplicationGroupsRequest> marshall(
            DescribeGlobalReplicationGroupsRequest describeGlobalReplicationGroupsRequest) {
        if (describeGlobalReplicationGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeGlobalReplicationGroupsRequest)");
        }

        Request<DescribeGlobalReplicationGroupsRequest> request = new DefaultRequest<DescribeGlobalReplicationGroupsRequest>(
                describeGlobalReplicationGroupsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeGlobalReplicationGroups");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeGlobalReplicationGroupsRequest.getGlobalReplicationGroupId() != null) {
            prefix = "GlobalReplicationGroupId";
            String globalReplicationGroupId = describeGlobalReplicationGroupsRequest
                    .getGlobalReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupId));
        }
        if (describeGlobalReplicationGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeGlobalReplicationGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeGlobalReplicationGroupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeGlobalReplicationGroupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeGlobalReplicationGroupsRequest.getShowMemberInfo() != null) {
            prefix = "ShowMemberInfo";
            Boolean showMemberInfo = describeGlobalReplicationGroupsRequest.getShowMemberInfo();
            request.addParameter(prefix, StringUtils.fromBoolean(showMemberInfo));
        }

        return request;
    }
}
