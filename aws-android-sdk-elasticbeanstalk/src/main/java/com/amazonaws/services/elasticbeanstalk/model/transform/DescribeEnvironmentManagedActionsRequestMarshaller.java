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
 * StAX request marshaller for DescribeEnvironmentManagedActionsRequest
 */
public class DescribeEnvironmentManagedActionsRequestMarshaller
        implements
        Marshaller<Request<DescribeEnvironmentManagedActionsRequest>, DescribeEnvironmentManagedActionsRequest> {

    public Request<DescribeEnvironmentManagedActionsRequest> marshall(
            DescribeEnvironmentManagedActionsRequest describeEnvironmentManagedActionsRequest) {
        if (describeEnvironmentManagedActionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeEnvironmentManagedActionsRequest)");
        }

        Request<DescribeEnvironmentManagedActionsRequest> request = new DefaultRequest<DescribeEnvironmentManagedActionsRequest>(
                describeEnvironmentManagedActionsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEnvironmentManagedActions");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (describeEnvironmentManagedActionsRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = describeEnvironmentManagedActionsRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (describeEnvironmentManagedActionsRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = describeEnvironmentManagedActionsRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (describeEnvironmentManagedActionsRequest.getStatus() != null) {
            prefix = "Status";
            String status = describeEnvironmentManagedActionsRequest.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }

        return request;
    }
}
