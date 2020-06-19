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
 * StAX request marshaller for CreateCacheParameterGroupRequest
 */
public class CreateCacheParameterGroupRequestMarshaller implements
        Marshaller<Request<CreateCacheParameterGroupRequest>, CreateCacheParameterGroupRequest> {

    public Request<CreateCacheParameterGroupRequest> marshall(
            CreateCacheParameterGroupRequest createCacheParameterGroupRequest) {
        if (createCacheParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCacheParameterGroupRequest)");
        }

        Request<CreateCacheParameterGroupRequest> request = new DefaultRequest<CreateCacheParameterGroupRequest>(
                createCacheParameterGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateCacheParameterGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (createCacheParameterGroupRequest.getCacheParameterGroupName() != null) {
            prefix = "CacheParameterGroupName";
            String cacheParameterGroupName = createCacheParameterGroupRequest
                    .getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (createCacheParameterGroupRequest.getCacheParameterGroupFamily() != null) {
            prefix = "CacheParameterGroupFamily";
            String cacheParameterGroupFamily = createCacheParameterGroupRequest
                    .getCacheParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupFamily));
        }
        if (createCacheParameterGroupRequest.getDescription() != null) {
            prefix = "Description";
            String description = createCacheParameterGroupRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }

        return request;
    }
}
