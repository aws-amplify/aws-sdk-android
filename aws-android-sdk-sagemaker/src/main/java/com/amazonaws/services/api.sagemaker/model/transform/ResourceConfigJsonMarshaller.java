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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceConfig
 */
class ResourceConfigJsonMarshaller {

    public void marshall(ResourceConfig resourceConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceConfig.getInstanceType() != null) {
            String instanceType = resourceConfig.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (resourceConfig.getInstanceCount() != null) {
            Integer instanceCount = resourceConfig.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (resourceConfig.getVolumeSizeInGB() != null) {
            Integer volumeSizeInGB = resourceConfig.getVolumeSizeInGB();
            jsonWriter.name("VolumeSizeInGB");
            jsonWriter.value(volumeSizeInGB);
        }
        if (resourceConfig.getVolumeKmsKeyId() != null) {
            String volumeKmsKeyId = resourceConfig.getVolumeKmsKeyId();
            jsonWriter.name("VolumeKmsKeyId");
            jsonWriter.value(volumeKmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static ResourceConfigJsonMarshaller instance;

    public static ResourceConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceConfigJsonMarshaller();
        return instance;
    }
}
