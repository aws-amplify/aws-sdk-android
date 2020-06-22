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
 * StAX request marshaller for DescribeReservedDBInstancesRequest
 */
public class DescribeReservedDBInstancesRequestMarshaller implements
        Marshaller<Request<DescribeReservedDBInstancesRequest>, DescribeReservedDBInstancesRequest> {

    public Request<DescribeReservedDBInstancesRequest> marshall(
            DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest) {
        if (describeReservedDBInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeReservedDBInstancesRequest)");
        }

        Request<DescribeReservedDBInstancesRequest> request = new DefaultRequest<DescribeReservedDBInstancesRequest>(
                describeReservedDBInstancesRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeReservedDBInstances");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeReservedDBInstancesRequest.getReservedDBInstanceId() != null) {
            prefix = "ReservedDBInstanceId";
            String reservedDBInstanceId = describeReservedDBInstancesRequest
                    .getReservedDBInstanceId();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstanceId));
        }
        if (describeReservedDBInstancesRequest.getReservedDBInstancesOfferingId() != null) {
            prefix = "ReservedDBInstancesOfferingId";
            String reservedDBInstancesOfferingId = describeReservedDBInstancesRequest
                    .getReservedDBInstancesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstancesOfferingId));
        }
        if (describeReservedDBInstancesRequest.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = describeReservedDBInstancesRequest.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (describeReservedDBInstancesRequest.getDuration() != null) {
            prefix = "Duration";
            String duration = describeReservedDBInstancesRequest.getDuration();
            request.addParameter(prefix, StringUtils.fromString(duration));
        }
        if (describeReservedDBInstancesRequest.getProductDescription() != null) {
            prefix = "ProductDescription";
            String productDescription = describeReservedDBInstancesRequest.getProductDescription();
            request.addParameter(prefix, StringUtils.fromString(productDescription));
        }
        if (describeReservedDBInstancesRequest.getOfferingType() != null) {
            prefix = "OfferingType";
            String offeringType = describeReservedDBInstancesRequest.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (describeReservedDBInstancesRequest.getMultiAZ() != null) {
            prefix = "MultiAZ";
            Boolean multiAZ = describeReservedDBInstancesRequest.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (describeReservedDBInstancesRequest.getLeaseId() != null) {
            prefix = "LeaseId";
            String leaseId = describeReservedDBInstancesRequest.getLeaseId();
            request.addParameter(prefix, StringUtils.fromString(leaseId));
        }
        if (describeReservedDBInstancesRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeReservedDBInstancesRequest.getFilters();
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
        if (describeReservedDBInstancesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeReservedDBInstancesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeReservedDBInstancesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeReservedDBInstancesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
