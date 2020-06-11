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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LinuxParameters
 */
class LinuxParametersJsonMarshaller {

    public void marshall(LinuxParameters linuxParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (linuxParameters.getCapabilities() != null) {
            KernelCapabilities capabilities = linuxParameters.getCapabilities();
            jsonWriter.name("capabilities");
            KernelCapabilitiesJsonMarshaller.getInstance().marshall(capabilities, jsonWriter);
        }
        if (linuxParameters.getDevices() != null) {
            java.util.List<Device> devices = linuxParameters.getDevices();
            jsonWriter.name("devices");
            jsonWriter.beginArray();
            for (Device devicesItem : devices) {
                if (devicesItem != null) {
                    DeviceJsonMarshaller.getInstance().marshall(devicesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (linuxParameters.getInitProcessEnabled() != null) {
            Boolean initProcessEnabled = linuxParameters.getInitProcessEnabled();
            jsonWriter.name("initProcessEnabled");
            jsonWriter.value(initProcessEnabled);
        }
        if (linuxParameters.getSharedMemorySize() != null) {
            Integer sharedMemorySize = linuxParameters.getSharedMemorySize();
            jsonWriter.name("sharedMemorySize");
            jsonWriter.value(sharedMemorySize);
        }
        if (linuxParameters.getTmpfs() != null) {
            java.util.List<Tmpfs> tmpfs = linuxParameters.getTmpfs();
            jsonWriter.name("tmpfs");
            jsonWriter.beginArray();
            for (Tmpfs tmpfsItem : tmpfs) {
                if (tmpfsItem != null) {
                    TmpfsJsonMarshaller.getInstance().marshall(tmpfsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (linuxParameters.getMaxSwap() != null) {
            Integer maxSwap = linuxParameters.getMaxSwap();
            jsonWriter.name("maxSwap");
            jsonWriter.value(maxSwap);
        }
        if (linuxParameters.getSwappiness() != null) {
            Integer swappiness = linuxParameters.getSwappiness();
            jsonWriter.name("swappiness");
            jsonWriter.value(swappiness);
        }
        jsonWriter.endObject();
    }

    private static LinuxParametersJsonMarshaller instance;

    public static LinuxParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LinuxParametersJsonMarshaller();
        return instance;
    }
}
