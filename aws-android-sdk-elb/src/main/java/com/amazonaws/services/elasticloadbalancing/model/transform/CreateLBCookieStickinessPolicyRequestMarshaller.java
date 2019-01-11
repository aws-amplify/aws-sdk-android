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
 * StAX request marshaller for CreateLBCookieStickinessPolicyRequest
 */
public class CreateLBCookieStickinessPolicyRequestMarshaller
        implements
        Marshaller<Request<CreateLBCookieStickinessPolicyRequest>, CreateLBCookieStickinessPolicyRequest> {

    public Request<CreateLBCookieStickinessPolicyRequest> marshall(
            CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) {
        if (createLBCookieStickinessPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateLBCookieStickinessPolicyRequest)");
        }

        Request<CreateLBCookieStickinessPolicyRequest> request = new DefaultRequest<CreateLBCookieStickinessPolicyRequest>(
                createLBCookieStickinessPolicyRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLBCookieStickinessPolicy");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (createLBCookieStickinessPolicyRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = createLBCookieStickinessPolicyRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (createLBCookieStickinessPolicyRequest.getPolicyName() != null) {
            prefix = "PolicyName";
            String policyName = createLBCookieStickinessPolicyRequest.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (createLBCookieStickinessPolicyRequest.getCookieExpirationPeriod() != null) {
            prefix = "CookieExpirationPeriod";
            Long cookieExpirationPeriod = createLBCookieStickinessPolicyRequest
                    .getCookieExpirationPeriod();
            request.addParameter(prefix, StringUtils.fromLong(cookieExpirationPeriod));
        }

        return request;
    }
}
