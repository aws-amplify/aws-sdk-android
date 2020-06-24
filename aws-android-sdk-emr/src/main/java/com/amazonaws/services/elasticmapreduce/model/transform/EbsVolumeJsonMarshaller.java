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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EbsVolume
 */
class EbsVolumeJsonMarshaller {

    public void marshall(EbsVolume ebsVolume, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ebsVolume.getDevice() != null) {
            String device = ebsVolume.getDevice();
            jsonWriter.name("Device");
            jsonWriter.value(device);
        }
        if (ebsVolume.getVolumeId() != null) {
            String volumeId = ebsVolume.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        jsonWriter.endObject();
    }

    private static EbsVolumeJsonMarshaller instance;

    public static EbsVolumeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EbsVolumeJsonMarshaller();
        return instance;
    }
}
