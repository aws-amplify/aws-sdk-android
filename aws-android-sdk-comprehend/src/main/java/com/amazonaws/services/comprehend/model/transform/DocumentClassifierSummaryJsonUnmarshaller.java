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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DocumentClassifierSummary
 */
class DocumentClassifierSummaryJsonUnmarshaller implements
        Unmarshaller<DocumentClassifierSummary, JsonUnmarshallerContext> {

    public DocumentClassifierSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DocumentClassifierSummary documentClassifierSummary = new DocumentClassifierSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DocumentClassifierName")) {
                documentClassifierSummary.setDocumentClassifierName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfVersions")) {
                documentClassifierSummary.setNumberOfVersions(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestVersionCreatedAt")) {
                documentClassifierSummary.setLatestVersionCreatedAt(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestVersionName")) {
                documentClassifierSummary.setLatestVersionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LatestVersionStatus")) {
                documentClassifierSummary.setLatestVersionStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return documentClassifierSummary;
    }

    private static DocumentClassifierSummaryJsonUnmarshaller instance;

    public static DocumentClassifierSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassifierSummaryJsonUnmarshaller();
        return instance;
    }
}
