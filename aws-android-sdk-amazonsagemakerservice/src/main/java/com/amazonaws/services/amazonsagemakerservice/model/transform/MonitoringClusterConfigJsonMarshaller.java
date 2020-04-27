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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MonitoringClusterConfig
 */
class MonitoringClusterConfigJsonMarshaller {

    public void marshall(MonitoringClusterConfig monitoringClusterConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (monitoringClusterConfig.getInstanceCount() != null) {
            Integer instanceCount = monitoringClusterConfig.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (monitoringClusterConfig.getInstanceType() != null) {
            String instanceType = monitoringClusterConfig.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (monitoringClusterConfig.getVolumeSizeInGB() != null) {
            Integer volumeSizeInGB = monitoringClusterConfig.getVolumeSizeInGB();
            jsonWriter.name("VolumeSizeInGB");
            jsonWriter.value(volumeSizeInGB);
        }
        if (monitoringClusterConfig.getVolumeKmsKeyId() != null) {
            String volumeKmsKeyId = monitoringClusterConfig.getVolumeKmsKeyId();
            jsonWriter.name("VolumeKmsKeyId");
            jsonWriter.value(volumeKmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static MonitoringClusterConfigJsonMarshaller instance;

    public static MonitoringClusterConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringClusterConfigJsonMarshaller();
        return instance;
    }
}
