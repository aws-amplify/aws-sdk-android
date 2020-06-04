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
 * JSON marshaller for POJO InstanceHardware
 */
class InstanceHardwareJsonMarshaller {

    public void marshall(InstanceHardware instanceHardware, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceHardware.getCpuCount() != null) {
            Integer cpuCount = instanceHardware.getCpuCount();
            jsonWriter.name("cpuCount");
            jsonWriter.value(cpuCount);
        }
        if (instanceHardware.getDisks() != null) {
            java.util.List<Disk> disks = instanceHardware.getDisks();
            jsonWriter.name("disks");
            jsonWriter.beginArray();
            for (Disk disksItem : disks) {
                if (disksItem != null) {
                    DiskJsonMarshaller.getInstance().marshall(disksItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceHardware.getRamSizeInGb() != null) {
            Float ramSizeInGb = instanceHardware.getRamSizeInGb();
            jsonWriter.name("ramSizeInGb");
            jsonWriter.value(ramSizeInGb);
        }
        jsonWriter.endObject();
    }

    private static InstanceHardwareJsonMarshaller instance;

    public static InstanceHardwareJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceHardwareJsonMarshaller();
        return instance;
    }
}
