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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeCompilationJobResult
 */
public class DescribeCompilationJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeCompilationJobResult, JsonUnmarshallerContext> {

    public DescribeCompilationJobResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeCompilationJobResult describeCompilationJobResult = new DescribeCompilationJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CompilationJobName")) {
                describeCompilationJobResult.setCompilationJobName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationJobArn")) {
                describeCompilationJobResult.setCompilationJobArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationJobStatus")) {
                describeCompilationJobResult.setCompilationJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationStartTime")) {
                describeCompilationJobResult.setCompilationStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompilationEndTime")) {
                describeCompilationJobResult.setCompilationEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StoppingCondition")) {
                describeCompilationJobResult.setStoppingCondition(StoppingConditionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeCompilationJobResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeCompilationJobResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeCompilationJobResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelArtifacts")) {
                describeCompilationJobResult.setModelArtifacts(ModelArtifactsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeCompilationJobResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputConfig")) {
                describeCompilationJobResult.setInputConfig(InputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputConfig")) {
                describeCompilationJobResult.setOutputConfig(OutputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeCompilationJobResult;
    }

    private static DescribeCompilationJobResultJsonUnmarshaller instance;

    public static DescribeCompilationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCompilationJobResultJsonUnmarshaller();
        return instance;
    }
}
