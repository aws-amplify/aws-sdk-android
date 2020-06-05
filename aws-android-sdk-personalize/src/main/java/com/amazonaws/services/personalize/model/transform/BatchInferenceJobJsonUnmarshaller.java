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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BatchInferenceJob
 */
class BatchInferenceJobJsonUnmarshaller implements
        Unmarshaller<BatchInferenceJob, JsonUnmarshallerContext> {

    public BatchInferenceJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BatchInferenceJob batchInferenceJob = new BatchInferenceJob();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("jobName")) {
                batchInferenceJob.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("batchInferenceJobArn")) {
                batchInferenceJob.setBatchInferenceJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("filterArn")) {
                batchInferenceJob.setFilterArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("failureReason")) {
                batchInferenceJob.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("solutionVersionArn")) {
                batchInferenceJob.setSolutionVersionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numResults")) {
                batchInferenceJob.setNumResults(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jobInput")) {
                batchInferenceJob.setJobInput(BatchInferenceJobInputJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jobOutput")) {
                batchInferenceJob.setJobOutput(BatchInferenceJobOutputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                batchInferenceJob.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                batchInferenceJob.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDateTime")) {
                batchInferenceJob.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDateTime")) {
                batchInferenceJob.setLastUpdatedDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return batchInferenceJob;
    }

    private static BatchInferenceJobJsonUnmarshaller instance;

    public static BatchInferenceJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchInferenceJobJsonUnmarshaller();
        return instance;
    }
}
