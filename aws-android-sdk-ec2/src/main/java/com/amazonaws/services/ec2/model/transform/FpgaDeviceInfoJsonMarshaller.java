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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FpgaDeviceInfo
 */
class FpgaDeviceInfoJsonMarshaller {

    public void marshall(FpgaDeviceInfo fpgaDeviceInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fpgaDeviceInfo.getName() != null) {
            String name = fpgaDeviceInfo.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (fpgaDeviceInfo.getManufacturer() != null) {
            String manufacturer = fpgaDeviceInfo.getManufacturer();
            jsonWriter.name("Manufacturer");
            jsonWriter.value(manufacturer);
        }
        if (fpgaDeviceInfo.getCount() != null) {
            Integer count = fpgaDeviceInfo.getCount();
            jsonWriter.name("Count");
            jsonWriter.value(count);
        }
        if (fpgaDeviceInfo.getMemoryInfo() != null) {
            FpgaDeviceMemoryInfo memoryInfo = fpgaDeviceInfo.getMemoryInfo();
            jsonWriter.name("MemoryInfo");
            FpgaDeviceMemoryInfoJsonMarshaller.getInstance().marshall(memoryInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static FpgaDeviceInfoJsonMarshaller instance;

    public static FpgaDeviceInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FpgaDeviceInfoJsonMarshaller();
        return instance;
    }
}
