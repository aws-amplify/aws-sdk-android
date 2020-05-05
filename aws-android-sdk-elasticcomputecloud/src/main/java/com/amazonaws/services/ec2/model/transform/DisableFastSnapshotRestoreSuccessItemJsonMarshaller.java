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
 * JSON marshaller for POJO DisableFastSnapshotRestoreSuccessItem
 */
class DisableFastSnapshotRestoreSuccessItemJsonMarshaller {

    public void marshall(
            DisableFastSnapshotRestoreSuccessItem disableFastSnapshotRestoreSuccessItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (disableFastSnapshotRestoreSuccessItem.getSnapshotId() != null) {
            String snapshotId = disableFastSnapshotRestoreSuccessItem.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (disableFastSnapshotRestoreSuccessItem.getAvailabilityZone() != null) {
            String availabilityZone = disableFastSnapshotRestoreSuccessItem.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (disableFastSnapshotRestoreSuccessItem.getState() != null) {
            String state = disableFastSnapshotRestoreSuccessItem.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (disableFastSnapshotRestoreSuccessItem.getStateTransitionReason() != null) {
            String stateTransitionReason = disableFastSnapshotRestoreSuccessItem
                    .getStateTransitionReason();
            jsonWriter.name("StateTransitionReason");
            jsonWriter.value(stateTransitionReason);
        }
        if (disableFastSnapshotRestoreSuccessItem.getOwnerId() != null) {
            String ownerId = disableFastSnapshotRestoreSuccessItem.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (disableFastSnapshotRestoreSuccessItem.getOwnerAlias() != null) {
            String ownerAlias = disableFastSnapshotRestoreSuccessItem.getOwnerAlias();
            jsonWriter.name("OwnerAlias");
            jsonWriter.value(ownerAlias);
        }
        if (disableFastSnapshotRestoreSuccessItem.getEnablingTime() != null) {
            java.util.Date enablingTime = disableFastSnapshotRestoreSuccessItem.getEnablingTime();
            jsonWriter.name("EnablingTime");
            jsonWriter.value(enablingTime);
        }
        if (disableFastSnapshotRestoreSuccessItem.getOptimizingTime() != null) {
            java.util.Date optimizingTime = disableFastSnapshotRestoreSuccessItem
                    .getOptimizingTime();
            jsonWriter.name("OptimizingTime");
            jsonWriter.value(optimizingTime);
        }
        if (disableFastSnapshotRestoreSuccessItem.getEnabledTime() != null) {
            java.util.Date enabledTime = disableFastSnapshotRestoreSuccessItem.getEnabledTime();
            jsonWriter.name("EnabledTime");
            jsonWriter.value(enabledTime);
        }
        if (disableFastSnapshotRestoreSuccessItem.getDisablingTime() != null) {
            java.util.Date disablingTime = disableFastSnapshotRestoreSuccessItem.getDisablingTime();
            jsonWriter.name("DisablingTime");
            jsonWriter.value(disablingTime);
        }
        if (disableFastSnapshotRestoreSuccessItem.getDisabledTime() != null) {
            java.util.Date disabledTime = disableFastSnapshotRestoreSuccessItem.getDisabledTime();
            jsonWriter.name("DisabledTime");
            jsonWriter.value(disabledTime);
        }
        jsonWriter.endObject();
    }

    private static DisableFastSnapshotRestoreSuccessItemJsonMarshaller instance;

    public static DisableFastSnapshotRestoreSuccessItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DisableFastSnapshotRestoreSuccessItemJsonMarshaller();
        return instance;
    }
}
