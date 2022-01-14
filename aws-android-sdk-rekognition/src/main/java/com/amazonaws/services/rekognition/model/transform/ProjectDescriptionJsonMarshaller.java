/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProjectDescription
 */
class ProjectDescriptionJsonMarshaller {

    public void marshall(ProjectDescription projectDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (projectDescription.getProjectArn() != null) {
            String projectArn = projectDescription.getProjectArn();
            jsonWriter.name("ProjectArn");
            jsonWriter.value(projectArn);
        }
        if (projectDescription.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = projectDescription.getCreationTimestamp();
            jsonWriter.name("CreationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (projectDescription.getStatus() != null) {
            String status = projectDescription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (projectDescription.getDatasets() != null) {
            java.util.List<DatasetMetadata> datasets = projectDescription.getDatasets();
            jsonWriter.name("Datasets");
            jsonWriter.beginArray();
            for (DatasetMetadata datasetsItem : datasets) {
                if (datasetsItem != null) {
                    DatasetMetadataJsonMarshaller.getInstance().marshall(datasetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProjectDescriptionJsonMarshaller instance;

    public static ProjectDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectDescriptionJsonMarshaller();
        return instance;
    }
}
