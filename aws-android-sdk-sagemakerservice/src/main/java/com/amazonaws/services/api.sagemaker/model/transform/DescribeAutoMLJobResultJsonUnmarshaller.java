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
 * JSON unmarshaller for response DescribeAutoMLJobResult
 */
public class DescribeAutoMLJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeAutoMLJobResult, JsonUnmarshallerContext> {

    public DescribeAutoMLJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAutoMLJobResult describeAutoMLJobResult = new DescribeAutoMLJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AutoMLJobName")) {
                describeAutoMLJobResult.setAutoMLJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobArn")) {
                describeAutoMLJobResult.setAutoMLJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                describeAutoMLJobResult.setInputDataConfig(new ListUnmarshaller<AutoMLChannel>(
                        AutoMLChannelJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                describeAutoMLJobResult.setOutputDataConfig(AutoMLOutputDataConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeAutoMLJobResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobObjective")) {
                describeAutoMLJobResult.setAutoMLJobObjective(AutoMLJobObjectiveJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProblemType")) {
                describeAutoMLJobResult.setProblemType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobConfig")) {
                describeAutoMLJobResult.setAutoMLJobConfig(AutoMLJobConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeAutoMLJobResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                describeAutoMLJobResult.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeAutoMLJobResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeAutoMLJobResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BestCandidate")) {
                describeAutoMLJobResult.setBestCandidate(AutoMLCandidateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobStatus")) {
                describeAutoMLJobResult.setAutoMLJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobSecondaryStatus")) {
                describeAutoMLJobResult.setAutoMLJobSecondaryStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GenerateCandidateDefinitionsOnly")) {
                describeAutoMLJobResult.setGenerateCandidateDefinitionsOnly(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobArtifacts")) {
                describeAutoMLJobResult.setAutoMLJobArtifacts(AutoMLJobArtifactsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResolvedAttributes")) {
                describeAutoMLJobResult.setResolvedAttributes(ResolvedAttributesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAutoMLJobResult;
    }

    private static DescribeAutoMLJobResultJsonUnmarshaller instance;

    public static DescribeAutoMLJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAutoMLJobResultJsonUnmarshaller();
        return instance;
    }
}
