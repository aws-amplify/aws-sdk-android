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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Dataset
 */
class DatasetJsonMarshaller {

    public void marshall(Dataset dataset, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataset.getName() != null) {
            String name = dataset.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (dataset.getDatasetArn() != null) {
            String datasetArn = dataset.getDatasetArn();
            jsonWriter.name("datasetArn");
            jsonWriter.value(datasetArn);
        }
        if (dataset.getDatasetGroupArn() != null) {
            String datasetGroupArn = dataset.getDatasetGroupArn();
            jsonWriter.name("datasetGroupArn");
            jsonWriter.value(datasetGroupArn);
        }
        if (dataset.getDatasetType() != null) {
            String datasetType = dataset.getDatasetType();
            jsonWriter.name("datasetType");
            jsonWriter.value(datasetType);
        }
        if (dataset.getSchemaArn() != null) {
            String schemaArn = dataset.getSchemaArn();
            jsonWriter.name("schemaArn");
            jsonWriter.value(schemaArn);
        }
        if (dataset.getStatus() != null) {
            String status = dataset.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (dataset.getCreationDateTime() != null) {
            java.util.Date creationDateTime = dataset.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (dataset.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = dataset.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static DatasetJsonMarshaller instance;

    public static DatasetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetJsonMarshaller();
        return instance;
    }
}
