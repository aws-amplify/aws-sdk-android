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
 * StAX request marshaller for CreateCacheSubnetGroupRequest
 */
public class CreateCacheSubnetGroupRequestMarshaller implements
        Marshaller<Request<CreateCacheSubnetGroupRequest>, CreateCacheSubnetGroupRequest> {

    public Request<CreateCacheSubnetGroupRequest> marshall(
            CreateCacheSubnetGroupRequest createCacheSubnetGroupRequest) {
        if (createCacheSubnetGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCacheSubnetGroupRequest)");
        }

        Request<CreateCacheSubnetGroupRequest> request = new DefaultRequest<CreateCacheSubnetGroupRequest>(
                createCacheSubnetGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateCacheSubnetGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (createCacheSubnetGroupRequest.getCacheSubnetGroupName() != null) {
            prefix = "CacheSubnetGroupName";
            String cacheSubnetGroupName = createCacheSubnetGroupRequest.getCacheSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupName));
        }
        if (createCacheSubnetGroupRequest.getCacheSubnetGroupDescription() != null) {
            prefix = "CacheSubnetGroupDescription";
            String cacheSubnetGroupDescription = createCacheSubnetGroupRequest
                    .getCacheSubnetGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupDescription));
        }
        if (createCacheSubnetGroupRequest.getSubnetIds() != null) {
            prefix = "SubnetIds";
            java.util.List<String> subnetIds = createCacheSubnetGroupRequest.getSubnetIds();
            int subnetIdsIndex = 1;
            String subnetIdsPrefix = prefix;
            for (String subnetIdsItem : subnetIds) {
                prefix = subnetIdsPrefix + "." + subnetIdsIndex;
                if (subnetIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(subnetIdsItem));
                }
                subnetIdsIndex++;
            }
            prefix = subnetIdsPrefix;
        }

        return request;
    }
}
