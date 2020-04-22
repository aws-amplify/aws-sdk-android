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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeClusterSecurityGroupsRequest
 */
public class DescribeClusterSecurityGroupsRequestMarshaller
        implements
        Marshaller<Request<DescribeClusterSecurityGroupsRequest>, DescribeClusterSecurityGroupsRequest> {

    public Request<DescribeClusterSecurityGroupsRequest> marshall(
            DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest) {
        if (describeClusterSecurityGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeClusterSecurityGroupsRequest)");
        }

        Request<DescribeClusterSecurityGroupsRequest> request = new DefaultRequest<DescribeClusterSecurityGroupsRequest>(
                describeClusterSecurityGroupsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterSecurityGroups");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeClusterSecurityGroupsRequest.getClusterSecurityGroupName() != null) {
            prefix = "ClusterSecurityGroupName";
            String clusterSecurityGroupName = describeClusterSecurityGroupsRequest
                    .getClusterSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSecurityGroupName));
        }
        if (describeClusterSecurityGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeClusterSecurityGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeClusterSecurityGroupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeClusterSecurityGroupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeClusterSecurityGroupsRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = describeClusterSecurityGroupsRequest.getTagKeys();
            int tagKeysIndex = 1;
            String tagKeysPrefix = prefix;
            for (String tagKeysItem : tagKeys) {
                prefix = tagKeysPrefix + "." + tagKeysIndex;
                if (tagKeysItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagKeysItem));
                }
                tagKeysIndex++;
            }
            prefix = tagKeysPrefix;
        }
        if (describeClusterSecurityGroupsRequest.getTagValues() != null) {
            prefix = "TagValues";
            java.util.List<String> tagValues = describeClusterSecurityGroupsRequest.getTagValues();
            int tagValuesIndex = 1;
            String tagValuesPrefix = prefix;
            for (String tagValuesItem : tagValues) {
                prefix = tagValuesPrefix + "." + tagValuesIndex;
                if (tagValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagValuesItem));
                }
                tagValuesIndex++;
            }
            prefix = tagValuesPrefix;
        }

        return request;
    }
}
