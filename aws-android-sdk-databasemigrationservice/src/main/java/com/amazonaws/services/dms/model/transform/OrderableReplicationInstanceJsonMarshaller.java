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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OrderableReplicationInstance
 */
class OrderableReplicationInstanceJsonMarshaller {

    public void marshall(OrderableReplicationInstance orderableReplicationInstance,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (orderableReplicationInstance.getEngineVersion() != null) {
            String engineVersion = orderableReplicationInstance.getEngineVersion();
            jsonWriter.name("EngineVersion");
            jsonWriter.value(engineVersion);
        }
        if (orderableReplicationInstance.getReplicationInstanceClass() != null) {
            String replicationInstanceClass = orderableReplicationInstance
                    .getReplicationInstanceClass();
            jsonWriter.name("ReplicationInstanceClass");
            jsonWriter.value(replicationInstanceClass);
        }
        if (orderableReplicationInstance.getStorageType() != null) {
            String storageType = orderableReplicationInstance.getStorageType();
            jsonWriter.name("StorageType");
            jsonWriter.value(storageType);
        }
        if (orderableReplicationInstance.getMinAllocatedStorage() != null) {
            Integer minAllocatedStorage = orderableReplicationInstance.getMinAllocatedStorage();
            jsonWriter.name("MinAllocatedStorage");
            jsonWriter.value(minAllocatedStorage);
        }
        if (orderableReplicationInstance.getMaxAllocatedStorage() != null) {
            Integer maxAllocatedStorage = orderableReplicationInstance.getMaxAllocatedStorage();
            jsonWriter.name("MaxAllocatedStorage");
            jsonWriter.value(maxAllocatedStorage);
        }
        if (orderableReplicationInstance.getDefaultAllocatedStorage() != null) {
            Integer defaultAllocatedStorage = orderableReplicationInstance
                    .getDefaultAllocatedStorage();
            jsonWriter.name("DefaultAllocatedStorage");
            jsonWriter.value(defaultAllocatedStorage);
        }
        if (orderableReplicationInstance.getIncludedAllocatedStorage() != null) {
            Integer includedAllocatedStorage = orderableReplicationInstance
                    .getIncludedAllocatedStorage();
            jsonWriter.name("IncludedAllocatedStorage");
            jsonWriter.value(includedAllocatedStorage);
        }
        if (orderableReplicationInstance.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = orderableReplicationInstance
                    .getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (orderableReplicationInstance.getReleaseStatus() != null) {
            String releaseStatus = orderableReplicationInstance.getReleaseStatus();
            jsonWriter.name("ReleaseStatus");
            jsonWriter.value(releaseStatus);
        }
        jsonWriter.endObject();
    }

    private static OrderableReplicationInstanceJsonMarshaller instance;

    public static OrderableReplicationInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrderableReplicationInstanceJsonMarshaller();
        return instance;
    }
}
