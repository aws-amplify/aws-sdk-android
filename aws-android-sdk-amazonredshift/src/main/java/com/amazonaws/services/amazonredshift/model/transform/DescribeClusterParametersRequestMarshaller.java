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
 * StAX request marshaller for DescribeClusterParametersRequest
 */
public class DescribeClusterParametersRequestMarshaller implements
        Marshaller<Request<DescribeClusterParametersRequest>, DescribeClusterParametersRequest> {

    public Request<DescribeClusterParametersRequest> marshall(
            DescribeClusterParametersRequest describeClusterParametersRequest) {
        if (describeClusterParametersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeClusterParametersRequest)");
        }

        Request<DescribeClusterParametersRequest> request = new DefaultRequest<DescribeClusterParametersRequest>(
                describeClusterParametersRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterParameters");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (describeClusterParametersRequest.getParameterGroupName() != null) {
            prefix = "ParameterGroupName";
            String parameterGroupName = describeClusterParametersRequest.getParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(parameterGroupName));
        }
        if (describeClusterParametersRequest.getSource() != null) {
            prefix = "Source";
            String source = describeClusterParametersRequest.getSource();
            request.addParameter(prefix, StringUtils.fromString(source));
        }
        if (describeClusterParametersRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeClusterParametersRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeClusterParametersRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeClusterParametersRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
