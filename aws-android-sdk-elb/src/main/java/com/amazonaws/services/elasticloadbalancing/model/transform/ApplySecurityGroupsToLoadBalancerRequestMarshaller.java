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
 * StAX request marshaller for ApplySecurityGroupsToLoadBalancerRequest
 */
public class ApplySecurityGroupsToLoadBalancerRequestMarshaller
        implements
        Marshaller<Request<ApplySecurityGroupsToLoadBalancerRequest>, ApplySecurityGroupsToLoadBalancerRequest> {

    public Request<ApplySecurityGroupsToLoadBalancerRequest> marshall(
            ApplySecurityGroupsToLoadBalancerRequest applySecurityGroupsToLoadBalancerRequest) {
        if (applySecurityGroupsToLoadBalancerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ApplySecurityGroupsToLoadBalancerRequest)");
        }

        Request<ApplySecurityGroupsToLoadBalancerRequest> request = new DefaultRequest<ApplySecurityGroupsToLoadBalancerRequest>(
                applySecurityGroupsToLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ApplySecurityGroupsToLoadBalancer");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (applySecurityGroupsToLoadBalancerRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = applySecurityGroupsToLoadBalancerRequest
                    .getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (applySecurityGroupsToLoadBalancerRequest.getSecurityGroups() != null) {
            prefix = "SecurityGroups";
            java.util.List<String> securityGroups = applySecurityGroupsToLoadBalancerRequest
                    .getSecurityGroups();
            int securityGroupsIndex = 1;
            String securityGroupsPrefix = prefix;
            for (String securityGroupsItem : securityGroups) {
                prefix = securityGroupsPrefix + ".member." + securityGroupsIndex;
                if (securityGroupsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(securityGroupsItem));
                }
                securityGroupsIndex++;
            }
            prefix = securityGroupsPrefix;
        }

        return request;
    }
}
