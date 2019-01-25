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
 * StAX request marshaller for DetachLoadBalancerFromSubnetsRequest
 */
public class DetachLoadBalancerFromSubnetsRequestMarshaller
        implements
        Marshaller<Request<DetachLoadBalancerFromSubnetsRequest>, DetachLoadBalancerFromSubnetsRequest> {

    public Request<DetachLoadBalancerFromSubnetsRequest> marshall(
            DetachLoadBalancerFromSubnetsRequest detachLoadBalancerFromSubnetsRequest) {
        if (detachLoadBalancerFromSubnetsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DetachLoadBalancerFromSubnetsRequest)");
        }

        Request<DetachLoadBalancerFromSubnetsRequest> request = new DefaultRequest<DetachLoadBalancerFromSubnetsRequest>(
                detachLoadBalancerFromSubnetsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DetachLoadBalancerFromSubnets");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (detachLoadBalancerFromSubnetsRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = detachLoadBalancerFromSubnetsRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (detachLoadBalancerFromSubnetsRequest.getSubnets() != null) {
            prefix = "Subnets";
            java.util.List<String> subnets = detachLoadBalancerFromSubnetsRequest.getSubnets();
            int subnetsIndex = 1;
            String subnetsPrefix = prefix;
            for (String subnetsItem : subnets) {
                prefix = subnetsPrefix + ".member." + subnetsIndex;
                if (subnetsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(subnetsItem));
                }
                subnetsIndex++;
            }
            prefix = subnetsPrefix;
        }

        return request;
    }
}
