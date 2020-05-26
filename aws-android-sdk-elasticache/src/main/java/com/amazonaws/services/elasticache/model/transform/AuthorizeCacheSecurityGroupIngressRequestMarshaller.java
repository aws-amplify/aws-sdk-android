/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for AuthorizeCacheSecurityGroupIngressRequest
 */
public class AuthorizeCacheSecurityGroupIngressRequestMarshaller
        implements
        Marshaller<Request<AuthorizeCacheSecurityGroupIngressRequest>, AuthorizeCacheSecurityGroupIngressRequest> {

    public Request<AuthorizeCacheSecurityGroupIngressRequest> marshall(
            AuthorizeCacheSecurityGroupIngressRequest authorizeCacheSecurityGroupIngressRequest) {
        if (authorizeCacheSecurityGroupIngressRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AuthorizeCacheSecurityGroupIngressRequest)");
        }

        Request<AuthorizeCacheSecurityGroupIngressRequest> request = new DefaultRequest<AuthorizeCacheSecurityGroupIngressRequest>(
                authorizeCacheSecurityGroupIngressRequest, "AmazonElastiCache");
        request.addParameter("Action", "AuthorizeCacheSecurityGroupIngress");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (authorizeCacheSecurityGroupIngressRequest.getCacheSecurityGroupName() != null) {
            prefix = "CacheSecurityGroupName";
            String cacheSecurityGroupName = authorizeCacheSecurityGroupIngressRequest
                    .getCacheSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSecurityGroupName));
        }
        if (authorizeCacheSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            prefix = "EC2SecurityGroupName";
            String eC2SecurityGroupName = authorizeCacheSecurityGroupIngressRequest
                    .getEC2SecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupName));
        }
        if (authorizeCacheSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            prefix = "EC2SecurityGroupOwnerId";
            String eC2SecurityGroupOwnerId = authorizeCacheSecurityGroupIngressRequest
                    .getEC2SecurityGroupOwnerId();
            request.addParameter(prefix, StringUtils.fromString(eC2SecurityGroupOwnerId));
        }

        return request;
    }
}
