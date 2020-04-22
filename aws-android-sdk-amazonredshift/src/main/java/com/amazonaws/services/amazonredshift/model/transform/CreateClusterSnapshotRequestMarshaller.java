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
 * StAX request marshaller for CreateClusterSnapshotRequest
 */
public class CreateClusterSnapshotRequestMarshaller implements
        Marshaller<Request<CreateClusterSnapshotRequest>, CreateClusterSnapshotRequest> {

    public Request<CreateClusterSnapshotRequest> marshall(
            CreateClusterSnapshotRequest createClusterSnapshotRequest) {
        if (createClusterSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateClusterSnapshotRequest)");
        }

        Request<CreateClusterSnapshotRequest> request = new DefaultRequest<CreateClusterSnapshotRequest>(
                createClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateClusterSnapshot");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createClusterSnapshotRequest.getSnapshotIdentifier() != null) {
            prefix = "SnapshotIdentifier";
            String snapshotIdentifier = createClusterSnapshotRequest.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (createClusterSnapshotRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = createClusterSnapshotRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (createClusterSnapshotRequest.getManualSnapshotRetentionPeriod() != null) {
            prefix = "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = createClusterSnapshotRequest
                    .getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }
        if (createClusterSnapshotRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createClusterSnapshotRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
