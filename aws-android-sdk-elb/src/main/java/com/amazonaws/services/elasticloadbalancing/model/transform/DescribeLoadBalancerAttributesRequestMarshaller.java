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
 * StAX request marshaller for DescribeLoadBalancerAttributesRequest
 */
public class DescribeLoadBalancerAttributesRequestMarshaller
        implements
        Marshaller<Request<DescribeLoadBalancerAttributesRequest>, DescribeLoadBalancerAttributesRequest> {

    public Request<DescribeLoadBalancerAttributesRequest> marshall(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest) {
        if (describeLoadBalancerAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeLoadBalancerAttributesRequest)");
        }

        Request<DescribeLoadBalancerAttributesRequest> request = new DefaultRequest<DescribeLoadBalancerAttributesRequest>(
                describeLoadBalancerAttributesRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeLoadBalancerAttributes");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (describeLoadBalancerAttributesRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = describeLoadBalancerAttributesRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }

        return request;
    }
}
