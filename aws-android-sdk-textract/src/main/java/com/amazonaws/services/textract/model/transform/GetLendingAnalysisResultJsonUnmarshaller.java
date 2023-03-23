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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetLendingAnalysisResult
 */
public class GetLendingAnalysisResultJsonUnmarshaller implements
        Unmarshaller<GetLendingAnalysisResult, JsonUnmarshallerContext> {

    public GetLendingAnalysisResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLendingAnalysisResult getLendingAnalysisResult = new GetLendingAnalysisResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DocumentMetadata")) {
                getLendingAnalysisResult.setDocumentMetadata(DocumentMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                getLendingAnalysisResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getLendingAnalysisResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Results")) {
                getLendingAnalysisResult.setResults(new ListUnmarshaller<LendingResult>(
                        LendingResultJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Warnings")) {
                getLendingAnalysisResult.setWarnings(new ListUnmarshaller<Warning>(
                        WarningJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getLendingAnalysisResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AnalyzeLendingModelVersion")) {
                getLendingAnalysisResult.setAnalyzeLendingModelVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getLendingAnalysisResult;
    }

    private static GetLendingAnalysisResultJsonUnmarshaller instance;

    public static GetLendingAnalysisResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLendingAnalysisResultJsonUnmarshaller();
        return instance;
    }
}
