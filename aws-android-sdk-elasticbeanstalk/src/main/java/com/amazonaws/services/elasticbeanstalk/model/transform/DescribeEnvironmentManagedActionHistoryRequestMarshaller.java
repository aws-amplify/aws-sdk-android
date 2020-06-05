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
 * StAX request marshaller for DescribeEnvironmentManagedActionHistoryRequest
 */
public class DescribeEnvironmentManagedActionHistoryRequestMarshaller
        implements
        Marshaller<Request<DescribeEnvironmentManagedActionHistoryRequest>, DescribeEnvironmentManagedActionHistoryRequest> {

    public Request<DescribeEnvironmentManagedActionHistoryRequest> marshall(
            DescribeEnvironmentManagedActionHistoryRequest describeEnvironmentManagedActionHistoryRequest) {
        if (describeEnvironmentManagedActionHistoryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeEnvironmentManagedActionHistoryRequest)");
        }

        Request<DescribeEnvironmentManagedActionHistoryRequest> request = new DefaultRequest<DescribeEnvironmentManagedActionHistoryRequest>(
                describeEnvironmentManagedActionHistoryRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEnvironmentManagedActionHistory");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeEnvironmentManagedActionHistoryRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = describeEnvironmentManagedActionHistoryRequest
                    .getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (describeEnvironmentManagedActionHistoryRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = describeEnvironmentManagedActionHistoryRequest
                    .getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (describeEnvironmentManagedActionHistoryRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeEnvironmentManagedActionHistoryRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeEnvironmentManagedActionHistoryRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = describeEnvironmentManagedActionHistoryRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
