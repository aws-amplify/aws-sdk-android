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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response StartAttachedFileUploadResult
 */
public class StartAttachedFileUploadResultJsonUnmarshaller implements
        Unmarshaller<StartAttachedFileUploadResult, JsonUnmarshallerContext> {

    public StartAttachedFileUploadResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        StartAttachedFileUploadResult startAttachedFileUploadResult = new StartAttachedFileUploadResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FileArn")) {
                startAttachedFileUploadResult.setFileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileId")) {
                startAttachedFileUploadResult.setFileId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                startAttachedFileUploadResult.setCreationTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileStatus")) {
                startAttachedFileUploadResult.setFileStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                startAttachedFileUploadResult.setCreatedBy(CreatedByInfoJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UploadUrlMetadata")) {
                startAttachedFileUploadResult
                        .setUploadUrlMetadata(UploadUrlMetadataJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startAttachedFileUploadResult;
    }

    private static StartAttachedFileUploadResultJsonUnmarshaller instance;

    public static StartAttachedFileUploadResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartAttachedFileUploadResultJsonUnmarshaller();
        return instance;
    }
}
