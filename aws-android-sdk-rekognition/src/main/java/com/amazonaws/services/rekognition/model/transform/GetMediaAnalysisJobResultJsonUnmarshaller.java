/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetMediaAnalysisJobResult
 */
public class GetMediaAnalysisJobResultJsonUnmarshaller implements
        Unmarshaller<GetMediaAnalysisJobResult, JsonUnmarshallerContext> {

    public GetMediaAnalysisJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMediaAnalysisJobResult getMediaAnalysisJobResult = new GetMediaAnalysisJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                getMediaAnalysisJobResult.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                getMediaAnalysisJobResult.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperationsConfig")) {
                getMediaAnalysisJobResult
                        .setOperationsConfig(MediaAnalysisOperationsConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                getMediaAnalysisJobResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureDetails")) {
                getMediaAnalysisJobResult
                        .setFailureDetails(MediaAnalysisJobFailureDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreationTimestamp")) {
                getMediaAnalysisJobResult.setCreationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionTimestamp")) {
                getMediaAnalysisJobResult.setCompletionTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Input")) {
                getMediaAnalysisJobResult.setInput(MediaAnalysisInputJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputConfig")) {
                getMediaAnalysisJobResult.setOutputConfig(MediaAnalysisOutputConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                getMediaAnalysisJobResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Results")) {
                getMediaAnalysisJobResult.setResults(MediaAnalysisResultsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestSummary")) {
                getMediaAnalysisJobResult
                        .setManifestSummary(MediaAnalysisManifestSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMediaAnalysisJobResult;
    }

    private static GetMediaAnalysisJobResultJsonUnmarshaller instance;

    public static GetMediaAnalysisJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMediaAnalysisJobResultJsonUnmarshaller();
        return instance;
    }
}
