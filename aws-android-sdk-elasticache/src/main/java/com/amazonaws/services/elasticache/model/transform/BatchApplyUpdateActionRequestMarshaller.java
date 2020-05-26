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
 * StAX request marshaller for BatchApplyUpdateActionRequest
 */
public class BatchApplyUpdateActionRequestMarshaller implements
        Marshaller<Request<BatchApplyUpdateActionRequest>, BatchApplyUpdateActionRequest> {

    public Request<BatchApplyUpdateActionRequest> marshall(
            BatchApplyUpdateActionRequest batchApplyUpdateActionRequest) {
        if (batchApplyUpdateActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(BatchApplyUpdateActionRequest)");
        }

        Request<BatchApplyUpdateActionRequest> request = new DefaultRequest<BatchApplyUpdateActionRequest>(
                batchApplyUpdateActionRequest, "AmazonElastiCache");
        request.addParameter("Action", "BatchApplyUpdateAction");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (batchApplyUpdateActionRequest.getReplicationGroupIds() != null) {
            prefix = "ReplicationGroupIds";
            java.util.List<String> replicationGroupIds = batchApplyUpdateActionRequest
                    .getReplicationGroupIds();
            int replicationGroupIdsIndex = 1;
            String replicationGroupIdsPrefix = prefix;
            for (String replicationGroupIdsItem : replicationGroupIds) {
                prefix = replicationGroupIdsPrefix + ".member." + replicationGroupIdsIndex;
                if (replicationGroupIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(replicationGroupIdsItem));
                }
                replicationGroupIdsIndex++;
            }
            prefix = replicationGroupIdsPrefix;
        }
        if (batchApplyUpdateActionRequest.getCacheClusterIds() != null) {
            prefix = "CacheClusterIds";
            java.util.List<String> cacheClusterIds = batchApplyUpdateActionRequest
                    .getCacheClusterIds();
            int cacheClusterIdsIndex = 1;
            String cacheClusterIdsPrefix = prefix;
            for (String cacheClusterIdsItem : cacheClusterIds) {
                prefix = cacheClusterIdsPrefix + ".member." + cacheClusterIdsIndex;
                if (cacheClusterIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(cacheClusterIdsItem));
                }
                cacheClusterIdsIndex++;
            }
            prefix = cacheClusterIdsPrefix;
        }
        if (batchApplyUpdateActionRequest.getServiceUpdateName() != null) {
            prefix = "ServiceUpdateName";
            String serviceUpdateName = batchApplyUpdateActionRequest.getServiceUpdateName();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateName));
        }

        return request;
    }
}
