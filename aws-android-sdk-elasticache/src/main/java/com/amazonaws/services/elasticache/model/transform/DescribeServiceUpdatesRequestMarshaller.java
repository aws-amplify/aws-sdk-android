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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeServiceUpdatesRequest
 */
public class DescribeServiceUpdatesRequestMarshaller implements
        Marshaller<Request<DescribeServiceUpdatesRequest>, DescribeServiceUpdatesRequest> {

    public Request<DescribeServiceUpdatesRequest> marshall(
            DescribeServiceUpdatesRequest describeServiceUpdatesRequest) {
        if (describeServiceUpdatesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeServiceUpdatesRequest)");
        }

        Request<DescribeServiceUpdatesRequest> request = new DefaultRequest<DescribeServiceUpdatesRequest>(
                describeServiceUpdatesRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeServiceUpdates");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeServiceUpdatesRequest.getServiceUpdateName() != null) {
            prefix = "ServiceUpdateName";
            String serviceUpdateName = describeServiceUpdatesRequest.getServiceUpdateName();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateName));
        }
        if (describeServiceUpdatesRequest.getServiceUpdateStatus() != null) {
            prefix = "ServiceUpdateStatus";
            java.util.List<String> serviceUpdateStatus = describeServiceUpdatesRequest
                    .getServiceUpdateStatus();
            int serviceUpdateStatusIndex = 1;
            String serviceUpdateStatusPrefix = prefix;
            for (String serviceUpdateStatusItem : serviceUpdateStatus) {
                prefix = serviceUpdateStatusPrefix + ".member." + serviceUpdateStatusIndex;
                if (serviceUpdateStatusItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(serviceUpdateStatusItem));
                }
                serviceUpdateStatusIndex++;
            }
            prefix = serviceUpdateStatusPrefix;
        }
        if (describeServiceUpdatesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeServiceUpdatesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeServiceUpdatesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeServiceUpdatesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
