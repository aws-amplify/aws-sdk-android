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
 * StAX request marshaller for RegisterInstancesWithLoadBalancerRequest
 */
public class RegisterInstancesWithLoadBalancerRequestMarshaller
        implements
        Marshaller<Request<RegisterInstancesWithLoadBalancerRequest>, RegisterInstancesWithLoadBalancerRequest> {

    public Request<RegisterInstancesWithLoadBalancerRequest> marshall(
            RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest) {
        if (registerInstancesWithLoadBalancerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterInstancesWithLoadBalancerRequest)");
        }

        Request<RegisterInstancesWithLoadBalancerRequest> request = new DefaultRequest<RegisterInstancesWithLoadBalancerRequest>(
                registerInstancesWithLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "RegisterInstancesWithLoadBalancer");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (registerInstancesWithLoadBalancerRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = registerInstancesWithLoadBalancerRequest
                    .getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (registerInstancesWithLoadBalancerRequest.getInstances() != null) {
            prefix = "Instances";
            java.util.List<Instance> instances = registerInstancesWithLoadBalancerRequest
                    .getInstances();
            int instancesIndex = 1;
            String instancesPrefix = prefix;
            for (Instance instancesItem : instances) {
                prefix = instancesPrefix + ".member." + instancesIndex;
                if (instancesItem != null) {
                    InstanceStaxMarshaller.getInstance().marshall(instancesItem, request,
                            prefix + ".");
                }
                instancesIndex++;
            }
            prefix = instancesPrefix;
        }

        return request;
    }
}
