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
 * JSON unmarshaller for response DescribeTransformJobResult
 */
public class DescribeTransformJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeTransformJobResult, JsonUnmarshallerContext> {

    public DescribeTransformJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTransformJobResult describeTransformJobResult = new DescribeTransformJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransformJobName")) {
                describeTransformJobResult.setTransformJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransformJobArn")) {
                describeTransformJobResult.setTransformJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransformJobStatus")) {
                describeTransformJobResult.setTransformJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeTransformJobResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelName")) {
                describeTransformJobResult.setModelName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrentTransforms")) {
                describeTransformJobResult.setMaxConcurrentTransforms(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxPayloadInMB")) {
                describeTransformJobResult.setMaxPayloadInMB(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BatchStrategy")) {
                describeTransformJobResult.setBatchStrategy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Environment")) {
                describeTransformJobResult.setEnvironment(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TransformInput")) {
                describeTransformJobResult.setTransformInput(TransformInputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransformOutput")) {
                describeTransformJobResult.setTransformOutput(TransformOutputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransformResources")) {
                describeTransformJobResult.setTransformResources(TransformResourcesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeTransformJobResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransformStartTime")) {
                describeTransformJobResult.setTransformStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransformEndTime")) {
                describeTransformJobResult.setTransformEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelingJobArn")) {
                describeTransformJobResult.setLabelingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobArn")) {
                describeTransformJobResult.setAutoMLJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataProcessing")) {
                describeTransformJobResult.setDataProcessing(DataProcessingJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExperimentConfig")) {
                describeTransformJobResult.setExperimentConfig(ExperimentConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeTransformJobResult;
    }

    private static DescribeTransformJobResultJsonUnmarshaller instance;

    public static DescribeTransformJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTransformJobResultJsonUnmarshaller();
        return instance;
    }
}
