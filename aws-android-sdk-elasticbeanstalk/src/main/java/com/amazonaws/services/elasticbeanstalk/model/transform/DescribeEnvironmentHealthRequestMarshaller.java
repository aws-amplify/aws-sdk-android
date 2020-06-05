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
 * StAX request marshaller for DescribeEnvironmentHealthRequest
 */
public class DescribeEnvironmentHealthRequestMarshaller implements
        Marshaller<Request<DescribeEnvironmentHealthRequest>, DescribeEnvironmentHealthRequest> {

    public Request<DescribeEnvironmentHealthRequest> marshall(
            DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest) {
        if (describeEnvironmentHealthRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeEnvironmentHealthRequest)");
        }

        Request<DescribeEnvironmentHealthRequest> request = new DefaultRequest<DescribeEnvironmentHealthRequest>(
                describeEnvironmentHealthRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEnvironmentHealth");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeEnvironmentHealthRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = describeEnvironmentHealthRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (describeEnvironmentHealthRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = describeEnvironmentHealthRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (describeEnvironmentHealthRequest.getAttributeNames() != null) {
            prefix = "AttributeNames";
            java.util.List<String> attributeNames = describeEnvironmentHealthRequest
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

        return request;
    }
}
