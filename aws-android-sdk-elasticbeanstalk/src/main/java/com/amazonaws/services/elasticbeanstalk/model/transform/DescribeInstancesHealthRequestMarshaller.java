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
 * StAX request marshaller for DescribeInstancesHealthRequest
 */
public class DescribeInstancesHealthRequestMarshaller implements
        Marshaller<Request<DescribeInstancesHealthRequest>, DescribeInstancesHealthRequest> {

    public Request<DescribeInstancesHealthRequest> marshall(
            DescribeInstancesHealthRequest describeInstancesHealthRequest) {
        if (describeInstancesHealthRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeInstancesHealthRequest)");
        }

        Request<DescribeInstancesHealthRequest> request = new DefaultRequest<DescribeInstancesHealthRequest>(
                describeInstancesHealthRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeInstancesHealth");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeInstancesHealthRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = describeInstancesHealthRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (describeInstancesHealthRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = describeInstancesHealthRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (describeInstancesHealthRequest.getAttributeNames() != null) {
            prefix = "AttributeNames";
            java.util.List<String> attributeNames = describeInstancesHealthRequest
                    .getAttributeNames();
            int attributeNamesIndex = 1;
            String attributeNamesPrefix = prefix;
            for (String attributeNamesItem : attributeNames) {
                prefix = attributeNamesPrefix + ".member." + attributeNamesIndex;
                if (attributeNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(attributeNamesItem));
                }
                attributeNamesIndex++;
            }
            prefix = attributeNamesPrefix;
        }
        if (describeInstancesHealthRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeInstancesHealthRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
