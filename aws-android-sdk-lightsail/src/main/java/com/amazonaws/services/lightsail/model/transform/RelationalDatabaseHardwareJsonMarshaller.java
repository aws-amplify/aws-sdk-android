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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RelationalDatabaseHardware
 */
class RelationalDatabaseHardwareJsonMarshaller {

    public void marshall(RelationalDatabaseHardware relationalDatabaseHardware,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (relationalDatabaseHardware.getCpuCount() != null) {
            Integer cpuCount = relationalDatabaseHardware.getCpuCount();
            jsonWriter.name("cpuCount");
            jsonWriter.value(cpuCount);
        }
        if (relationalDatabaseHardware.getDiskSizeInGb() != null) {
            Integer diskSizeInGb = relationalDatabaseHardware.getDiskSizeInGb();
            jsonWriter.name("diskSizeInGb");
            jsonWriter.value(diskSizeInGb);
        }
        if (relationalDatabaseHardware.getRamSizeInGb() != null) {
            Float ramSizeInGb = relationalDatabaseHardware.getRamSizeInGb();
            jsonWriter.name("ramSizeInGb");
            jsonWriter.value(ramSizeInGb);
        }
        jsonWriter.endObject();
    }

    private static RelationalDatabaseHardwareJsonMarshaller instance;

    public static RelationalDatabaseHardwareJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseHardwareJsonMarshaller();
        return instance;
    }
}
