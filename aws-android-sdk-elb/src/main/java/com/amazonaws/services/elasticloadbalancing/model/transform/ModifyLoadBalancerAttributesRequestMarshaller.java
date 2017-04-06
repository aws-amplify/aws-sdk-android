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
 * StAX request marshaller for ModifyLoadBalancerAttributesRequest
 */
public class ModifyLoadBalancerAttributesRequestMarshaller
        implements
        Marshaller<Request<ModifyLoadBalancerAttributesRequest>, ModifyLoadBalancerAttributesRequest> {

    public Request<ModifyLoadBalancerAttributesRequest> marshall(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest) {
        if (modifyLoadBalancerAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyLoadBalancerAttributesRequest)");
        }

        Request<ModifyLoadBalancerAttributesRequest> request = new DefaultRequest<ModifyLoadBalancerAttributesRequest>(
                modifyLoadBalancerAttributesRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ModifyLoadBalancerAttributes");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (modifyLoadBalancerAttributesRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = modifyLoadBalancerAttributesRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (modifyLoadBalancerAttributesRequest.getLoadBalancerAttributes() != null) {
            prefix = "LoadBalancerAttributes";
            LoadBalancerAttributes loadBalancerAttributes = modifyLoadBalancerAttributesRequest
                    .getLoadBalancerAttributes();
            LoadBalancerAttributesStaxMarshaller.getInstance().marshall(loadBalancerAttributes,
                    request, prefix + ".");
        }

        return request;
    }
}
