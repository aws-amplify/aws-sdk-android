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
 * JSON unmarshaller for response DescribeLabelingJobResult
 */
public class DescribeLabelingJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeLabelingJobResult, JsonUnmarshallerContext> {

    public DescribeLabelingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeLabelingJobResult describeLabelingJobResult = new DescribeLabelingJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LabelingJobStatus")) {
                describeLabelingJobResult.setLabelingJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelCounters")) {
                describeLabelingJobResult.setLabelCounters(LabelCountersJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeLabelingJobResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeLabelingJobResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeLabelingJobResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobReferenceCode")) {
                describeLabelingJobResult.setJobReferenceCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelingJobName")) {
                describeLabelingJobResult.setLabelingJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelingJobArn")) {
                describeLabelingJobResult.setLabelingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelAttributeName")) {
                describeLabelingJobResult.setLabelAttributeName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputConfig")) {
                describeLabelingJobResult.setInputConfig(LabelingJobInputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputConfig")) {
                describeLabelingJobResult.setOutputConfig(LabelingJobOutputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                describeLabelingJobResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelCategoryConfigS3Uri")) {
                describeLabelingJobResult.setLabelCategoryConfigS3Uri(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StoppingConditions")) {
                describeLabelingJobResult
                        .setStoppingConditions(LabelingJobStoppingConditionsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LabelingJobAlgorithmsConfig")) {
                describeLabelingJobResult
                        .setLabelingJobAlgorithmsConfig(LabelingJobAlgorithmsConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("HumanTaskConfig")) {
                describeLabelingJobResult.setHumanTaskConfig(HumanTaskConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                describeLabelingJobResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LabelingJobOutput")) {
                describeLabelingJobResult.setLabelingJobOutput(LabelingJobOutputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeLabelingJobResult;
    }

    private static DescribeLabelingJobResultJsonUnmarshaller instance;

    public static DescribeLabelingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLabelingJobResultJsonUnmarshaller();
        return instance;
    }
}
