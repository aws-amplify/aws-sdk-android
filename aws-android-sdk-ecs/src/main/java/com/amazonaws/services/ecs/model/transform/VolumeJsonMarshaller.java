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
 * JSON marshaller for POJO Volume
 */
class VolumeJsonMarshaller {

    public void marshall(Volume volume, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (volume.getName() != null) {
            String name = volume.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (volume.getHost() != null) {
            HostVolumeProperties host = volume.getHost();
            jsonWriter.name("host");
            HostVolumePropertiesJsonMarshaller.getInstance().marshall(host, jsonWriter);
        }
        if (volume.getDockerVolumeConfiguration() != null) {
            DockerVolumeConfiguration dockerVolumeConfiguration = volume
                    .getDockerVolumeConfiguration();
            jsonWriter.name("dockerVolumeConfiguration");
            DockerVolumeConfigurationJsonMarshaller.getInstance().marshall(
                    dockerVolumeConfiguration, jsonWriter);
        }
        if (volume.getEfsVolumeConfiguration() != null) {
            EFSVolumeConfiguration efsVolumeConfiguration = volume.getEfsVolumeConfiguration();
            jsonWriter.name("efsVolumeConfiguration");
            EFSVolumeConfigurationJsonMarshaller.getInstance().marshall(efsVolumeConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static VolumeJsonMarshaller instance;

    public static VolumeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeJsonMarshaller();
        return instance;
    }
}
