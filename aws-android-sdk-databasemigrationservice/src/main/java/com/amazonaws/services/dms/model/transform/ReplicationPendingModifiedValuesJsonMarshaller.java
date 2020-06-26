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
 * JSON marshaller for POJO ReplicationPendingModifiedValues
 */
class ReplicationPendingModifiedValuesJsonMarshaller {

    public void marshall(ReplicationPendingModifiedValues replicationPendingModifiedValues,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (replicationPendingModifiedValues.getReplicationInstanceClass() != null) {
            String replicationInstanceClass = replicationPendingModifiedValues
                    .getReplicationInstanceClass();
            jsonWriter.name("ReplicationInstanceClass");
            jsonWriter.value(replicationInstanceClass);
        }
        if (replicationPendingModifiedValues.getAllocatedStorage() != null) {
            Integer allocatedStorage = replicationPendingModifiedValues.getAllocatedStorage();
            jsonWriter.name("AllocatedStorage");
            jsonWriter.value(allocatedStorage);
        }
        if (replicationPendingModifiedValues.getMultiAZ() != null) {
            Boolean multiAZ = replicationPendingModifiedValues.getMultiAZ();
            jsonWriter.name("MultiAZ");
            jsonWriter.value(multiAZ);
        }
        if (replicationPendingModifiedValues.getEngineVersion() != null) {
            String engineVersion = replicationPendingModifiedValues.getEngineVersion();
            jsonWriter.name("EngineVersion");
            jsonWriter.value(engineVersion);
        }
        jsonWriter.endObject();
    }

    private static ReplicationPendingModifiedValuesJsonMarshaller instance;

    public static ReplicationPendingModifiedValuesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationPendingModifiedValuesJsonMarshaller();
        return instance;
    }
}
