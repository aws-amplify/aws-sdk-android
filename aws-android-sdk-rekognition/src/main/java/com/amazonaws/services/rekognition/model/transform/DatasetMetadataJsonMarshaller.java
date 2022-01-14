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
 * JSON marshaller for POJO DatasetMetadata
 */
class DatasetMetadataJsonMarshaller {

    public void marshall(DatasetMetadata datasetMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetMetadata.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = datasetMetadata.getCreationTimestamp();
            jsonWriter.name("CreationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (datasetMetadata.getDatasetType() != null) {
            String datasetType = datasetMetadata.getDatasetType();
            jsonWriter.name("DatasetType");
            jsonWriter.value(datasetType);
        }
        if (datasetMetadata.getDatasetArn() != null) {
            String datasetArn = datasetMetadata.getDatasetArn();
            jsonWriter.name("DatasetArn");
            jsonWriter.value(datasetArn);
        }
        if (datasetMetadata.getStatus() != null) {
            String status = datasetMetadata.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (datasetMetadata.getStatusMessage() != null) {
            String statusMessage = datasetMetadata.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (datasetMetadata.getStatusMessageCode() != null) {
            String statusMessageCode = datasetMetadata.getStatusMessageCode();
            jsonWriter.name("StatusMessageCode");
            jsonWriter.value(statusMessageCode);
        }
        jsonWriter.endObject();
    }

    private static DatasetMetadataJsonMarshaller instance;

    public static DatasetMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetMetadataJsonMarshaller();
        return instance;
    }
}
