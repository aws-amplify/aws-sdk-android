/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudwatch.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeAlarmHistoryRequest
 */
public class DescribeAlarmHistoryRequestMarshaller implements
        Marshaller<Request<DescribeAlarmHistoryRequest>, DescribeAlarmHistoryRequest> {

    public Request<DescribeAlarmHistoryRequest> marshall(
            DescribeAlarmHistoryRequest describeAlarmHistoryRequest) {
        if (describeAlarmHistoryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeAlarmHistoryRequest)");
        }

        Request<DescribeAlarmHistoryRequest> request = new DefaultRequest<DescribeAlarmHistoryRequest>(
                describeAlarmHistoryRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DescribeAlarmHistory");
        request.addParameter("Version", "2010-08-01");

        String prefix;
        if (describeAlarmHistoryRequest.getAlarmName() != null) {
            prefix = "AlarmName";
            String alarmName = describeAlarmHistoryRequest.getAlarmName();
            request.addParameter(prefix, StringUtils.fromString(alarmName));
        }
        if (describeAlarmHistoryRequest.getHistoryItemType() != null) {
            prefix = "HistoryItemType";
            String historyItemType = describeAlarmHistoryRequest.getHistoryItemType();
            request.addParameter(prefix, StringUtils.fromString(historyItemType));
        }
        if (describeAlarmHistoryRequest.getStartDate() != null) {
            prefix = "StartDate";
            java.util.Date startDate = describeAlarmHistoryRequest.getStartDate();
            request.addParameter(prefix, StringUtils.fromDate(startDate));
        }
        if (describeAlarmHistoryRequest.getEndDate() != null) {
            prefix = "EndDate";
            java.util.Date endDate = describeAlarmHistoryRequest.getEndDate();
            request.addParameter(prefix, StringUtils.fromDate(endDate));
        }
        if (describeAlarmHistoryRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeAlarmHistoryRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeAlarmHistoryRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeAlarmHistoryRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
