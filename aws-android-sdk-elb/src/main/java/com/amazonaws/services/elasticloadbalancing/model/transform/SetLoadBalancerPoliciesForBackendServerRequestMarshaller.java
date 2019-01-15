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
 * StAX request marshaller for SetLoadBalancerPoliciesForBackendServerRequest
 */
public class SetLoadBalancerPoliciesForBackendServerRequestMarshaller
        implements
        Marshaller<Request<SetLoadBalancerPoliciesForBackendServerRequest>, SetLoadBalancerPoliciesForBackendServerRequest> {

    public Request<SetLoadBalancerPoliciesForBackendServerRequest> marshall(
            SetLoadBalancerPoliciesForBackendServerRequest setLoadBalancerPoliciesForBackendServerRequest) {
        if (setLoadBalancerPoliciesForBackendServerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetLoadBalancerPoliciesForBackendServerRequest)");
        }

        Request<SetLoadBalancerPoliciesForBackendServerRequest> request = new DefaultRequest<SetLoadBalancerPoliciesForBackendServerRequest>(
                setLoadBalancerPoliciesForBackendServerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetLoadBalancerPoliciesForBackendServer");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (setLoadBalancerPoliciesForBackendServerRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = setLoadBalancerPoliciesForBackendServerRequest
                    .getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (setLoadBalancerPoliciesForBackendServerRequest.getInstancePort() != null) {
            prefix = "InstancePort";
            Integer instancePort = setLoadBalancerPoliciesForBackendServerRequest.getInstancePort();
            request.addParameter(prefix, StringUtils.fromInteger(instancePort));
        }
        if (setLoadBalancerPoliciesForBackendServerRequest.getPolicyNames() != null) {
            prefix = "PolicyNames";
            java.util.List<String> policyNames = setLoadBalancerPoliciesForBackendServerRequest
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
