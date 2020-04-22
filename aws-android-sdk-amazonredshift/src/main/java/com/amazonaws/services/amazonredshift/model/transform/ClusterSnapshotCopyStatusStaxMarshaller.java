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

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ClusterSnapshotCopyStatus
 */
class ClusterSnapshotCopyStatusStaxMarshaller {

    public void marshall(ClusterSnapshotCopyStatus _clusterSnapshotCopyStatus, Request<?> request,
            String _prefix) {
        String prefix;
        if (_clusterSnapshotCopyStatus.getDestinationRegion() != null) {
            prefix = _prefix + "DestinationRegion";
            String destinationRegion = _clusterSnapshotCopyStatus.getDestinationRegion();
            request.addParameter(prefix, StringUtils.fromString(destinationRegion));
        }
        if (_clusterSnapshotCopyStatus.getRetentionPeriod() != null) {
            prefix = _prefix + "RetentionPeriod";
            Long retentionPeriod = _clusterSnapshotCopyStatus.getRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromLong(retentionPeriod));
        }
        if (_clusterSnapshotCopyStatus.getManualSnapshotRetentionPeriod() != null) {
            prefix = _prefix + "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = _clusterSnapshotCopyStatus
                    .getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }
        if (_clusterSnapshotCopyStatus.getSnapshotCopyGrantName() != null) {
            prefix = _prefix + "SnapshotCopyGrantName";
            String snapshotCopyGrantName = _clusterSnapshotCopyStatus.getSnapshotCopyGrantName();
            request.addParameter(prefix, StringUtils.fromString(snapshotCopyGrantName));
        }
    }

    private static ClusterSnapshotCopyStatusStaxMarshaller instance;

    public static ClusterSnapshotCopyStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterSnapshotCopyStatusStaxMarshaller();
        return instance;
    }
}
