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
 * StAX request marshaller for RebootCacheClusterRequest
 */
public class RebootCacheClusterRequestMarshaller implements
        Marshaller<Request<RebootCacheClusterRequest>, RebootCacheClusterRequest> {

    public Request<RebootCacheClusterRequest> marshall(
            RebootCacheClusterRequest rebootCacheClusterRequest) {
        if (rebootCacheClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RebootCacheClusterRequest)");
        }

        Request<RebootCacheClusterRequest> request = new DefaultRequest<RebootCacheClusterRequest>(
                rebootCacheClusterRequest, "AmazonElastiCache");
        request.addParameter("Action", "RebootCacheCluster");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (rebootCacheClusterRequest.getCacheClusterId() != null) {
            prefix = "CacheClusterId";
            String cacheClusterId = rebootCacheClusterRequest.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (rebootCacheClusterRequest.getCacheNodeIdsToReboot() != null) {
            prefix = "CacheNodeIdsToReboot";
            java.util.List<String> cacheNodeIdsToReboot = rebootCacheClusterRequest
                    .getCacheNodeIdsToReboot();
            int cacheNodeIdsToRebootIndex = 1;
            String cacheNodeIdsToRebootPrefix = prefix;
            for (String cacheNodeIdsToRebootItem : cacheNodeIdsToReboot) {
                prefix = cacheNodeIdsToRebootPrefix + "." + cacheNodeIdsToRebootIndex;
                if (cacheNodeIdsToRebootItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(cacheNodeIdsToRebootItem));
                }
                cacheNodeIdsToRebootIndex++;
            }
            prefix = cacheNodeIdsToRebootPrefix;
        }

        return request;
    }
}
