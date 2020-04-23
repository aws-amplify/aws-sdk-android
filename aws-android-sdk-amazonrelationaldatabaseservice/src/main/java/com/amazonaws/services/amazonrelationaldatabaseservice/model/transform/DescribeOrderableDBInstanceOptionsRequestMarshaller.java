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
 * StAX request marshaller for DescribeOrderableDBInstanceOptionsRequest
 */
public class DescribeOrderableDBInstanceOptionsRequestMarshaller
        implements
        Marshaller<Request<DescribeOrderableDBInstanceOptionsRequest>, DescribeOrderableDBInstanceOptionsRequest> {

    public Request<DescribeOrderableDBInstanceOptionsRequest> marshall(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest) {
        if (describeOrderableDBInstanceOptionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeOrderableDBInstanceOptionsRequest)");
        }

        Request<DescribeOrderableDBInstanceOptionsRequest> request = new DefaultRequest<DescribeOrderableDBInstanceOptionsRequest>(
                describeOrderableDBInstanceOptionsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeOrderableDBInstanceOptions");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeOrderableDBInstanceOptionsRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = describeOrderableDBInstanceOptionsRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (describeOrderableDBInstanceOptionsRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = describeOrderableDBInstanceOptionsRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (describeOrderableDBInstanceOptionsRequest.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = describeOrderableDBInstanceOptionsRequest.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (describeOrderableDBInstanceOptionsRequest.getLicenseModel() != null) {
            prefix = "LicenseModel";
            String licenseModel = describeOrderableDBInstanceOptionsRequest.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (describeOrderableDBInstanceOptionsRequest.getAvailabilityZoneGroup() != null) {
            prefix = "AvailabilityZoneGroup";
            String availabilityZoneGroup = describeOrderableDBInstanceOptionsRequest
                    .getAvailabilityZoneGroup();
            request.addParameter(prefix, StringUtils.fromString(availabilityZoneGroup));
        }
        if (describeOrderableDBInstanceOptionsRequest.getVpc() != null) {
            prefix = "Vpc";
            Boolean vpc = describeOrderableDBInstanceOptionsRequest.getVpc();
            request.addParameter(prefix, StringUtils.fromBoolean(vpc));
        }
        if (describeOrderableDBInstanceOptionsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeOrderableDBInstanceOptionsRequest.getFilters();
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
        if (describeOrderableDBInstanceOptionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeOrderableDBInstanceOptionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeOrderableDBInstanceOptionsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeOrderableDBInstanceOptionsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
