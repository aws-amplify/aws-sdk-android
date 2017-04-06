/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StAX request marshaller for DeleteLoadBalancerPolicyRequest
 */
public class DeleteLoadBalancerPolicyRequestMarshaller implements
        Marshaller<Request<DeleteLoadBalancerPolicyRequest>, DeleteLoadBalancerPolicyRequest> {

    public Request<DeleteLoadBalancerPolicyRequest> marshall(
            DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest) {
        if (deleteLoadBalancerPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteLoadBalancerPolicyRequest)");
        }

        Request<DeleteLoadBalancerPolicyRequest> request = new DefaultRequest<DeleteLoadBalancerPolicyRequest>(
                deleteLoadBalancerPolicyRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DeleteLoadBalancerPolicy");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (deleteLoadBalancerPolicyRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = deleteLoadBalancerPolicyRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (deleteLoadBalancerPolicyRequest.getPolicyName() != null) {
            prefix = "PolicyName";
            String policyName = deleteLoadBalancerPolicyRequest.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }

        return request;
    }
}
