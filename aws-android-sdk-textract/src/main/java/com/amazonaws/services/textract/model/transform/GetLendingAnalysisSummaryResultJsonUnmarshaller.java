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
 * JSON unmarshaller for response GetLendingAnalysisSummaryResult
 */
public class GetLendingAnalysisSummaryResultJsonUnmarshaller implements
        Unmarshaller<GetLendingAnalysisSummaryResult, JsonUnmarshallerContext> {

    public GetLendingAnalysisSummaryResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetLendingAnalysisSummaryResult getLendingAnalysisSummaryResult = new GetLendingAnalysisSummaryResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DocumentMetadata")) {
                getLendingAnalysisSummaryResult
                        .setDocumentMetadata(DocumentMetadataJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                getLendingAnalysisSummaryResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Summary")) {
                getLendingAnalysisSummaryResult.setSummary(LendingSummaryJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Warnings")) {
                getLendingAnalysisSummaryResult.setWarnings(new ListUnmarshaller<Warning>(
                        WarningJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getLendingAnalysisSummaryResult.setStatusMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AnalyzeLendingModelVersion")) {
                getLendingAnalysisSummaryResult
                        .setAnalyzeLendingModelVersion(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getLendingAnalysisSummaryResult;
    }

    private static GetLendingAnalysisSummaryResultJsonUnmarshaller instance;

    public static GetLendingAnalysisSummaryResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLendingAnalysisSummaryResultJsonUnmarshaller();
        return instance;
    }
}
