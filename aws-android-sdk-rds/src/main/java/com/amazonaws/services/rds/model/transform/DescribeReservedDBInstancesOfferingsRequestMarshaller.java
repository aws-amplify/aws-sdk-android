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
 * StAX request marshaller for DescribeReservedDBInstancesOfferingsRequest
 */
public class DescribeReservedDBInstancesOfferingsRequestMarshaller
        implements
        Marshaller<Request<DescribeReservedDBInstancesOfferingsRequest>, DescribeReservedDBInstancesOfferingsRequest> {

    public Request<DescribeReservedDBInstancesOfferingsRequest> marshall(
            DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest) {
        if (describeReservedDBInstancesOfferingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeReservedDBInstancesOfferingsRequest)");
        }

        Request<DescribeReservedDBInstancesOfferingsRequest> request = new DefaultRequest<DescribeReservedDBInstancesOfferingsRequest>(
                describeReservedDBInstancesOfferingsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeReservedDBInstancesOfferings");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeReservedDBInstancesOfferingsRequest.getReservedDBInstancesOfferingId() != null) {
            prefix = "ReservedDBInstancesOfferingId";
            String reservedDBInstancesOfferingId = describeReservedDBInstancesOfferingsRequest
                    .getReservedDBInstancesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstancesOfferingId));
        }
        if (describeReservedDBInstancesOfferingsRequest.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = describeReservedDBInstancesOfferingsRequest
                    .getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (describeReservedDBInstancesOfferingsRequest.getDuration() != null) {
            prefix = "Duration";
            String duration = describeReservedDBInstancesOfferingsRequest.getDuration();
            request.addParameter(prefix, StringUtils.fromString(duration));
        }
        if (describeReservedDBInstancesOfferingsRequest.getProductDescription() != null) {
            prefix = "ProductDescription";
            String productDescription = describeReservedDBInstancesOfferingsRequest
                    .getProductDescription();
            request.addParameter(prefix, StringUtils.fromString(productDescription));
        }
        if (describeReservedDBInstancesOfferingsRequest.getOfferingType() != null) {
            prefix = "OfferingType";
            String offeringType = describeReservedDBInstancesOfferingsRequest.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (describeReservedDBInstancesOfferingsRequest.getMultiAZ() != null) {
            prefix = "MultiAZ";
            Boolean multiAZ = describeReservedDBInstancesOfferingsRequest.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (describeReservedDBInstancesOfferingsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeReservedDBInstancesOfferingsRequest
                    .getFilters();
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
        if (describeReservedDBInstancesOfferingsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeReservedDBInstancesOfferingsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeReservedDBInstancesOfferingsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeReservedDBInstancesOfferingsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
