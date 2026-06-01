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
 * JSON unmarshaller for POJO AttachedFile
 */
class AttachedFileJsonUnmarshaller implements Unmarshaller<AttachedFile, JsonUnmarshallerContext> {

    public AttachedFile unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AttachedFile attachedFile = new AttachedFile();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreationTime")) {
                attachedFile.setCreationTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileArn")) {
                attachedFile.setFileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileId")) {
                attachedFile.setFileId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileName")) {
                attachedFile.setFileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSizeInBytes")) {
                attachedFile.setFileSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileStatus")) {
                attachedFile.setFileStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                attachedFile.setCreatedBy(CreatedByInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileUseCaseType")) {
                attachedFile.setFileUseCaseType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociatedResourceArn")) {
                attachedFile.setAssociatedResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                attachedFile.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return attachedFile;
    }

    private static AttachedFileJsonUnmarshaller instance;

    public static AttachedFileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttachedFileJsonUnmarshaller();
        return instance;
    }
}
