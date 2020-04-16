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
 * JSON unmarshaller for response GetMLTransformResult
 */
public class GetMLTransformResultJsonUnmarshaller implements
        Unmarshaller<GetMLTransformResult, JsonUnmarshallerContext> {

    public GetMLTransformResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMLTransformResult getMLTransformResult = new GetMLTransformResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransformId")) {
                getMLTransformResult.setTransformId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                getMLTransformResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getMLTransformResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                getMLTransformResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedOn")) {
                getMLTransformResult.setCreatedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedOn")) {
                getMLTransformResult.setLastModifiedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputRecordTables")) {
                getMLTransformResult.setInputRecordTables(new ListUnmarshaller<GlueTable>(
                        GlueTableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Parameters")) {
                getMLTransformResult.setParameters(TransformParametersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationMetrics")) {
                getMLTransformResult.setEvaluationMetrics(EvaluationMetricsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelCount")) {
                getMLTransformResult.setLabelCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schema")) {
                getMLTransformResult.setSchema(new ListUnmarshaller<SchemaColumn>(
                        SchemaColumnJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Role")) {
                getMLTransformResult.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlueVersion")) {
                getMLTransformResult.setGlueVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxCapacity")) {
                getMLTransformResult.setMaxCapacity(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkerType")) {
                getMLTransformResult.setWorkerType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfWorkers")) {
                getMLTransformResult.setNumberOfWorkers(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timeout")) {
                getMLTransformResult.setTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxRetries")) {
                getMLTransformResult.setMaxRetries(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMLTransformResult;
    }

    private static GetMLTransformResultJsonUnmarshaller instance;

    public static GetMLTransformResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMLTransformResultJsonUnmarshaller();
        return instance;
    }
}
