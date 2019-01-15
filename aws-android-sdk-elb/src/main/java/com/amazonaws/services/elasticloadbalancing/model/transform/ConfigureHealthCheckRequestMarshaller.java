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
 * StAX request marshaller for ConfigureHealthCheckRequest
 */
public class ConfigureHealthCheckRequestMarshaller implements
        Marshaller<Request<ConfigureHealthCheckRequest>, ConfigureHealthCheckRequest> {

    public Request<ConfigureHealthCheckRequest> marshall(
            ConfigureHealthCheckRequest configureHealthCheckRequest) {
        if (configureHealthCheckRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ConfigureHealthCheckRequest)");
        }

        Request<ConfigureHealthCheckRequest> request = new DefaultRequest<ConfigureHealthCheckRequest>(
                configureHealthCheckRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ConfigureHealthCheck");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (configureHealthCheckRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = configureHealthCheckRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (configureHealthCheckRequest.getHealthCheck() != null) {
            prefix = "HealthCheck";
            HealthCheck healthCheck = configureHealthCheckRequest.getHealthCheck();
            HealthCheckStaxMarshaller.getInstance().marshall(healthCheck, request, prefix + ".");
        }

        return request;
    }
}
