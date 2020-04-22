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
 * StAX request marshaller for DescribeClusterSnapshotsRequest
 */
public class DescribeClusterSnapshotsRequestMarshaller implements
        Marshaller<Request<DescribeClusterSnapshotsRequest>, DescribeClusterSnapshotsRequest> {

    public Request<DescribeClusterSnapshotsRequest> marshall(
            DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) {
        if (describeClusterSnapshotsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeClusterSnapshotsRequest)");
        }

        Request<DescribeClusterSnapshotsRequest> request = new DefaultRequest<DescribeClusterSnapshotsRequest>(
                describeClusterSnapshotsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterSnapshots");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeClusterSnapshotsRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = describeClusterSnapshotsRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (describeClusterSnapshotsRequest.getSnapshotIdentifier() != null) {
            prefix = "SnapshotIdentifier";
            String snapshotIdentifier = describeClusterSnapshotsRequest.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (describeClusterSnapshotsRequest.getSnapshotType() != null) {
            prefix = "SnapshotType";
            String snapshotType = describeClusterSnapshotsRequest.getSnapshotType();
            request.addParameter(prefix, StringUtils.fromString(snapshotType));
        }
        if (describeClusterSnapshotsRequest.getStartTime() != null) {
            prefix = "StartTime";
            java.util.Date startTime = describeClusterSnapshotsRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (describeClusterSnapshotsRequest.getEndTime() != null) {
            prefix = "EndTime";
            java.util.Date endTime = describeClusterSnapshotsRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (describeClusterSnapshotsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeClusterSnapshotsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeClusterSnapshotsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeClusterSnapshotsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeClusterSnapshotsRequest.getOwnerAccount() != null) {
            prefix = "OwnerAccount";
            String ownerAccount = describeClusterSnapshotsRequest.getOwnerAccount();
            request.addParameter(prefix, StringUtils.fromString(ownerAccount));
        }
        if (describeClusterSnapshotsRequest.getTagKeys() != null) {
            prefix = "TagKeys";
            java.util.List<String> tagKeys = describeClusterSnapshotsRequest.getTagKeys();
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
        if (describeClusterSnapshotsRequest.getTagValues() != null) {
            prefix = "TagValues";
            java.util.List<String> tagValues = describeClusterSnapshotsRequest.getTagValues();
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
        if (describeClusterSnapshotsRequest.getClusterExists() != null) {
            prefix = "ClusterExists";
            Boolean clusterExists = describeClusterSnapshotsRequest.getClusterExists();
            request.addParameter(prefix, StringUtils.fromBoolean(clusterExists));
        }
        if (describeClusterSnapshotsRequest.getSortingEntities() != null) {
            prefix = "SortingEntities";
            java.util.List<SnapshotSortingEntity> sortingEntities = describeClusterSnapshotsRequest
                    .getSortingEntities();
            int sortingEntitiesIndex = 1;
            String sortingEntitiesPrefix = prefix;
            for (SnapshotSortingEntity sortingEntitiesItem : sortingEntities) {
                prefix = sortingEntitiesPrefix + "." + sortingEntitiesIndex;
                if (sortingEntitiesItem != null) {
                    SnapshotSortingEntityStaxMarshaller.getInstance().marshall(sortingEntitiesItem,
                            request, prefix + ".");
                }
                sortingEntitiesIndex++;
            }
            prefix = sortingEntitiesPrefix;
        }

        return request;
    }
}
