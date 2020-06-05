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
 * JSON marshaller for POJO DatasetSchema
 */
class DatasetSchemaJsonMarshaller {

    public void marshall(DatasetSchema datasetSchema, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (datasetSchema.getName() != null) {
            String name = datasetSchema.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (datasetSchema.getSchemaArn() != null) {
            String schemaArn = datasetSchema.getSchemaArn();
            jsonWriter.name("schemaArn");
            jsonWriter.value(schemaArn);
        }
        if (datasetSchema.getSchema() != null) {
            String schema = datasetSchema.getSchema();
            jsonWriter.name("schema");
            jsonWriter.value(schema);
        }
        if (datasetSchema.getCreationDateTime() != null) {
            java.util.Date creationDateTime = datasetSchema.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (datasetSchema.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = datasetSchema.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static DatasetSchemaJsonMarshaller instance;

    public static DatasetSchemaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetSchemaJsonMarshaller();
        return instance;
    }
}
