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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LabelingJobSummary
 */
class LabelingJobSummaryJsonUnmarshaller implements
        Unmarshaller<LabelingJobSummary, JsonUnmarshallerContext> {

    public LabelingJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LabelingJobSummary labelingJobSummary = new LabelingJobSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LabelingJobName")) {
                labelingJobSummary.setLabelingJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelingJobArn")) {
                labelingJobSummary.setLabelingJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                labelingJobSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                labelingJobSummary.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelingJobStatus")) {
                labelingJobSummary.setLabelingJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelCounters")) {
                labelingJobSummary.setLabelCounters(LabelCountersJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkteamArn")) {
                labelingJobSummary.setWorkteamArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreHumanTaskLambdaArn")) {
                labelingJobSummary.setPreHumanTaskLambdaArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AnnotationConsolidationLambdaArn")) {
                labelingJobSummary.setAnnotationConsolidationLambdaArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                labelingJobSummary.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelingJobOutput")) {
                labelingJobSummary.setLabelingJobOutput(LabelingJobOutputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputConfig")) {
                labelingJobSummary.setInputConfig(LabelingJobInputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return labelingJobSummary;
    }

    private static LabelingJobSummaryJsonUnmarshaller instance;

    public static LabelingJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobSummaryJsonUnmarshaller();
        return instance;
    }
}
