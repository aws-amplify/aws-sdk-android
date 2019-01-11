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
 * StAX request marshaller for DescribeLoadBalancerPoliciesRequest
 */
public class DescribeLoadBalancerPoliciesRequestMarshaller
        implements
        Marshaller<Request<DescribeLoadBalancerPoliciesRequest>, DescribeLoadBalancerPoliciesRequest> {

    public Request<DescribeLoadBalancerPoliciesRequest> marshall(
            DescribeLoadBalancerPoliciesRequest describeLoadBalancerPoliciesRequest) {
        if (describeLoadBalancerPoliciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeLoadBalancerPoliciesRequest)");
        }

        Request<DescribeLoadBalancerPoliciesRequest> request = new DefaultRequest<DescribeLoadBalancerPoliciesRequest>(
                describeLoadBalancerPoliciesRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeLoadBalancerPolicies");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (describeLoadBalancerPoliciesRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = describeLoadBalancerPoliciesRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (describeLoadBalancerPoliciesRequest.getPolicyNames() != null) {
            prefix = "PolicyNames";
            java.util.List<String> policyNames = describeLoadBalancerPoliciesRequest
                    .getPolicyNames();
            int policyNamesIndex = 1;
            String policyNamesPrefix = prefix;
            for (String policyNamesItem : policyNames) {
                prefix = policyNamesPrefix + ".member." + policyNamesIndex;
                if (policyNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(policyNamesItem));
                }
                policyNamesIndex++;
            }
            prefix = policyNamesPrefix;
        }

        return request;
    }
}
