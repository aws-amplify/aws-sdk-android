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
 * JSON unmarshaller for POJO ReplicaAutoScalingUpdate
 */
class ReplicaAutoScalingUpdateJsonUnmarshaller implements
        Unmarshaller<ReplicaAutoScalingUpdate, JsonUnmarshallerContext> {

    public ReplicaAutoScalingUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReplicaAutoScalingUpdate replicaAutoScalingUpdate = new ReplicaAutoScalingUpdate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RegionName")) {
                replicaAutoScalingUpdate.setRegionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicaGlobalSecondaryIndexUpdates")) {
                replicaAutoScalingUpdate
                        .setReplicaGlobalSecondaryIndexUpdates(new ListUnmarshaller<ReplicaGlobalSecondaryIndexAutoScalingUpdate>(
                                ReplicaGlobalSecondaryIndexAutoScalingUpdateJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReplicaProvisionedReadCapacityAutoScalingUpdate")) {
                replicaAutoScalingUpdate
                        .setReplicaProvisionedReadCapacityAutoScalingUpdate(AutoScalingSettingsUpdateJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return replicaAutoScalingUpdate;
    }

    private static ReplicaAutoScalingUpdateJsonUnmarshaller instance;

    public static ReplicaAutoScalingUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicaAutoScalingUpdateJsonUnmarshaller();
        return instance;
    }
}
