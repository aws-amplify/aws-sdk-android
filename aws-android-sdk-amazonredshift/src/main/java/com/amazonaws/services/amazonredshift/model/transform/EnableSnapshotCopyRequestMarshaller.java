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
 * StAX request marshaller for EnableSnapshotCopyRequest
 */
public class EnableSnapshotCopyRequestMarshaller implements
        Marshaller<Request<EnableSnapshotCopyRequest>, EnableSnapshotCopyRequest> {

    public Request<EnableSnapshotCopyRequest> marshall(
            EnableSnapshotCopyRequest enableSnapshotCopyRequest) {
        if (enableSnapshotCopyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(EnableSnapshotCopyRequest)");
        }

        Request<EnableSnapshotCopyRequest> request = new DefaultRequest<EnableSnapshotCopyRequest>(
                enableSnapshotCopyRequest, "AmazonRedshift");
        request.addParameter("Action", "EnableSnapshotCopy");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (enableSnapshotCopyRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = enableSnapshotCopyRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (enableSnapshotCopyRequest.getDestinationRegion() != null) {
            prefix = "DestinationRegion";
            String destinationRegion = enableSnapshotCopyRequest.getDestinationRegion();
            request.addParameter(prefix, StringUtils.fromString(destinationRegion));
        }
        if (enableSnapshotCopyRequest.getRetentionPeriod() != null) {
            prefix = "RetentionPeriod";
            Integer retentionPeriod = enableSnapshotCopyRequest.getRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(retentionPeriod));
        }
        if (enableSnapshotCopyRequest.getSnapshotCopyGrantName() != null) {
            prefix = "SnapshotCopyGrantName";
            String snapshotCopyGrantName = enableSnapshotCopyRequest.getSnapshotCopyGrantName();
            request.addParameter(prefix, StringUtils.fromString(snapshotCopyGrantName));
        }
        if (enableSnapshotCopyRequest.getManualSnapshotRetentionPeriod() != null) {
            prefix = "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = enableSnapshotCopyRequest
                    .getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }

        return request;
    }
}
