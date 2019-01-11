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
 * StAX request marshaller for SetLoadBalancerPoliciesOfListenerRequest
 */
public class SetLoadBalancerPoliciesOfListenerRequestMarshaller
        implements
        Marshaller<Request<SetLoadBalancerPoliciesOfListenerRequest>, SetLoadBalancerPoliciesOfListenerRequest> {

    public Request<SetLoadBalancerPoliciesOfListenerRequest> marshall(
            SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest) {
        if (setLoadBalancerPoliciesOfListenerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetLoadBalancerPoliciesOfListenerRequest)");
        }

        Request<SetLoadBalancerPoliciesOfListenerRequest> request = new DefaultRequest<SetLoadBalancerPoliciesOfListenerRequest>(
                setLoadBalancerPoliciesOfListenerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetLoadBalancerPoliciesOfListener");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (setLoadBalancerPoliciesOfListenerRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = setLoadBalancerPoliciesOfListenerRequest
                    .getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (setLoadBalancerPoliciesOfListenerRequest.getLoadBalancerPort() != null) {
            prefix = "LoadBalancerPort";
            Integer loadBalancerPort = setLoadBalancerPoliciesOfListenerRequest
                    .getLoadBalancerPort();
            request.addParameter(prefix, StringUtils.fromInteger(loadBalancerPort));
        }
        if (setLoadBalancerPoliciesOfListenerRequest.getPolicyNames() != null) {
            prefix = "PolicyNames";
            java.util.List<String> policyNames = setLoadBalancerPoliciesOfListenerRequest
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
