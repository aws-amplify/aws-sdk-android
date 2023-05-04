/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DatasetProperties
 */
class DatasetPropertiesJsonMarshaller {

    public void marshall(DatasetProperties datasetProperties, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetProperties.getDatasetArn() != null) {
            String datasetArn = datasetProperties.getDatasetArn();
            jsonWriter.name("DatasetArn");
            jsonWriter.value(datasetArn);
        }
        if (datasetProperties.getDatasetName() != null) {
            String datasetName = datasetProperties.getDatasetName();
            jsonWriter.name("DatasetName");
            jsonWriter.value(datasetName);
        }
        if (datasetProperties.getDatasetType() != null) {
            String datasetType = datasetProperties.getDatasetType();
            jsonWriter.name("DatasetType");
            jsonWriter.value(datasetType);
        }
        if (datasetProperties.getDatasetS3Uri() != null) {
            String datasetS3Uri = datasetProperties.getDatasetS3Uri();
            jsonWriter.name("DatasetS3Uri");
            jsonWriter.value(datasetS3Uri);
        }
        if (datasetProperties.getDescription() != null) {
            String description = datasetProperties.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (datasetProperties.getStatus() != null) {
            String status = datasetProperties.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (datasetProperties.getMessage() != null) {
            String message = datasetProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (datasetProperties.getNumberOfDocuments() != null) {
            Long numberOfDocuments = datasetProperties.getNumberOfDocuments();
            jsonWriter.name("NumberOfDocuments");
            jsonWriter.value(numberOfDocuments);
        }
        if (datasetProperties.getCreationTime() != null) {
            java.util.Date creationTime = datasetProperties.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (datasetProperties.getEndTime() != null) {
            java.util.Date endTime = datasetProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        jsonWriter.endObject();
    }

    private static DatasetPropertiesJsonMarshaller instance;

    public static DatasetPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetPropertiesJsonMarshaller();
        return instance;
    }
}
