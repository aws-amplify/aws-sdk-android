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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO InstancePatchState
 */
class InstancePatchStateJsonUnmarshaller implements Unmarshaller<InstancePatchState, JsonUnmarshallerContext> {

    public InstancePatchState unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstancePatchState instancePatchState = new InstancePatchState();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceId")) {
                instancePatchState.setInstanceId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("PatchGroup")) {
                instancePatchState.setPatchGroup(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("BaselineId")) {
                instancePatchState.setBaselineId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("SnapshotId")) {
                instancePatchState.setSnapshotId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstallOverrideList")) {
                instancePatchState.setInstallOverrideList(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OwnerInformation")) {
                instancePatchState.setOwnerInformation(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstalledCount")) {
                instancePatchState.setInstalledCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstalledOtherCount")) {
                instancePatchState.setInstalledOtherCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstalledPendingRebootCount")) {
                instancePatchState.setInstalledPendingRebootCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstalledRejectedCount")) {
                instancePatchState.setInstalledRejectedCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("MissingCount")) {
                instancePatchState.setMissingCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("FailedCount")) {
                instancePatchState.setFailedCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("UnreportedNotApplicableCount")) {
                instancePatchState.setUnreportedNotApplicableCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("NotApplicableCount")) {
                instancePatchState.setNotApplicableCount(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OperationStartTime")) {
                instancePatchState.setOperationStartTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OperationEndTime")) {
                instancePatchState.setOperationEndTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Operation")) {
                instancePatchState.setOperation(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastNoRebootInstallOperationTime")) {
                instancePatchState.setLastNoRebootInstallOperationTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RebootOption")) {
                instancePatchState.setRebootOption(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instancePatchState;
    }

    private static InstancePatchStateJsonUnmarshaller instance;
    public static InstancePatchStateJsonUnmarshaller getInstance() {
        if (instance == null) instance = new InstancePatchStateJsonUnmarshaller();
        return instance;
    }
}
