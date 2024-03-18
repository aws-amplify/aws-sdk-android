/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO MediaAnalysisJobDescription
 */
class MediaAnalysisJobDescriptionJsonUnmarshaller implements
        Unmarshaller<MediaAnalysisJobDescription, JsonUnmarshallerContext> {

    public MediaAnalysisJobDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MediaAnalysisJobDescription mediaAnalysisJobDescription = new MediaAnalysisJobDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                mediaAnalysisJobDescription.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                mediaAnalysisJobDescription.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OperationsConfig")) {
                mediaAnalysisJobDescription
                        .setOperationsConfig(MediaAnalysisOperationsConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                mediaAnalysisJobDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureDetails")) {
                mediaAnalysisJobDescription
                        .setFailureDetails(MediaAnalysisJobFailureDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreationTimestamp")) {
                mediaAnalysisJobDescription.setCreationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionTimestamp")) {
                mediaAnalysisJobDescription.setCompletionTimestamp(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Input")) {
                mediaAnalysisJobDescription.setInput(MediaAnalysisInputJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputConfig")) {
                mediaAnalysisJobDescription
                        .setOutputConfig(MediaAnalysisOutputConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                mediaAnalysisJobDescription.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Results")) {
                mediaAnalysisJobDescription.setResults(MediaAnalysisResultsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestSummary")) {
                mediaAnalysisJobDescription
                        .setManifestSummary(MediaAnalysisManifestSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mediaAnalysisJobDescription;
    }

    private static MediaAnalysisJobDescriptionJsonUnmarshaller instance;

    public static MediaAnalysisJobDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MediaAnalysisJobDescriptionJsonUnmarshaller();
        return instance;
    }
}
