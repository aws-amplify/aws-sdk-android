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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TransformFilterCriteria
 */
class TransformFilterCriteriaJsonMarshaller {

    public void marshall(TransformFilterCriteria transformFilterCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transformFilterCriteria.getName() != null) {
            String name = transformFilterCriteria.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (transformFilterCriteria.getTransformType() != null) {
            String transformType = transformFilterCriteria.getTransformType();
            jsonWriter.name("TransformType");
            jsonWriter.value(transformType);
        }
        if (transformFilterCriteria.getStatus() != null) {
            String status = transformFilterCriteria.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (transformFilterCriteria.getGlueVersion() != null) {
            String glueVersion = transformFilterCriteria.getGlueVersion();
            jsonWriter.name("GlueVersion");
            jsonWriter.value(glueVersion);
        }
        if (transformFilterCriteria.getCreatedBefore() != null) {
            java.util.Date createdBefore = transformFilterCriteria.getCreatedBefore();
            jsonWriter.name("CreatedBefore");
            jsonWriter.value(createdBefore);
        }
        if (transformFilterCriteria.getCreatedAfter() != null) {
            java.util.Date createdAfter = transformFilterCriteria.getCreatedAfter();
            jsonWriter.name("CreatedAfter");
            jsonWriter.value(createdAfter);
        }
        if (transformFilterCriteria.getLastModifiedBefore() != null) {
            java.util.Date lastModifiedBefore = transformFilterCriteria.getLastModifiedBefore();
            jsonWriter.name("LastModifiedBefore");
            jsonWriter.value(lastModifiedBefore);
        }
        if (transformFilterCriteria.getLastModifiedAfter() != null) {
            java.util.Date lastModifiedAfter = transformFilterCriteria.getLastModifiedAfter();
            jsonWriter.name("LastModifiedAfter");
            jsonWriter.value(lastModifiedAfter);
        }
        if (transformFilterCriteria.getSchema() != null) {
            java.util.List<SchemaColumn> schema = transformFilterCriteria.getSchema();
            jsonWriter.name("Schema");
            jsonWriter.beginArray();
            for (SchemaColumn schemaItem : schema) {
                if (schemaItem != null) {
                    SchemaColumnJsonMarshaller.getInstance().marshall(schemaItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TransformFilterCriteriaJsonMarshaller instance;

    public static TransformFilterCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransformFilterCriteriaJsonMarshaller();
        return instance;
    }
}
