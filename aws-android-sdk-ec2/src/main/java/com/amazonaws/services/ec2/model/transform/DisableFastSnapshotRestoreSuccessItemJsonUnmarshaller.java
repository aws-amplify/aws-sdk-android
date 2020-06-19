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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DisableFastSnapshotRestoreSuccessItem
 */
class DisableFastSnapshotRestoreSuccessItemJsonUnmarshaller implements
        Unmarshaller<DisableFastSnapshotRestoreSuccessItem, JsonUnmarshallerContext> {

    public DisableFastSnapshotRestoreSuccessItem unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DisableFastSnapshotRestoreSuccessItem disableFastSnapshotRestoreSuccessItem = new DisableFastSnapshotRestoreSuccessItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SnapshotId")) {
                disableFastSnapshotRestoreSuccessItem.setSnapshotId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                disableFastSnapshotRestoreSuccessItem.setAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                disableFastSnapshotRestoreSuccessItem.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateTransitionReason")) {
                disableFastSnapshotRestoreSuccessItem
                        .setStateTransitionReason(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                disableFastSnapshotRestoreSuccessItem.setOwnerId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerAlias")) {
                disableFastSnapshotRestoreSuccessItem.setOwnerAlias(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnablingTime")) {
                disableFastSnapshotRestoreSuccessItem.setEnablingTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OptimizingTime")) {
                disableFastSnapshotRestoreSuccessItem.setOptimizingTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnabledTime")) {
                disableFastSnapshotRestoreSuccessItem.setEnabledTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisablingTime")) {
                disableFastSnapshotRestoreSuccessItem.setDisablingTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisabledTime")) {
                disableFastSnapshotRestoreSuccessItem.setDisabledTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return disableFastSnapshotRestoreSuccessItem;
    }

    private static DisableFastSnapshotRestoreSuccessItemJsonUnmarshaller instance;

    public static DisableFastSnapshotRestoreSuccessItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisableFastSnapshotRestoreSuccessItemJsonUnmarshaller();
        return instance;
    }
}
