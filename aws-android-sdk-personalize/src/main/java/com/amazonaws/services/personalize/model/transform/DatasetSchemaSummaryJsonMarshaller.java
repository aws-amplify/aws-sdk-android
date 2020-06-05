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
 * JSON marshaller for POJO DatasetSchemaSummary
 */
class DatasetSchemaSummaryJsonMarshaller {

    public void marshall(DatasetSchemaSummary datasetSchemaSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetSchemaSummary.getName() != null) {
            String name = datasetSchemaSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (datasetSchemaSummary.getSchemaArn() != null) {
            String schemaArn = datasetSchemaSummary.getSchemaArn();
            jsonWriter.name("schemaArn");
            jsonWriter.value(schemaArn);
        }
        if (datasetSchemaSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = datasetSchemaSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (datasetSchemaSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = datasetSchemaSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static DatasetSchemaSummaryJsonMarshaller instance;

    public static DatasetSchemaSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetSchemaSummaryJsonMarshaller();
        return instance;
    }
}
