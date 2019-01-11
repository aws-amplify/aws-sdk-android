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
 * StAX request marshaller for DisableAvailabilityZonesForLoadBalancerRequest
 */
public class DisableAvailabilityZonesForLoadBalancerRequestMarshaller
        implements
        Marshaller<Request<DisableAvailabilityZonesForLoadBalancerRequest>, DisableAvailabilityZonesForLoadBalancerRequest> {

    public Request<DisableAvailabilityZonesForLoadBalancerRequest> marshall(
            DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest) {
        if (disableAvailabilityZonesForLoadBalancerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DisableAvailabilityZonesForLoadBalancerRequest)");
        }

        Request<DisableAvailabilityZonesForLoadBalancerRequest> request = new DefaultRequest<DisableAvailabilityZonesForLoadBalancerRequest>(
                disableAvailabilityZonesForLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DisableAvailabilityZonesForLoadBalancer");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (disableAvailabilityZonesForLoadBalancerRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = disableAvailabilityZonesForLoadBalancerRequest
                    .getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (disableAvailabilityZonesForLoadBalancerRequest.getAvailabilityZones() != null) {
            prefix = "AvailabilityZones";
            java.util.List<String> availabilityZones = disableAvailabilityZonesForLoadBalancerRequest
                    .getAvailabilityZones();
            int availabilityZonesIndex = 1;
            String availabilityZonesPrefix = prefix;
            for (String availabilityZonesItem : availabilityZones) {
                prefix = availabilityZonesPrefix + ".member." + availabilityZonesIndex;
                if (availabilityZonesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(availabilityZonesItem));
                }
                availabilityZonesIndex++;
            }
            prefix = availabilityZonesPrefix;
        }

        return request;
    }
}
