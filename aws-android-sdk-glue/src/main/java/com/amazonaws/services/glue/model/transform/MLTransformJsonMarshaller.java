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
 * JSON marshaller for POJO MLTransform
 */
class MLTransformJsonMarshaller {

    public void marshall(MLTransform mLTransform, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mLTransform.getTransformId() != null) {
            String transformId = mLTransform.getTransformId();
            jsonWriter.name("TransformId");
            jsonWriter.value(transformId);
        }
        if (mLTransform.getName() != null) {
            String name = mLTransform.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (mLTransform.getDescription() != null) {
            String description = mLTransform.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (mLTransform.getStatus() != null) {
            String status = mLTransform.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (mLTransform.getCreatedOn() != null) {
            java.util.Date createdOn = mLTransform.getCreatedOn();
            jsonWriter.name("CreatedOn");
            jsonWriter.value(createdOn);
        }
        if (mLTransform.getLastModifiedOn() != null) {
            java.util.Date lastModifiedOn = mLTransform.getLastModifiedOn();
            jsonWriter.name("LastModifiedOn");
            jsonWriter.value(lastModifiedOn);
        }
        if (mLTransform.getInputRecordTables() != null) {
            java.util.List<GlueTable> inputRecordTables = mLTransform.getInputRecordTables();
            jsonWriter.name("InputRecordTables");
            jsonWriter.beginArray();
            for (GlueTable inputRecordTablesItem : inputRecordTables) {
                if (inputRecordTablesItem != null) {
                    GlueTableJsonMarshaller.getInstance().marshall(inputRecordTablesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (mLTransform.getParameters() != null) {
            TransformParameters parameters = mLTransform.getParameters();
            jsonWriter.name("Parameters");
            TransformParametersJsonMarshaller.getInstance().marshall(parameters, jsonWriter);
        }
        if (mLTransform.getEvaluationMetrics() != null) {
            EvaluationMetrics evaluationMetrics = mLTransform.getEvaluationMetrics();
            jsonWriter.name("EvaluationMetrics");
            EvaluationMetricsJsonMarshaller.getInstance().marshall(evaluationMetrics, jsonWriter);
        }
        if (mLTransform.getLabelCount() != null) {
            Integer labelCount = mLTransform.getLabelCount();
            jsonWriter.name("LabelCount");
            jsonWriter.value(labelCount);
        }
        if (mLTransform.getSchema() != null) {
            java.util.List<SchemaColumn> schema = mLTransform.getSchema();
            jsonWriter.name("Schema");
            jsonWriter.beginArray();
            for (SchemaColumn schemaItem : schema) {
                if (schemaItem != null) {
                    SchemaColumnJsonMarshaller.getInstance().marshall(schemaItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (mLTransform.getRole() != null) {
            String role = mLTransform.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (mLTransform.getGlueVersion() != null) {
            String glueVersion = mLTransform.getGlueVersion();
            jsonWriter.name("GlueVersion");
            jsonWriter.value(glueVersion);
        }
        if (mLTransform.getMaxCapacity() != null) {
            Double maxCapacity = mLTransform.getMaxCapacity();
            jsonWriter.name("MaxCapacity");
            jsonWriter.value(maxCapacity);
        }
        if (mLTransform.getWorkerType() != null) {
            String workerType = mLTransform.getWorkerType();
            jsonWriter.name("WorkerType");
            jsonWriter.value(workerType);
        }
        if (mLTransform.getNumberOfWorkers() != null) {
            Integer numberOfWorkers = mLTransform.getNumberOfWorkers();
            jsonWriter.name("NumberOfWorkers");
            jsonWriter.value(numberOfWorkers);
        }
        if (mLTransform.getTimeout() != null) {
            Integer timeout = mLTransform.getTimeout();
            jsonWriter.name("Timeout");
            jsonWriter.value(timeout);
        }
        if (mLTransform.getMaxRetries() != null) {
            Integer maxRetries = mLTransform.getMaxRetries();
            jsonWriter.name("MaxRetries");
            jsonWriter.value(maxRetries);
        }
        jsonWriter.endObject();
    }

    private static MLTransformJsonMarshaller instance;

    public static MLTransformJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MLTransformJsonMarshaller();
        return instance;
    }
}
