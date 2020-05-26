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
 * StAX request marshaller for DeleteCacheClusterRequest
 */
public class DeleteCacheClusterRequestMarshaller implements
        Marshaller<Request<DeleteCacheClusterRequest>, DeleteCacheClusterRequest> {

    public Request<DeleteCacheClusterRequest> marshall(
            DeleteCacheClusterRequest deleteCacheClusterRequest) {
        if (deleteCacheClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteCacheClusterRequest)");
        }

        Request<DeleteCacheClusterRequest> request = new DefaultRequest<DeleteCacheClusterRequest>(
                deleteCacheClusterRequest, "AmazonElastiCache");
        request.addParameter("Action", "DeleteCacheCluster");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (deleteCacheClusterRequest.getCacheClusterId() != null) {
            prefix = "CacheClusterId";
            String cacheClusterId = deleteCacheClusterRequest.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (deleteCacheClusterRequest.getFinalSnapshotIdentifier() != null) {
            prefix = "FinalSnapshotIdentifier";
            String finalSnapshotIdentifier = deleteCacheClusterRequest.getFinalSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(finalSnapshotIdentifier));
        }

        return request;
    }
}
