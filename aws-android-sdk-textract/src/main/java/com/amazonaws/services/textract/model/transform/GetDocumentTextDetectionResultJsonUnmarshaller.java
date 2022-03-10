/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response GetDocumentTextDetectionResult
 */
public class GetDocumentTextDetectionResultJsonUnmarshaller implements
        Unmarshaller<GetDocumentTextDetectionResult, JsonUnmarshallerContext> {

    public GetDocumentTextDetectionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetDocumentTextDetectionResult getDocumentTextDetectionResult = new GetDocumentTextDetectionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DocumentMetadata")) {
                getDocumentTextDetectionResult.setDocumentMetadata(DocumentMetadataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                getDocumentTextDetectionResult.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getDocumentTextDetectionResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Blocks")) {
                getDocumentTextDetectionResult.setBlocks(new ListUnmarshaller<Block>(
                        BlockJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Warnings")) {
                getDocumentTextDetectionResult.setWarnings(new ListUnmarshaller<Warning>(
                        WarningJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getDocumentTextDetectionResult.setStatusMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DetectDocumentTextModelVersion")) {
                getDocumentTextDetectionResult
                        .setDetectDocumentTextModelVersion(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDocumentTextDetectionResult;
    }

    private static GetDocumentTextDetectionResultJsonUnmarshaller instance;

    public static GetDocumentTextDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDocumentTextDetectionResultJsonUnmarshaller();
        return instance;
    }
}
