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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO OrderableReplicationInstance
 */
class OrderableReplicationInstanceJsonUnmarshaller implements
        Unmarshaller<OrderableReplicationInstance, JsonUnmarshallerContext> {

    public OrderableReplicationInstance unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OrderableReplicationInstance orderableReplicationInstance = new OrderableReplicationInstance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EngineVersion")) {
                orderableReplicationInstance.setEngineVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationInstanceClass")) {
                orderableReplicationInstance.setReplicationInstanceClass(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageType")) {
                orderableReplicationInstance.setStorageType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinAllocatedStorage")) {
                orderableReplicationInstance.setMinAllocatedStorage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxAllocatedStorage")) {
                orderableReplicationInstance.setMaxAllocatedStorage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultAllocatedStorage")) {
                orderableReplicationInstance.setDefaultAllocatedStorage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IncludedAllocatedStorage")) {
                orderableReplicationInstance.setIncludedAllocatedStorage(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZones")) {
                orderableReplicationInstance.setAvailabilityZones(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReleaseStatus")) {
                orderableReplicationInstance.setReleaseStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return orderableReplicationInstance;
    }

    private static OrderableReplicationInstanceJsonUnmarshaller instance;

    public static OrderableReplicationInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrderableReplicationInstanceJsonUnmarshaller();
        return instance;
    }
}
