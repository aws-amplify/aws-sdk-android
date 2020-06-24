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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConflictMetadata
 */
class ConflictMetadataJsonMarshaller {

    public void marshall(ConflictMetadata conflictMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (conflictMetadata.getFilePath() != null) {
            String filePath = conflictMetadata.getFilePath();
            jsonWriter.name("filePath");
            jsonWriter.value(filePath);
        }
        if (conflictMetadata.getFileSizes() != null) {
            FileSizes fileSizes = conflictMetadata.getFileSizes();
            jsonWriter.name("fileSizes");
            FileSizesJsonMarshaller.getInstance().marshall(fileSizes, jsonWriter);
        }
        if (conflictMetadata.getFileModes() != null) {
            FileModes fileModes = conflictMetadata.getFileModes();
            jsonWriter.name("fileModes");
            FileModesJsonMarshaller.getInstance().marshall(fileModes, jsonWriter);
        }
        if (conflictMetadata.getObjectTypes() != null) {
            ObjectTypes objectTypes = conflictMetadata.getObjectTypes();
            jsonWriter.name("objectTypes");
            ObjectTypesJsonMarshaller.getInstance().marshall(objectTypes, jsonWriter);
        }
        if (conflictMetadata.getNumberOfConflicts() != null) {
            Integer numberOfConflicts = conflictMetadata.getNumberOfConflicts();
            jsonWriter.name("numberOfConflicts");
            jsonWriter.value(numberOfConflicts);
        }
        if (conflictMetadata.getIsBinaryFile() != null) {
            IsBinaryFile isBinaryFile = conflictMetadata.getIsBinaryFile();
            jsonWriter.name("isBinaryFile");
            IsBinaryFileJsonMarshaller.getInstance().marshall(isBinaryFile, jsonWriter);
        }
        if (conflictMetadata.getContentConflict() != null) {
            Boolean contentConflict = conflictMetadata.getContentConflict();
            jsonWriter.name("contentConflict");
            jsonWriter.value(contentConflict);
        }
        if (conflictMetadata.getFileModeConflict() != null) {
            Boolean fileModeConflict = conflictMetadata.getFileModeConflict();
            jsonWriter.name("fileModeConflict");
            jsonWriter.value(fileModeConflict);
        }
        if (conflictMetadata.getObjectTypeConflict() != null) {
            Boolean objectTypeConflict = conflictMetadata.getObjectTypeConflict();
            jsonWriter.name("objectTypeConflict");
            jsonWriter.value(objectTypeConflict);
        }
        if (conflictMetadata.getMergeOperations() != null) {
            MergeOperations mergeOperations = conflictMetadata.getMergeOperations();
            jsonWriter.name("mergeOperations");
            MergeOperationsJsonMarshaller.getInstance().marshall(mergeOperations, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ConflictMetadataJsonMarshaller instance;

    public static ConflictMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConflictMetadataJsonMarshaller();
        return instance;
    }
}
