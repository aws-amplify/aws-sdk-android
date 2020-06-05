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
 * StAX request marshaller for DescribeEnvironmentsRequest
 */
public class DescribeEnvironmentsRequestMarshaller implements
        Marshaller<Request<DescribeEnvironmentsRequest>, DescribeEnvironmentsRequest> {

    public Request<DescribeEnvironmentsRequest> marshall(
            DescribeEnvironmentsRequest describeEnvironmentsRequest) {
        if (describeEnvironmentsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeEnvironmentsRequest)");
        }

        Request<DescribeEnvironmentsRequest> request = new DefaultRequest<DescribeEnvironmentsRequest>(
                describeEnvironmentsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEnvironments");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeEnvironmentsRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = describeEnvironmentsRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (describeEnvironmentsRequest.getVersionLabel() != null) {
            prefix = "VersionLabel";
            String versionLabel = describeEnvironmentsRequest.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (describeEnvironmentsRequest.getEnvironmentIds() != null) {
            prefix = "EnvironmentIds";
            java.util.List<String> environmentIds = describeEnvironmentsRequest.getEnvironmentIds();
            int environmentIdsIndex = 1;
            String environmentIdsPrefix = prefix;
            for (String environmentIdsItem : environmentIds) {
                prefix = environmentIdsPrefix + ".member." + environmentIdsIndex;
                if (environmentIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(environmentIdsItem));
                }
                environmentIdsIndex++;
            }
            prefix = environmentIdsPrefix;
        }
        if (describeEnvironmentsRequest.getEnvironmentNames() != null) {
            prefix = "EnvironmentNames";
            java.util.List<String> environmentNames = describeEnvironmentsRequest
                    .getEnvironmentNames();
            int environmentNamesIndex = 1;
            String environmentNamesPrefix = prefix;
            for (String environmentNamesItem : environmentNames) {
                prefix = environmentNamesPrefix + ".member." + environmentNamesIndex;
                if (environmentNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(environmentNamesItem));
                }
                environmentNamesIndex++;
            }
            prefix = environmentNamesPrefix;
        }
        if (describeEnvironmentsRequest.getIncludeDeleted() != null) {
            prefix = "IncludeDeleted";
            Boolean includeDeleted = describeEnvironmentsRequest.getIncludeDeleted();
            request.addParameter(prefix, StringUtils.fromBoolean(includeDeleted));
        }
        if (describeEnvironmentsRequest.getIncludedDeletedBackTo() != null) {
            prefix = "IncludedDeletedBackTo";
            java.util.Date includedDeletedBackTo = describeEnvironmentsRequest
                    .getIncludedDeletedBackTo();
            request.addParameter(prefix, StringUtils.fromDate(includedDeletedBackTo));
        }
        if (describeEnvironmentsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeEnvironmentsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeEnvironmentsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeEnvironmentsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
