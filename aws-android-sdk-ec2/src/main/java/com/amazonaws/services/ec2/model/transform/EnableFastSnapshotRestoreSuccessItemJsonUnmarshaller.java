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
 * JSON unmarshaller for POJO EnableFastSnapshotRestoreSuccessItem
 */
class EnableFastSnapshotRestoreSuccessItemJsonUnmarshaller implements
        Unmarshaller<EnableFastSnapshotRestoreSuccessItem, JsonUnmarshallerContext> {

    public EnableFastSnapshotRestoreSuccessItem unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EnableFastSnapshotRestoreSuccessItem enableFastSnapshotRestoreSuccessItem = new EnableFastSnapshotRestoreSuccessItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SnapshotId")) {
                enableFastSnapshotRestoreSuccessItem.setSnapshotId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                enableFastSnapshotRestoreSuccessItem.setAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                enableFastSnapshotRestoreSuccessItem.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateTransitionReason")) {
                enableFastSnapshotRestoreSuccessItem
                        .setStateTransitionReason(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                enableFastSnapshotRestoreSuccessItem.setOwnerId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerAlias")) {
                enableFastSnapshotRestoreSuccessItem.setOwnerAlias(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnablingTime")) {
                enableFastSnapshotRestoreSuccessItem.setEnablingTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OptimizingTime")) {
                enableFastSnapshotRestoreSuccessItem.setOptimizingTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnabledTime")) {
                enableFastSnapshotRestoreSuccessItem.setEnabledTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisablingTime")) {
                enableFastSnapshotRestoreSuccessItem.setDisablingTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisabledTime")) {
                enableFastSnapshotRestoreSuccessItem.setDisabledTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return enableFastSnapshotRestoreSuccessItem;
    }

    private static EnableFastSnapshotRestoreSuccessItemJsonUnmarshaller instance;

    public static EnableFastSnapshotRestoreSuccessItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnableFastSnapshotRestoreSuccessItemJsonUnmarshaller();
        return instance;
    }
}
