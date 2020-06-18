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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeDBSnapshotsRequest
 */
public class DescribeDBSnapshotsRequestMarshaller implements
        Marshaller<Request<DescribeDBSnapshotsRequest>, DescribeDBSnapshotsRequest> {

    public Request<DescribeDBSnapshotsRequest> marshall(
            DescribeDBSnapshotsRequest describeDBSnapshotsRequest) {
        if (describeDBSnapshotsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeDBSnapshotsRequest)");
        }

        Request<DescribeDBSnapshotsRequest> request = new DefaultRequest<DescribeDBSnapshotsRequest>(
                describeDBSnapshotsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeDBSnapshots");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeDBSnapshotsRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = describeDBSnapshotsRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (describeDBSnapshotsRequest.getDBSnapshotIdentifier() != null) {
            prefix = "DBSnapshotIdentifier";
            String dBSnapshotIdentifier = describeDBSnapshotsRequest.getDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBSnapshotIdentifier));
        }
        if (describeDBSnapshotsRequest.getSnapshotType() != null) {
            prefix = "SnapshotType";
            String snapshotType = describeDBSnapshotsRequest.getSnapshotType();
            request.addParameter(prefix, StringUtils.fromString(snapshotType));
        }
        if (describeDBSnapshotsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeDBSnapshotsRequest.getFilters();
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
        if (describeDBSnapshotsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeDBSnapshotsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeDBSnapshotsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeDBSnapshotsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeDBSnapshotsRequest.getIncludeShared() != null) {
            prefix = "IncludeShared";
            Boolean includeShared = describeDBSnapshotsRequest.getIncludeShared();
            request.addParameter(prefix, StringUtils.fromBoolean(includeShared));
        }
        if (describeDBSnapshotsRequest.getIncludePublic() != null) {
            prefix = "IncludePublic";
            Boolean includePublic = describeDBSnapshotsRequest.getIncludePublic();
            request.addParameter(prefix, StringUtils.fromBoolean(includePublic));
        }
        if (describeDBSnapshotsRequest.getDbiResourceId() != null) {
            prefix = "DbiResourceId";
            String dbiResourceId = describeDBSnapshotsRequest.getDbiResourceId();
            request.addParameter(prefix, StringUtils.fromString(dbiResourceId));
        }

        return request;
    }
}
