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
 * StAX request marshaller for DeleteLoadBalancerListenersRequest
 */
public class DeleteLoadBalancerListenersRequestMarshaller implements
        Marshaller<Request<DeleteLoadBalancerListenersRequest>, DeleteLoadBalancerListenersRequest> {

    public Request<DeleteLoadBalancerListenersRequest> marshall(
            DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest) {
        if (deleteLoadBalancerListenersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteLoadBalancerListenersRequest)");
        }

        Request<DeleteLoadBalancerListenersRequest> request = new DefaultRequest<DeleteLoadBalancerListenersRequest>(
                deleteLoadBalancerListenersRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DeleteLoadBalancerListeners");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (deleteLoadBalancerListenersRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = deleteLoadBalancerListenersRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (deleteLoadBalancerListenersRequest.getLoadBalancerPorts() != null) {
            prefix = "LoadBalancerPorts";
            java.util.List<Integer> loadBalancerPorts = deleteLoadBalancerListenersRequest
                    .getLoadBalancerPorts();
            int loadBalancerPortsIndex = 1;
            String loadBalancerPortsPrefix = prefix;
            for (Integer loadBalancerPortsItem : loadBalancerPorts) {
                prefix = loadBalancerPortsPrefix + ".member." + loadBalancerPortsIndex;
                if (loadBalancerPortsItem != null) {
                    request.addParameter(prefix, StringUtils.fromInteger(loadBalancerPortsItem));
                }
                loadBalancerPortsIndex++;
            }
            prefix = loadBalancerPortsPrefix;
        }

        return request;
    }
}
