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
 * JSON marshaller for POJO InstanceStorageInfo
 */
class InstanceStorageInfoJsonMarshaller {

    public void marshall(InstanceStorageInfo instanceStorageInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceStorageInfo.getTotalSizeInGB() != null) {
            Long totalSizeInGB = instanceStorageInfo.getTotalSizeInGB();
            jsonWriter.name("TotalSizeInGB");
            jsonWriter.value(totalSizeInGB);
        }
        if (instanceStorageInfo.getDisks() != null) {
            java.util.List<DiskInfo> disks = instanceStorageInfo.getDisks();
            jsonWriter.name("Disks");
            jsonWriter.beginArray();
            for (DiskInfo disksItem : disks) {
                if (disksItem != null) {
                    DiskInfoJsonMarshaller.getInstance().marshall(disksItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InstanceStorageInfoJsonMarshaller instance;

    public static InstanceStorageInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStorageInfoJsonMarshaller();
        return instance;
    }
}
