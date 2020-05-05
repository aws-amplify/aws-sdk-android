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
 * JSON marshaller for POJO DescribeFastSnapshotRestoreSuccessItem
 */
class DescribeFastSnapshotRestoreSuccessItemJsonMarshaller {

    public void marshall(
            DescribeFastSnapshotRestoreSuccessItem describeFastSnapshotRestoreSuccessItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (describeFastSnapshotRestoreSuccessItem.getSnapshotId() != null) {
            String snapshotId = describeFastSnapshotRestoreSuccessItem.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (describeFastSnapshotRestoreSuccessItem.getAvailabilityZone() != null) {
            String availabilityZone = describeFastSnapshotRestoreSuccessItem.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (describeFastSnapshotRestoreSuccessItem.getState() != null) {
            String state = describeFastSnapshotRestoreSuccessItem.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (describeFastSnapshotRestoreSuccessItem.getStateTransitionReason() != null) {
            String stateTransitionReason = describeFastSnapshotRestoreSuccessItem
                    .getStateTransitionReason();
            jsonWriter.name("StateTransitionReason");
            jsonWriter.value(stateTransitionReason);
        }
        if (describeFastSnapshotRestoreSuccessItem.getOwnerId() != null) {
            String ownerId = describeFastSnapshotRestoreSuccessItem.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (describeFastSnapshotRestoreSuccessItem.getOwnerAlias() != null) {
            String ownerAlias = describeFastSnapshotRestoreSuccessItem.getOwnerAlias();
            jsonWriter.name("OwnerAlias");
            jsonWriter.value(ownerAlias);
        }
        if (describeFastSnapshotRestoreSuccessItem.getEnablingTime() != null) {
            java.util.Date enablingTime = describeFastSnapshotRestoreSuccessItem.getEnablingTime();
            jsonWriter.name("EnablingTime");
            jsonWriter.value(enablingTime);
        }
        if (describeFastSnapshotRestoreSuccessItem.getOptimizingTime() != null) {
            java.util.Date optimizingTime = describeFastSnapshotRestoreSuccessItem
                    .getOptimizingTime();
            jsonWriter.name("OptimizingTime");
            jsonWriter.value(optimizingTime);
        }
        if (describeFastSnapshotRestoreSuccessItem.getEnabledTime() != null) {
            java.util.Date enabledTime = describeFastSnapshotRestoreSuccessItem.getEnabledTime();
            jsonWriter.name("EnabledTime");
            jsonWriter.value(enabledTime);
        }
        if (describeFastSnapshotRestoreSuccessItem.getDisablingTime() != null) {
            java.util.Date disablingTime = describeFastSnapshotRestoreSuccessItem
                    .getDisablingTime();
            jsonWriter.name("DisablingTime");
            jsonWriter.value(disablingTime);
        }
        if (describeFastSnapshotRestoreSuccessItem.getDisabledTime() != null) {
            java.util.Date disabledTime = describeFastSnapshotRestoreSuccessItem.getDisabledTime();
            jsonWriter.name("DisabledTime");
            jsonWriter.value(disabledTime);
        }
        jsonWriter.endObject();
    }

    private static DescribeFastSnapshotRestoreSuccessItemJsonMarshaller instance;

    public static DescribeFastSnapshotRestoreSuccessItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFastSnapshotRestoreSuccessItemJsonMarshaller();
        return instance;
    }
}
