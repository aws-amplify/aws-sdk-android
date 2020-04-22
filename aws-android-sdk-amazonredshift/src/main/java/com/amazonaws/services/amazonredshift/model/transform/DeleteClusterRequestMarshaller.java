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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeleteClusterRequest
 */
public class DeleteClusterRequestMarshaller implements
        Marshaller<Request<DeleteClusterRequest>, DeleteClusterRequest> {

    public Request<DeleteClusterRequest> marshall(DeleteClusterRequest deleteClusterRequest) {
        if (deleteClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteClusterRequest)");
        }

        Request<DeleteClusterRequest> request = new DefaultRequest<DeleteClusterRequest>(
                deleteClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "DeleteCluster");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (deleteClusterRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = deleteClusterRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (deleteClusterRequest.getSkipFinalClusterSnapshot() != null) {
            prefix = "SkipFinalClusterSnapshot";
            Boolean skipFinalClusterSnapshot = deleteClusterRequest.getSkipFinalClusterSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(skipFinalClusterSnapshot));
        }
        if (deleteClusterRequest.getFinalClusterSnapshotIdentifier() != null) {
            prefix = "FinalClusterSnapshotIdentifier";
            String finalClusterSnapshotIdentifier = deleteClusterRequest
                    .getFinalClusterSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(finalClusterSnapshotIdentifier));
        }
        if (deleteClusterRequest.getFinalClusterSnapshotRetentionPeriod() != null) {
            prefix = "FinalClusterSnapshotRetentionPeriod";
            Integer finalClusterSnapshotRetentionPeriod = deleteClusterRequest
                    .getFinalClusterSnapshotRetentionPeriod();
            request.addParameter(prefix,
                    StringUtils.fromInteger(finalClusterSnapshotRetentionPeriod));
        }

        return request;
    }
}
