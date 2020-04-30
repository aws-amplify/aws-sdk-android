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

package com.amazonaws.services.schemas.model.transform;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchSchemaVersionSummary
 */
class SearchSchemaVersionSummaryJsonMarshaller {

    public void marshall(SearchSchemaVersionSummary searchSchemaVersionSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchSchemaVersionSummary.getCreatedDate() != null) {
            java.util.Date createdDate = searchSchemaVersionSummary.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (searchSchemaVersionSummary.getSchemaVersion() != null) {
            String schemaVersion = searchSchemaVersionSummary.getSchemaVersion();
            jsonWriter.name("SchemaVersion");
            jsonWriter.value(schemaVersion);
        }
        jsonWriter.endObject();
    }

    private static SearchSchemaVersionSummaryJsonMarshaller instance;

    public static SearchSchemaVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchSchemaVersionSummaryJsonMarshaller();
        return instance;
    }
}
