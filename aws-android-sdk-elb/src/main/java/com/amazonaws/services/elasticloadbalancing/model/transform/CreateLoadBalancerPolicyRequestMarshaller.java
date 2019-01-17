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
 * StAX request marshaller for CreateLoadBalancerPolicyRequest
 */
public class CreateLoadBalancerPolicyRequestMarshaller implements
        Marshaller<Request<CreateLoadBalancerPolicyRequest>, CreateLoadBalancerPolicyRequest> {

    public Request<CreateLoadBalancerPolicyRequest> marshall(
            CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest) {
        if (createLoadBalancerPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateLoadBalancerPolicyRequest)");
        }

        Request<CreateLoadBalancerPolicyRequest> request = new DefaultRequest<CreateLoadBalancerPolicyRequest>(
                createLoadBalancerPolicyRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancerPolicy");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (createLoadBalancerPolicyRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = createLoadBalancerPolicyRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (createLoadBalancerPolicyRequest.getPolicyName() != null) {
            prefix = "PolicyName";
            String policyName = createLoadBalancerPolicyRequest.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (createLoadBalancerPolicyRequest.getPolicyTypeName() != null) {
            prefix = "PolicyTypeName";
            String policyTypeName = createLoadBalancerPolicyRequest.getPolicyTypeName();
            request.addParameter(prefix, StringUtils.fromString(policyTypeName));
        }
        if (createLoadBalancerPolicyRequest.getPolicyAttributes() != null) {
            prefix = "PolicyAttributes";
            java.util.List<PolicyAttribute> policyAttributes = createLoadBalancerPolicyRequest
                    .getPolicyAttributes();
            int policyAttributesIndex = 1;
            String policyAttributesPrefix = prefix;
            for (PolicyAttribute policyAttributesItem : policyAttributes) {
                prefix = policyAttributesPrefix + ".member." + policyAttributesIndex;
                if (policyAttributesItem != null) {
                    PolicyAttributeStaxMarshaller.getInstance().marshall(policyAttributesItem,
                            request, prefix + ".");
                }
                policyAttributesIndex++;
            }
            prefix = policyAttributesPrefix;
        }

        return request;
    }
}
