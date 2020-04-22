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
 * StAX request marshaller for DescribeScheduledActionsRequest
 */
public class DescribeScheduledActionsRequestMarshaller implements
        Marshaller<Request<DescribeScheduledActionsRequest>, DescribeScheduledActionsRequest> {

    public Request<DescribeScheduledActionsRequest> marshall(
            DescribeScheduledActionsRequest describeScheduledActionsRequest) {
        if (describeScheduledActionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeScheduledActionsRequest)");
        }

        Request<DescribeScheduledActionsRequest> request = new DefaultRequest<DescribeScheduledActionsRequest>(
                describeScheduledActionsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeScheduledActions");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeScheduledActionsRequest.getScheduledActionName() != null) {
            prefix = "ScheduledActionName";
            String scheduledActionName = describeScheduledActionsRequest.getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }
        if (describeScheduledActionsRequest.getTargetActionType() != null) {
            prefix = "TargetActionType";
            String targetActionType = describeScheduledActionsRequest.getTargetActionType();
            request.addParameter(prefix, StringUtils.fromString(targetActionType));
        }
        if (describeScheduledActionsRequest.getStartTime() != null) {
            prefix = "StartTime";
            java.util.Date startTime = describeScheduledActionsRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (describeScheduledActionsRequest.getEndTime() != null) {
            prefix = "EndTime";
            java.util.Date endTime = describeScheduledActionsRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (describeScheduledActionsRequest.getActive() != null) {
            prefix = "Active";
            Boolean active = describeScheduledActionsRequest.getActive();
            request.addParameter(prefix, StringUtils.fromBoolean(active));
        }
        if (describeScheduledActionsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<ScheduledActionFilter> filters = describeScheduledActionsRequest
                    .getFilters();
            int filtersIndex = 1;
            String filtersPrefix = prefix;
            for (ScheduledActionFilter filtersItem : filters) {
                prefix = filtersPrefix + "." + filtersIndex;
                if (filtersItem != null) {
                    ScheduledActionFilterStaxMarshaller.getInstance().marshall(filtersItem,
                            request, prefix + ".");
                }
                filtersIndex++;
            }
            prefix = filtersPrefix;
        }
        if (describeScheduledActionsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeScheduledActionsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeScheduledActionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeScheduledActionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
