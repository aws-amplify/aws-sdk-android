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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO DocumentVersionInfo
 */
class DocumentVersionInfoJsonUnmarshaller implements Unmarshaller<DocumentVersionInfo, JsonUnmarshallerContext> {

    public DocumentVersionInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DocumentVersionInfo documentVersionInfo = new DocumentVersionInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                documentVersionInfo.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                documentVersionInfo.setDocumentVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("VersionName")) {
                documentVersionInfo.setVersionName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                documentVersionInfo.setCreatedDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("IsDefaultVersion")) {
                documentVersionInfo.setIsDefaultVersion(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentFormat")) {
                documentVersionInfo.setDocumentFormat(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Status")) {
                documentVersionInfo.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StatusInformation")) {
                documentVersionInfo.setStatusInformation(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return documentVersionInfo;
    }

    private static DocumentVersionInfoJsonUnmarshaller instance;
    public static DocumentVersionInfoJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DocumentVersionInfoJsonUnmarshaller();
        return instance;
    }
}
