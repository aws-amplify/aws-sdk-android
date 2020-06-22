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
 * StAX request marshaller for DescribePendingMaintenanceActionsRequest
 */
public class DescribePendingMaintenanceActionsRequestMarshaller
        implements
        Marshaller<Request<DescribePendingMaintenanceActionsRequest>, DescribePendingMaintenanceActionsRequest> {

    public Request<DescribePendingMaintenanceActionsRequest> marshall(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest) {
        if (describePendingMaintenanceActionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribePendingMaintenanceActionsRequest)");
        }

        Request<DescribePendingMaintenanceActionsRequest> request = new DefaultRequest<DescribePendingMaintenanceActionsRequest>(
                describePendingMaintenanceActionsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribePendingMaintenanceActions");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describePendingMaintenanceActionsRequest.getResourceIdentifier() != null) {
            prefix = "ResourceIdentifier";
            String resourceIdentifier = describePendingMaintenanceActionsRequest
                    .getResourceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(resourceIdentifier));
        }
        if (describePendingMaintenanceActionsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describePendingMaintenanceActionsRequest.getFilters();
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
        if (describePendingMaintenanceActionsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describePendingMaintenanceActionsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describePendingMaintenanceActionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describePendingMaintenanceActionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
