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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeDBClusterSnapshotsRequest
 */
public class DescribeDBClusterSnapshotsRequestMarshaller implements
        Marshaller<Request<DescribeDBClusterSnapshotsRequest>, DescribeDBClusterSnapshotsRequest> {

    public Request<DescribeDBClusterSnapshotsRequest> marshall(
            DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest) {
        if (describeDBClusterSnapshotsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeDBClusterSnapshotsRequest)");
        }

        Request<DescribeDBClusterSnapshotsRequest> request = new DefaultRequest<DescribeDBClusterSnapshotsRequest>(
                describeDBClusterSnapshotsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeDBClusterSnapshots");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeDBClusterSnapshotsRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = describeDBClusterSnapshotsRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (describeDBClusterSnapshotsRequest.getDBClusterSnapshotIdentifier() != null) {
            prefix = "DBClusterSnapshotIdentifier";
            String dBClusterSnapshotIdentifier = describeDBClusterSnapshotsRequest
                    .getDBClusterSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterSnapshotIdentifier));
        }
        if (describeDBClusterSnapshotsRequest.getSnapshotType() != null) {
            prefix = "SnapshotType";
            String snapshotType = describeDBClusterSnapshotsRequest.getSnapshotType();
            request.addParameter(prefix, StringUtils.fromString(snapshotType));
        }
        if (describeDBClusterSnapshotsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeDBClusterSnapshotsRequest.getFilters();
            int filtersIndex = 1;
            String filtersPrefix = prefix;
            for (Filter filtersItem : filters) {
                prefix = filtersPrefix + "." + filtersIndex;
                if (filtersItem != null) {
                    FilterStaxMarshaller.getInstance().marshall(filtersItem, request, prefix + ".");
                }
                filtersIndex++;
            }
            prefix = filtersPrefix;
        }
        if (describeDBClusterSnapshotsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeDBClusterSnapshotsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeDBClusterSnapshotsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeDBClusterSnapshotsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeDBClusterSnapshotsRequest.getIncludeShared() != null) {
            prefix = "IncludeShared";
            Boolean includeShared = describeDBClusterSnapshotsRequest.getIncludeShared();
            request.addParameter(prefix, StringUtils.fromBoolean(includeShared));
        }
        if (describeDBClusterSnapshotsRequest.getIncludePublic() != null) {
            prefix = "IncludePublic";
            Boolean includePublic = describeDBClusterSnapshotsRequest.getIncludePublic();
            request.addParameter(prefix, StringUtils.fromBoolean(includePublic));
        }

        return request;
    }
}
