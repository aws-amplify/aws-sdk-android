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
 * JSON marshaller for POJO SchemaSummary
 */
class SchemaSummaryJsonMarshaller {

    public void marshall(SchemaSummary schemaSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (schemaSummary.getLastModified() != null) {
            java.util.Date lastModified = schemaSummary.getLastModified();
            jsonWriter.name("LastModified");
            jsonWriter.value(lastModified);
        }
        if (schemaSummary.getSchemaArn() != null) {
            String schemaArn = schemaSummary.getSchemaArn();
            jsonWriter.name("SchemaArn");
            jsonWriter.value(schemaArn);
        }
        if (schemaSummary.getSchemaName() != null) {
            String schemaName = schemaSummary.getSchemaName();
            jsonWriter.name("SchemaName");
            jsonWriter.value(schemaName);
        }
        if (schemaSummary.getTags() != null) {
            java.util.Map<String, String> tags = schemaSummary.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (schemaSummary.getVersionCount() != null) {
            Long versionCount = schemaSummary.getVersionCount();
            jsonWriter.name("VersionCount");
            jsonWriter.value(versionCount);
        }
        jsonWriter.endObject();
    }

    private static SchemaSummaryJsonMarshaller instance;

    public static SchemaSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SchemaSummaryJsonMarshaller();
        return instance;
    }
}
