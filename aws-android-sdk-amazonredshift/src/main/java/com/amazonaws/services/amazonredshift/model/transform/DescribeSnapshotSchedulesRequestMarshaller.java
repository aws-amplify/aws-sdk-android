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
 * StAX request marshaller for DescribeSnapshotSchedulesRequest
 */
public class DescribeSnapshotSchedulesRequestMarshaller implements
        Marshaller<Request<DescribeSnapshotSchedulesRequest>, DescribeSnapshotSchedulesRequest> {

    public Request<DescribeSnapshotSchedulesRequest> marshall(
            DescribeSnapshotSchedulesRequest describeSnapshotSchedulesRequest) {
        if (describeSnapshotSchedulesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeSnapshotSchedulesRequest)");
        }

        Request<DescribeSnapshotSchedulesRequest> request = new DefaultRequest<DescribeSnapshotSchedulesRequest>(
                describeSnapshotSchedulesRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeSnapshotSchedules");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeSnapshotSchedulesRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = describeSnapshotSchedulesRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (describeSnapshotSchedulesRequest.getScheduleIdentifier() != null) {
            prefix = "ScheduleIdentifier";
            String scheduleIdentifier = describeSnapshotSchedulesRequest.getScheduleIdentifier();
            request.addParameter(prefix, StringUtils.fromString(scheduleIdentifier));
        }
        if (describeSnapshotSchedulesRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = describeSnapshotSchedulesRequest.getTagKeys();
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
        if (describeSnapshotSchedulesRequest.getTagValues() != null) {
            prefix = "TagValues";
            java.util.List<String> tagValues = describeSnapshotSchedulesRequest.getTagValues();
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
        if (describeSnapshotSchedulesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeSnapshotSchedulesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeSnapshotSchedulesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeSnapshotSchedulesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
