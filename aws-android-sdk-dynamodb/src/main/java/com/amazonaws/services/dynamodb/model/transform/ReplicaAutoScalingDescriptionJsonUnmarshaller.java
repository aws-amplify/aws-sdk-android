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

package com.amazonaws.services.dynamodb.model.transform;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReplicaAutoScalingDescription
 */
class ReplicaAutoScalingDescriptionJsonUnmarshaller implements
        Unmarshaller<ReplicaAutoScalingDescription, JsonUnmarshallerContext> {

    public ReplicaAutoScalingDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReplicaAutoScalingDescription replicaAutoScalingDescription = new ReplicaAutoScalingDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RegionName")) {
                replicaAutoScalingDescription.setRegionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlobalSecondaryIndexes")) {
                replicaAutoScalingDescription
                        .setGlobalSecondaryIndexes(new ListUnmarshaller<ReplicaGlobalSecondaryIndexAutoScalingDescription>(
                                ReplicaGlobalSecondaryIndexAutoScalingDescriptionJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReplicaProvisionedReadCapacityAutoScalingSettings")) {
                replicaAutoScalingDescription
                        .setReplicaProvisionedReadCapacityAutoScalingSettings(AutoScalingSettingsDescriptionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ReplicaProvisionedWriteCapacityAutoScalingSettings")) {
                replicaAutoScalingDescription
                        .setReplicaProvisionedWriteCapacityAutoScalingSettings(AutoScalingSettingsDescriptionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ReplicaStatus")) {
                replicaAutoScalingDescription.setReplicaStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return replicaAutoScalingDescription;
    }

    private static ReplicaAutoScalingDescriptionJsonUnmarshaller instance;

    public static ReplicaAutoScalingDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaAutoScalingDescriptionJsonUnmarshaller();
        return instance;
    }
}
