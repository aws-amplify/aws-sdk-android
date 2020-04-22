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
 * StAX request marshaller for BatchModifyClusterSnapshotsRequest
 */
public class BatchModifyClusterSnapshotsRequestMarshaller implements
        Marshaller<Request<BatchModifyClusterSnapshotsRequest>, BatchModifyClusterSnapshotsRequest> {

    public Request<BatchModifyClusterSnapshotsRequest> marshall(
            BatchModifyClusterSnapshotsRequest batchModifyClusterSnapshotsRequest) {
        if (batchModifyClusterSnapshotsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(BatchModifyClusterSnapshotsRequest)");
        }

        Request<BatchModifyClusterSnapshotsRequest> request = new DefaultRequest<BatchModifyClusterSnapshotsRequest>(
                batchModifyClusterSnapshotsRequest, "AmazonRedshift");
        request.addParameter("Action", "BatchModifyClusterSnapshots");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (batchModifyClusterSnapshotsRequest.getSnapshotIdentifierList() != null) {
            prefix = "SnapshotIdentifierList";
            java.util.List<String> snapshotIdentifierList = batchModifyClusterSnapshotsRequest
                    .getSnapshotIdentifierList();
            int snapshotIdentifierListIndex = 1;
            String snapshotIdentifierListPrefix = prefix;
            for (String snapshotIdentifierListItem : snapshotIdentifierList) {
                prefix = snapshotIdentifierListPrefix + "." + snapshotIdentifierListIndex;
                if (snapshotIdentifierListItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(snapshotIdentifierListItem));
                }
                snapshotIdentifierListIndex++;
            }
            prefix = snapshotIdentifierListPrefix;
        }
        if (batchModifyClusterSnapshotsRequest.getManualSnapshotRetentionPeriod() != null) {
            prefix = "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = batchModifyClusterSnapshotsRequest
                    .getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }
        if (batchModifyClusterSnapshotsRequest.getForce() != null) {
            prefix = "Force";
            Boolean force = batchModifyClusterSnapshotsRequest.getForce();
            request.addParameter(prefix, StringUtils.fromBoolean(force));
        }

        return request;
    }
}
