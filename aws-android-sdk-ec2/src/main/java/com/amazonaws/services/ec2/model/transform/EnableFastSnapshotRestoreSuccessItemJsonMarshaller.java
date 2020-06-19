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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EnableFastSnapshotRestoreSuccessItem
 */
class EnableFastSnapshotRestoreSuccessItemJsonMarshaller {

    public void marshall(EnableFastSnapshotRestoreSuccessItem enableFastSnapshotRestoreSuccessItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (enableFastSnapshotRestoreSuccessItem.getSnapshotId() != null) {
            String snapshotId = enableFastSnapshotRestoreSuccessItem.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (enableFastSnapshotRestoreSuccessItem.getAvailabilityZone() != null) {
            String availabilityZone = enableFastSnapshotRestoreSuccessItem.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (enableFastSnapshotRestoreSuccessItem.getState() != null) {
            String state = enableFastSnapshotRestoreSuccessItem.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (enableFastSnapshotRestoreSuccessItem.getStateTransitionReason() != null) {
            String stateTransitionReason = enableFastSnapshotRestoreSuccessItem
                    .getStateTransitionReason();
            jsonWriter.name("StateTransitionReason");
            jsonWriter.value(stateTransitionReason);
        }
        if (enableFastSnapshotRestoreSuccessItem.getOwnerId() != null) {
            String ownerId = enableFastSnapshotRestoreSuccessItem.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (enableFastSnapshotRestoreSuccessItem.getOwnerAlias() != null) {
            String ownerAlias = enableFastSnapshotRestoreSuccessItem.getOwnerAlias();
            jsonWriter.name("OwnerAlias");
            jsonWriter.value(ownerAlias);
        }
        if (enableFastSnapshotRestoreSuccessItem.getEnablingTime() != null) {
            java.util.Date enablingTime = enableFastSnapshotRestoreSuccessItem.getEnablingTime();
            jsonWriter.name("EnablingTime");
            jsonWriter.value(enablingTime);
        }
        if (enableFastSnapshotRestoreSuccessItem.getOptimizingTime() != null) {
            java.util.Date optimizingTime = enableFastSnapshotRestoreSuccessItem
                    .getOptimizingTime();
            jsonWriter.name("OptimizingTime");
            jsonWriter.value(optimizingTime);
        }
        if (enableFastSnapshotRestoreSuccessItem.getEnabledTime() != null) {
            java.util.Date enabledTime = enableFastSnapshotRestoreSuccessItem.getEnabledTime();
            jsonWriter.name("EnabledTime");
            jsonWriter.value(enabledTime);
        }
        if (enableFastSnapshotRestoreSuccessItem.getDisablingTime() != null) {
            java.util.Date disablingTime = enableFastSnapshotRestoreSuccessItem.getDisablingTime();
            jsonWriter.name("DisablingTime");
            jsonWriter.value(disablingTime);
        }
        if (enableFastSnapshotRestoreSuccessItem.getDisabledTime() != null) {
            java.util.Date disabledTime = enableFastSnapshotRestoreSuccessItem.getDisabledTime();
            jsonWriter.name("DisabledTime");
            jsonWriter.value(disabledTime);
        }
        jsonWriter.endObject();
    }

    private static EnableFastSnapshotRestoreSuccessItemJsonMarshaller instance;

    public static EnableFastSnapshotRestoreSuccessItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnableFastSnapshotRestoreSuccessItemJsonMarshaller();
        return instance;
    }
}
