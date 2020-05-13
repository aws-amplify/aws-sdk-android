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
 * StAX request marshaller for CreateCacheSecurityGroupRequest
 */
public class CreateCacheSecurityGroupRequestMarshaller implements
        Marshaller<Request<CreateCacheSecurityGroupRequest>, CreateCacheSecurityGroupRequest> {

    public Request<CreateCacheSecurityGroupRequest> marshall(
            CreateCacheSecurityGroupRequest createCacheSecurityGroupRequest) {
        if (createCacheSecurityGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCacheSecurityGroupRequest)");
        }

        Request<CreateCacheSecurityGroupRequest> request = new DefaultRequest<CreateCacheSecurityGroupRequest>(
                createCacheSecurityGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateCacheSecurityGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (createCacheSecurityGroupRequest.getCacheSecurityGroupName() != null) {
            prefix = "CacheSecurityGroupName";
            String cacheSecurityGroupName = createCacheSecurityGroupRequest
                    .getCacheSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSecurityGroupName));
        }
        if (createCacheSecurityGroupRequest.getDescription() != null) {
            prefix = "Description";
            String description = createCacheSecurityGroupRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }

        return request;
    }
}
