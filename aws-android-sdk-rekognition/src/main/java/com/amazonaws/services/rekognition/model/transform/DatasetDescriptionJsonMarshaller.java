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
 * JSON marshaller for POJO DatasetDescription
 */
class DatasetDescriptionJsonMarshaller {

    public void marshall(DatasetDescription datasetDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetDescription.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = datasetDescription.getCreationTimestamp();
            jsonWriter.name("CreationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (datasetDescription.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = datasetDescription.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        if (datasetDescription.getStatus() != null) {
            String status = datasetDescription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (datasetDescription.getStatusMessage() != null) {
            String statusMessage = datasetDescription.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (datasetDescription.getStatusMessageCode() != null) {
            String statusMessageCode = datasetDescription.getStatusMessageCode();
            jsonWriter.name("StatusMessageCode");
            jsonWriter.value(statusMessageCode);
        }
        if (datasetDescription.getDatasetStats() != null) {
            DatasetStats datasetStats = datasetDescription.getDatasetStats();
            jsonWriter.name("DatasetStats");
            DatasetStatsJsonMarshaller.getInstance().marshall(datasetStats, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DatasetDescriptionJsonMarshaller instance;

    public static DatasetDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetDescriptionJsonMarshaller();
        return instance;
    }
}
