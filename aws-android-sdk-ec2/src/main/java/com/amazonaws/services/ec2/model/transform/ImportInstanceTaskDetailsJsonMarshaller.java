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
 * JSON marshaller for POJO ImportInstanceTaskDetails
 */
class ImportInstanceTaskDetailsJsonMarshaller {

    public void marshall(ImportInstanceTaskDetails importInstanceTaskDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (importInstanceTaskDetails.getDescription() != null) {
            String description = importInstanceTaskDetails.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (importInstanceTaskDetails.getInstanceId() != null) {
            String instanceId = importInstanceTaskDetails.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (importInstanceTaskDetails.getPlatform() != null) {
            String platform = importInstanceTaskDetails.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (importInstanceTaskDetails.getVolumes() != null) {
            java.util.List<ImportInstanceVolumeDetailItem> volumes = importInstanceTaskDetails
                    .getVolumes();
            jsonWriter.name("Volumes");
            jsonWriter.beginArray();
            for (ImportInstanceVolumeDetailItem volumesItem : volumes) {
                if (volumesItem != null) {
                    ImportInstanceVolumeDetailItemJsonMarshaller.getInstance().marshall(
                            volumesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ImportInstanceTaskDetailsJsonMarshaller instance;

    public static ImportInstanceTaskDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportInstanceTaskDetailsJsonMarshaller();
        return instance;
    }
}
