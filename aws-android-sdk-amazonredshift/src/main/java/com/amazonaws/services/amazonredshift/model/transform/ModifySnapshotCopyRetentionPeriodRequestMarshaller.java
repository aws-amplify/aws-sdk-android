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
 * StAX request marshaller for ModifySnapshotCopyRetentionPeriodRequest
 */
public class ModifySnapshotCopyRetentionPeriodRequestMarshaller
        implements
        Marshaller<Request<ModifySnapshotCopyRetentionPeriodRequest>, ModifySnapshotCopyRetentionPeriodRequest> {

    public Request<ModifySnapshotCopyRetentionPeriodRequest> marshall(
            ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest) {
        if (modifySnapshotCopyRetentionPeriodRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifySnapshotCopyRetentionPeriodRequest)");
        }

        Request<ModifySnapshotCopyRetentionPeriodRequest> request = new DefaultRequest<ModifySnapshotCopyRetentionPeriodRequest>(
                modifySnapshotCopyRetentionPeriodRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifySnapshotCopyRetentionPeriod");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (modifySnapshotCopyRetentionPeriodRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = modifySnapshotCopyRetentionPeriodRequest
                    .getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (modifySnapshotCopyRetentionPeriodRequest.getRetentionPeriod() != null) {
            prefix = "RetentionPeriod";
            Integer retentionPeriod = modifySnapshotCopyRetentionPeriodRequest.getRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(retentionPeriod));
        }
        if (modifySnapshotCopyRetentionPeriodRequest.getManual() != null) {
            prefix = "Manual";
            Boolean manual = modifySnapshotCopyRetentionPeriodRequest.getManual();
            request.addParameter(prefix, StringUtils.fromBoolean(manual));
        }

        return request;
    }
}
