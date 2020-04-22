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
 * StAX request marshaller for DescribeEventsRequest
 */
public class DescribeEventsRequestMarshaller implements
        Marshaller<Request<DescribeEventsRequest>, DescribeEventsRequest> {

    public Request<DescribeEventsRequest> marshall(DescribeEventsRequest describeEventsRequest) {
        if (describeEventsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeEventsRequest)");
        }

        Request<DescribeEventsRequest> request = new DefaultRequest<DescribeEventsRequest>(
                describeEventsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeEvents");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeEventsRequest.getSourceIdentifier() != null) {
            prefix = "SourceIdentifier";
            String sourceIdentifier = describeEventsRequest.getSourceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceIdentifier));
        }
        if (describeEventsRequest.getSourceType() != null) {
            prefix = "SourceType";
            String sourceType = describeEventsRequest.getSourceType();
            request.addParameter(prefix, StringUtils.fromString(sourceType));
        }
        if (describeEventsRequest.getStartTime() != null) {
            prefix = "StartTime";
            java.util.Date startTime = describeEventsRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (describeEventsRequest.getEndTime() != null) {
            prefix = "EndTime";
            java.util.Date endTime = describeEventsRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (describeEventsRequest.getDuration() != null) {
            prefix = "Duration";
            Integer duration = describeEventsRequest.getDuration();
            request.addParameter(prefix, StringUtils.fromInteger(duration));
        }
        if (describeEventsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeEventsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeEventsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeEventsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
