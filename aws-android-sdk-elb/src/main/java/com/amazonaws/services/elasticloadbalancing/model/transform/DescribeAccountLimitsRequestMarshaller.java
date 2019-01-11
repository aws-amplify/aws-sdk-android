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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeAccountLimitsRequest
 */
public class DescribeAccountLimitsRequestMarshaller implements
        Marshaller<Request<DescribeAccountLimitsRequest>, DescribeAccountLimitsRequest> {

    public Request<DescribeAccountLimitsRequest> marshall(
            DescribeAccountLimitsRequest describeAccountLimitsRequest) {
        if (describeAccountLimitsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeAccountLimitsRequest)");
        }

        Request<DescribeAccountLimitsRequest> request = new DefaultRequest<DescribeAccountLimitsRequest>(
                describeAccountLimitsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeAccountLimits");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (describeAccountLimitsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeAccountLimitsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeAccountLimitsRequest.getPageSize() != null) {
            prefix = "PageSize";
            Integer pageSize = describeAccountLimitsRequest.getPageSize();
            request.addParameter(prefix, StringUtils.fromInteger(pageSize));
        }

        return request;
    }
}
