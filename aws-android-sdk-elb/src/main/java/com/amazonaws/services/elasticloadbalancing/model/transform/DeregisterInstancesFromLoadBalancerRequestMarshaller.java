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
 * StAX request marshaller for DeregisterInstancesFromLoadBalancerRequest
 */
public class DeregisterInstancesFromLoadBalancerRequestMarshaller
        implements
        Marshaller<Request<DeregisterInstancesFromLoadBalancerRequest>, DeregisterInstancesFromLoadBalancerRequest> {

    public Request<DeregisterInstancesFromLoadBalancerRequest> marshall(
            DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) {
        if (deregisterInstancesFromLoadBalancerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeregisterInstancesFromLoadBalancerRequest)");
        }

        Request<DeregisterInstancesFromLoadBalancerRequest> request = new DefaultRequest<DeregisterInstancesFromLoadBalancerRequest>(
                deregisterInstancesFromLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DeregisterInstancesFromLoadBalancer");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (deregisterInstancesFromLoadBalancerRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = deregisterInstancesFromLoadBalancerRequest
                    .getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (deregisterInstancesFromLoadBalancerRequest.getInstances() != null) {
            prefix = "Instances";
            java.util.List<Instance> instances = deregisterInstancesFromLoadBalancerRequest
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
