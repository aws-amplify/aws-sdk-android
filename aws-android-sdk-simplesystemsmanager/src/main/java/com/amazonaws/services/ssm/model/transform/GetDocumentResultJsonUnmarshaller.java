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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetDocumentResult
 */
public class GetDocumentResultJsonUnmarshaller implements
        Unmarshaller<GetDocumentResult, JsonUnmarshallerContext> {

    public GetDocumentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDocumentResult getDocumentResult = new GetDocumentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                getDocumentResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionName")) {
                getDocumentResult.setVersionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                getDocumentResult.setDocumentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                getDocumentResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusInformation")) {
                getDocumentResult.setStatusInformation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Content")) {
                getDocumentResult.setContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentType")) {
                getDocumentResult.setDocumentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentFormat")) {
                getDocumentResult.setDocumentFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Requires")) {
                getDocumentResult.setRequires(new ListUnmarshaller<DocumentRequires>(
                        DocumentRequiresJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AttachmentsContent")) {
                getDocumentResult.setAttachmentsContent(new ListUnmarshaller<AttachmentContent>(
                        AttachmentContentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDocumentResult;
    }

    private static GetDocumentResultJsonUnmarshaller instance;

    public static GetDocumentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDocumentResultJsonUnmarshaller();
        return instance;
    }
}
