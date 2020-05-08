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
 * JSON marshaller for POJO ProcessingClusterConfig
 */
class ProcessingClusterConfigJsonMarshaller {

    public void marshall(ProcessingClusterConfig processingClusterConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processingClusterConfig.getInstanceCount() != null) {
            Integer instanceCount = processingClusterConfig.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (processingClusterConfig.getInstanceType() != null) {
            String instanceType = processingClusterConfig.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (processingClusterConfig.getVolumeSizeInGB() != null) {
            Integer volumeSizeInGB = processingClusterConfig.getVolumeSizeInGB();
            jsonWriter.name("VolumeSizeInGB");
            jsonWriter.value(volumeSizeInGB);
        }
        if (processingClusterConfig.getVolumeKmsKeyId() != null) {
            String volumeKmsKeyId = processingClusterConfig.getVolumeKmsKeyId();
            jsonWriter.name("VolumeKmsKeyId");
            jsonWriter.value(volumeKmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static ProcessingClusterConfigJsonMarshaller instance;

    public static ProcessingClusterConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingClusterConfigJsonMarshaller();
        return instance;
    }
}
