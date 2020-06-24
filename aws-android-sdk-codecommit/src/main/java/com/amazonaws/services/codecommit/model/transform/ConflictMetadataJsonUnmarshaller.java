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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ConflictMetadata
 */
class ConflictMetadataJsonUnmarshaller implements
        Unmarshaller<ConflictMetadata, JsonUnmarshallerContext> {

    public ConflictMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ConflictMetadata conflictMetadata = new ConflictMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("filePath")) {
                conflictMetadata.setFilePath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fileSizes")) {
                conflictMetadata.setFileSizes(FileSizesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fileModes")) {
                conflictMetadata.setFileModes(FileModesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("objectTypes")) {
                conflictMetadata.setObjectTypes(ObjectTypesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfConflicts")) {
                conflictMetadata.setNumberOfConflicts(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isBinaryFile")) {
                conflictMetadata.setIsBinaryFile(IsBinaryFileJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("contentConflict")) {
                conflictMetadata.setContentConflict(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fileModeConflict")) {
                conflictMetadata.setFileModeConflict(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("objectTypeConflict")) {
                conflictMetadata.setObjectTypeConflict(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("mergeOperations")) {
                conflictMetadata.setMergeOperations(MergeOperationsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return conflictMetadata;
    }

    private static ConflictMetadataJsonUnmarshaller instance;

    public static ConflictMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConflictMetadataJsonUnmarshaller();
        return instance;
    }
}
