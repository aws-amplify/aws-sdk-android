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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstancePatchState
 */
class InstancePatchStateJsonMarshaller {

    public void marshall(InstancePatchState instancePatchState, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instancePatchState.getInstanceId() != null) {
            String instanceId = instancePatchState.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instancePatchState.getPatchGroup() != null) {
            String patchGroup = instancePatchState.getPatchGroup();
            jsonWriter.name("PatchGroup");
            jsonWriter.value(patchGroup);
        }
        if (instancePatchState.getBaselineId() != null) {
            String baselineId = instancePatchState.getBaselineId();
            jsonWriter.name("BaselineId");
            jsonWriter.value(baselineId);
        }
        if (instancePatchState.getSnapshotId() != null) {
            String snapshotId = instancePatchState.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (instancePatchState.getInstallOverrideList() != null) {
            String installOverrideList = instancePatchState.getInstallOverrideList();
            jsonWriter.name("InstallOverrideList");
            jsonWriter.value(installOverrideList);
        }
        if (instancePatchState.getOwnerInformation() != null) {
            String ownerInformation = instancePatchState.getOwnerInformation();
            jsonWriter.name("OwnerInformation");
            jsonWriter.value(ownerInformation);
        }
        if (instancePatchState.getInstalledCount() != null) {
            Integer installedCount = instancePatchState.getInstalledCount();
            jsonWriter.name("InstalledCount");
            jsonWriter.value(installedCount);
        }
        if (instancePatchState.getInstalledOtherCount() != null) {
            Integer installedOtherCount = instancePatchState.getInstalledOtherCount();
            jsonWriter.name("InstalledOtherCount");
            jsonWriter.value(installedOtherCount);
        }
        if (instancePatchState.getInstalledPendingRebootCount() != null) {
            Integer installedPendingRebootCount = instancePatchState.getInstalledPendingRebootCount();
            jsonWriter.name("InstalledPendingRebootCount");
            jsonWriter.value(installedPendingRebootCount);
        }
        if (instancePatchState.getInstalledRejectedCount() != null) {
            Integer installedRejectedCount = instancePatchState.getInstalledRejectedCount();
            jsonWriter.name("InstalledRejectedCount");
            jsonWriter.value(installedRejectedCount);
        }
        if (instancePatchState.getMissingCount() != null) {
            Integer missingCount = instancePatchState.getMissingCount();
            jsonWriter.name("MissingCount");
            jsonWriter.value(missingCount);
        }
        if (instancePatchState.getFailedCount() != null) {
            Integer failedCount = instancePatchState.getFailedCount();
            jsonWriter.name("FailedCount");
            jsonWriter.value(failedCount);
        }
        if (instancePatchState.getUnreportedNotApplicableCount() != null) {
            Integer unreportedNotApplicableCount = instancePatchState.getUnreportedNotApplicableCount();
            jsonWriter.name("UnreportedNotApplicableCount");
            jsonWriter.value(unreportedNotApplicableCount);
        }
        if (instancePatchState.getNotApplicableCount() != null) {
            Integer notApplicableCount = instancePatchState.getNotApplicableCount();
            jsonWriter.name("NotApplicableCount");
            jsonWriter.value(notApplicableCount);
        }
        if (instancePatchState.getOperationStartTime() != null) {
            java.util.Date operationStartTime = instancePatchState.getOperationStartTime();
            jsonWriter.name("OperationStartTime");
            jsonWriter.value(operationStartTime);
        }
        if (instancePatchState.getOperationEndTime() != null) {
            java.util.Date operationEndTime = instancePatchState.getOperationEndTime();
            jsonWriter.name("OperationEndTime");
            jsonWriter.value(operationEndTime);
        }
        if (instancePatchState.getOperation() != null) {
            String operation = instancePatchState.getOperation();
            jsonWriter.name("Operation");
            jsonWriter.value(operation);
        }
        if (instancePatchState.getLastNoRebootInstallOperationTime() != null) {
            java.util.Date lastNoRebootInstallOperationTime = instancePatchState.getLastNoRebootInstallOperationTime();
            jsonWriter.name("LastNoRebootInstallOperationTime");
            jsonWriter.value(lastNoRebootInstallOperationTime);
        }
        if (instancePatchState.getRebootOption() != null) {
            String rebootOption = instancePatchState.getRebootOption();
            jsonWriter.name("RebootOption");
            jsonWriter.value(rebootOption);
        }
        jsonWriter.endObject();
    }

    private static InstancePatchStateJsonMarshaller instance;
    public static InstancePatchStateJsonMarshaller getInstance() {
        if (instance == null) instance = new InstancePatchStateJsonMarshaller();
        return instance;
    }
}
