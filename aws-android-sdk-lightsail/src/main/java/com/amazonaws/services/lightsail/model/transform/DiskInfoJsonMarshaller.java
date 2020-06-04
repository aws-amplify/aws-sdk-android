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
 * JSON marshaller for POJO DiskInfo
 */
class DiskInfoJsonMarshaller {

    public void marshall(DiskInfo diskInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (diskInfo.getName() != null) {
            String name = diskInfo.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (diskInfo.getPath() != null) {
            String path = diskInfo.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (diskInfo.getSizeInGb() != null) {
            Integer sizeInGb = diskInfo.getSizeInGb();
            jsonWriter.name("sizeInGb");
            jsonWriter.value(sizeInGb);
        }
        if (diskInfo.getIsSystemDisk() != null) {
            Boolean isSystemDisk = diskInfo.getIsSystemDisk();
            jsonWriter.name("isSystemDisk");
            jsonWriter.value(isSystemDisk);
        }
        jsonWriter.endObject();
    }

    private static DiskInfoJsonMarshaller instance;

    public static DiskInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DiskInfoJsonMarshaller();
        return instance;
    }
}
