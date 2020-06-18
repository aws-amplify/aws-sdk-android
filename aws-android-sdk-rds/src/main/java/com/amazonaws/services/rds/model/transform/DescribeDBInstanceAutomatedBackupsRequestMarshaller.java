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
 * StAX request marshaller for DescribeDBInstanceAutomatedBackupsRequest
 */
public class DescribeDBInstanceAutomatedBackupsRequestMarshaller
        implements
        Marshaller<Request<DescribeDBInstanceAutomatedBackupsRequest>, DescribeDBInstanceAutomatedBackupsRequest> {

    public Request<DescribeDBInstanceAutomatedBackupsRequest> marshall(
            DescribeDBInstanceAutomatedBackupsRequest describeDBInstanceAutomatedBackupsRequest) {
        if (describeDBInstanceAutomatedBackupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeDBInstanceAutomatedBackupsRequest)");
        }

        Request<DescribeDBInstanceAutomatedBackupsRequest> request = new DefaultRequest<DescribeDBInstanceAutomatedBackupsRequest>(
                describeDBInstanceAutomatedBackupsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeDBInstanceAutomatedBackups");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeDBInstanceAutomatedBackupsRequest.getDbiResourceId() != null) {
            prefix = "DbiResourceId";
            String dbiResourceId = describeDBInstanceAutomatedBackupsRequest.getDbiResourceId();
            request.addParameter(prefix, StringUtils.fromString(dbiResourceId));
        }
        if (describeDBInstanceAutomatedBackupsRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = describeDBInstanceAutomatedBackupsRequest
                    .getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (describeDBInstanceAutomatedBackupsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeDBInstanceAutomatedBackupsRequest.getFilters();
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
        if (describeDBInstanceAutomatedBackupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeDBInstanceAutomatedBackupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeDBInstanceAutomatedBackupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeDBInstanceAutomatedBackupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
