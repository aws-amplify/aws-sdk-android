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
 * StAX request marshaller for DescribeLoggingStatusRequest
 */
public class DescribeLoggingStatusRequestMarshaller implements
        Marshaller<Request<DescribeLoggingStatusRequest>, DescribeLoggingStatusRequest> {

    public Request<DescribeLoggingStatusRequest> marshall(
            DescribeLoggingStatusRequest describeLoggingStatusRequest) {
        if (describeLoggingStatusRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeLoggingStatusRequest)");
        }

        Request<DescribeLoggingStatusRequest> request = new DefaultRequest<DescribeLoggingStatusRequest>(
                describeLoggingStatusRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeLoggingStatus");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeLoggingStatusRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = describeLoggingStatusRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }

        return request;
    }
}
