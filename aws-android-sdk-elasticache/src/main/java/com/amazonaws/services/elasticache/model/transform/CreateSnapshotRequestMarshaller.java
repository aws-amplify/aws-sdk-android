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
 * StAX request marshaller for CreateSnapshotRequest
 */
public class CreateSnapshotRequestMarshaller implements
        Marshaller<Request<CreateSnapshotRequest>, CreateSnapshotRequest> {

    public Request<CreateSnapshotRequest> marshall(CreateSnapshotRequest createSnapshotRequest) {
        if (createSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateSnapshotRequest)");
        }

        Request<CreateSnapshotRequest> request = new DefaultRequest<CreateSnapshotRequest>(
                createSnapshotRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateSnapshot");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (createSnapshotRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = createSnapshotRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (createSnapshotRequest.getCacheClusterId() != null) {
            prefix = "CacheClusterId";
            String cacheClusterId = createSnapshotRequest.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (createSnapshotRequest.getSnapshotName() != null) {
            prefix = "SnapshotName";
            String snapshotName = createSnapshotRequest.getSnapshotName();
            request.addParameter(prefix, StringUtils.fromString(snapshotName));
        }
        if (createSnapshotRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = createSnapshotRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }

        return request;
    }
}
