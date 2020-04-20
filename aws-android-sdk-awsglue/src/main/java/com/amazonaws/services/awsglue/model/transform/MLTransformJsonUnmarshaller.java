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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MLTransform
 */
class MLTransformJsonUnmarshaller implements Unmarshaller<MLTransform, JsonUnmarshallerContext> {

    public MLTransform unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MLTransform mLTransform = new MLTransform();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransformId")) {
                mLTransform.setTransformId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                mLTransform.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                mLTransform.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                mLTransform.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedOn")) {
                mLTransform.setCreatedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedOn")) {
                mLTransform.setLastModifiedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputRecordTables")) {
                mLTransform.setInputRecordTables(new ListUnmarshaller<GlueTable>(
                        GlueTableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Parameters")) {
                mLTransform.setParameters(TransformParametersJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationMetrics")) {
                mLTransform.setEvaluationMetrics(EvaluationMetricsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelCount")) {
                mLTransform.setLabelCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schema")) {
                mLTransform.setSchema(new ListUnmarshaller<SchemaColumn>(
                        SchemaColumnJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Role")) {
                mLTransform.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlueVersion")) {
                mLTransform.setGlueVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxCapacity")) {
                mLTransform.setMaxCapacity(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkerType")) {
                mLTransform.setWorkerType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfWorkers")) {
                mLTransform.setNumberOfWorkers(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timeout")) {
                mLTransform.setTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxRetries")) {
                mLTransform.setMaxRetries(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mLTransform;
    }

    private static MLTransformJsonUnmarshaller instance;

    public static MLTransformJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MLTransformJsonUnmarshaller();
        return instance;
    }
}
