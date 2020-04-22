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
 * StAX request marshaller for DescribeClusterSubnetGroupsRequest
 */
public class DescribeClusterSubnetGroupsRequestMarshaller implements
        Marshaller<Request<DescribeClusterSubnetGroupsRequest>, DescribeClusterSubnetGroupsRequest> {

    public Request<DescribeClusterSubnetGroupsRequest> marshall(
            DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest) {
        if (describeClusterSubnetGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeClusterSubnetGroupsRequest)");
        }

        Request<DescribeClusterSubnetGroupsRequest> request = new DefaultRequest<DescribeClusterSubnetGroupsRequest>(
                describeClusterSubnetGroupsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterSubnetGroups");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeClusterSubnetGroupsRequest.getClusterSubnetGroupName() != null) {
            prefix = "ClusterSubnetGroupName";
            String clusterSubnetGroupName = describeClusterSubnetGroupsRequest
                    .getClusterSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSubnetGroupName));
        }
        if (describeClusterSubnetGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeClusterSubnetGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeClusterSubnetGroupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeClusterSubnetGroupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeClusterSubnetGroupsRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = describeClusterSubnetGroupsRequest.getTagKeys();
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
        if (describeClusterSubnetGroupsRequest.getTagValues() != null) {
            prefix = "TagValues";
            java.util.List<String> tagValues = describeClusterSubnetGroupsRequest.getTagValues();
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
