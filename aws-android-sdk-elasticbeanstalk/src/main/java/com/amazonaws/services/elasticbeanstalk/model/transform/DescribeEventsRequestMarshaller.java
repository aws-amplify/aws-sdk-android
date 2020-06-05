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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
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
                describeEventsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEvents");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeEventsRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = describeEventsRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (describeEventsRequest.getVersionLabel() != null) {
            prefix = "VersionLabel";
            String versionLabel = describeEventsRequest.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (describeEventsRequest.getTemplateName() != null) {
            prefix = "TemplateName";
            String templateName = describeEventsRequest.getTemplateName();
            request.addParameter(prefix, StringUtils.fromString(templateName));
        }
        if (describeEventsRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = describeEventsRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (describeEventsRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = describeEventsRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (describeEventsRequest.getPlatformArn() != null) {
            prefix = "PlatformArn";
            String platformArn = describeEventsRequest.getPlatformArn();
            request.addParameter(prefix, StringUtils.fromString(platformArn));
        }
        if (describeEventsRequest.getRequestId() != null) {
            prefix = "RequestId";
            String requestId = describeEventsRequest.getRequestId();
            request.addParameter(prefix, StringUtils.fromString(requestId));
        }
        if (describeEventsRequest.getSeverity() != null) {
            prefix = "Severity";
            String severity = describeEventsRequest.getSeverity();
            request.addParameter(prefix, StringUtils.fromString(severity));
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
        if (describeEventsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeEventsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeEventsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeEventsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
