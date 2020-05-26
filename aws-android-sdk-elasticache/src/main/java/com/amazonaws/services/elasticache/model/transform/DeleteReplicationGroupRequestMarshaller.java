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
 * StAX request marshaller for DeleteReplicationGroupRequest
 */
public class DeleteReplicationGroupRequestMarshaller implements
        Marshaller<Request<DeleteReplicationGroupRequest>, DeleteReplicationGroupRequest> {

    public Request<DeleteReplicationGroupRequest> marshall(
            DeleteReplicationGroupRequest deleteReplicationGroupRequest) {
        if (deleteReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteReplicationGroupRequest)");
        }

        Request<DeleteReplicationGroupRequest> request = new DefaultRequest<DeleteReplicationGroupRequest>(
                deleteReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "DeleteReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (deleteReplicationGroupRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = deleteReplicationGroupRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (deleteReplicationGroupRequest.getRetainPrimaryCluster() != null) {
            prefix = "RetainPrimaryCluster";
            Boolean retainPrimaryCluster = deleteReplicationGroupRequest.getRetainPrimaryCluster();
            request.addParameter(prefix, StringUtils.fromBoolean(retainPrimaryCluster));
        }
        if (deleteReplicationGroupRequest.getFinalSnapshotIdentifier() != null) {
            prefix = "FinalSnapshotIdentifier";
            String finalSnapshotIdentifier = deleteReplicationGroupRequest
                    .getFinalSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(finalSnapshotIdentifier));
        }

        return request;
    }
}
