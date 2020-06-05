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
 * StAX request marshaller for DescribeApplicationVersionsRequest
 */
public class DescribeApplicationVersionsRequestMarshaller implements
        Marshaller<Request<DescribeApplicationVersionsRequest>, DescribeApplicationVersionsRequest> {

    public Request<DescribeApplicationVersionsRequest> marshall(
            DescribeApplicationVersionsRequest describeApplicationVersionsRequest) {
        if (describeApplicationVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeApplicationVersionsRequest)");
        }

        Request<DescribeApplicationVersionsRequest> request = new DefaultRequest<DescribeApplicationVersionsRequest>(
                describeApplicationVersionsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeApplicationVersions");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeApplicationVersionsRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = describeApplicationVersionsRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (describeApplicationVersionsRequest.getVersionLabels() != null) {
            prefix = "VersionLabels";
            java.util.List<String> versionLabels = describeApplicationVersionsRequest
                    .getVersionLabels();
            int versionLabelsIndex = 1;
            String versionLabelsPrefix = prefix;
            for (String versionLabelsItem : versionLabels) {
                prefix = versionLabelsPrefix + ".member." + versionLabelsIndex;
                if (versionLabelsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(versionLabelsItem));
                }
                versionLabelsIndex++;
            }
            prefix = versionLabelsPrefix;
        }
        if (describeApplicationVersionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeApplicationVersionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeApplicationVersionsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeApplicationVersionsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
