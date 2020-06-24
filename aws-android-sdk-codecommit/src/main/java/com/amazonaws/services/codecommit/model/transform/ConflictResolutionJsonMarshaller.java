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
 * JSON marshaller for POJO ConflictResolution
 */
class ConflictResolutionJsonMarshaller {

    public void marshall(ConflictResolution conflictResolution, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (conflictResolution.getReplaceContents() != null) {
            java.util.List<ReplaceContentEntry> replaceContents = conflictResolution
                    .getReplaceContents();
            jsonWriter.name("replaceContents");
            jsonWriter.beginArray();
            for (ReplaceContentEntry replaceContentsItem : replaceContents) {
                if (replaceContentsItem != null) {
                    ReplaceContentEntryJsonMarshaller.getInstance().marshall(replaceContentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (conflictResolution.getDeleteFiles() != null) {
            java.util.List<DeleteFileEntry> deleteFiles = conflictResolution.getDeleteFiles();
            jsonWriter.name("deleteFiles");
            jsonWriter.beginArray();
            for (DeleteFileEntry deleteFilesItem : deleteFiles) {
                if (deleteFilesItem != null) {
                    DeleteFileEntryJsonMarshaller.getInstance().marshall(deleteFilesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (conflictResolution.getSetFileModes() != null) {
            java.util.List<SetFileModeEntry> setFileModes = conflictResolution.getSetFileModes();
            jsonWriter.name("setFileModes");
            jsonWriter.beginArray();
            for (SetFileModeEntry setFileModesItem : setFileModes) {
                if (setFileModesItem != null) {
                    SetFileModeEntryJsonMarshaller.getInstance().marshall(setFileModesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ConflictResolutionJsonMarshaller instance;

    public static ConflictResolutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConflictResolutionJsonMarshaller();
        return instance;
    }
}
