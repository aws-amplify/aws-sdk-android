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
 * StAX request marshaller for DescribeAlarmsRequest
 */
public class DescribeAlarmsRequestMarshaller implements
        Marshaller<Request<DescribeAlarmsRequest>, DescribeAlarmsRequest> {

    public Request<DescribeAlarmsRequest> marshall(DescribeAlarmsRequest describeAlarmsRequest) {
        if (describeAlarmsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeAlarmsRequest)");
        }

        Request<DescribeAlarmsRequest> request = new DefaultRequest<DescribeAlarmsRequest>(
                describeAlarmsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DescribeAlarms");
        request.addParameter("Version", "2010-08-01");

        String prefix;
        if (describeAlarmsRequest.getAlarmNames() != null) {
            prefix = "AlarmNames";
            java.util.List<String> alarmNames = describeAlarmsRequest.getAlarmNames();
            int alarmNamesIndex = 1;
            String alarmNamesPrefix = prefix;
            for (String alarmNamesItem : alarmNames) {
                prefix = alarmNamesPrefix + ".member." + alarmNamesIndex;
                if (alarmNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(alarmNamesItem));
                }
                alarmNamesIndex++;
            }
            prefix = alarmNamesPrefix;
        }
        if (describeAlarmsRequest.getAlarmNamePrefix() != null) {
            prefix = "AlarmNamePrefix";
            String alarmNamePrefix = describeAlarmsRequest.getAlarmNamePrefix();
            request.addParameter(prefix, StringUtils.fromString(alarmNamePrefix));
        }
        if (describeAlarmsRequest.getStateValue() != null) {
            prefix = "StateValue";
            String stateValue = describeAlarmsRequest.getStateValue();
            request.addParameter(prefix, StringUtils.fromString(stateValue));
        }
        if (describeAlarmsRequest.getActionPrefix() != null) {
            prefix = "ActionPrefix";
            String actionPrefix = describeAlarmsRequest.getActionPrefix();
            request.addParameter(prefix, StringUtils.fromString(actionPrefix));
        }
        if (describeAlarmsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeAlarmsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeAlarmsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeAlarmsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
