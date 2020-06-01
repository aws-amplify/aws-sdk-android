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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeleteFileSystemWindowsResponse
 */
class DeleteFileSystemWindowsResponseJsonMarshaller {

    public void marshall(DeleteFileSystemWindowsResponse deleteFileSystemWindowsResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deleteFileSystemWindowsResponse.getFinalBackupId() != null) {
            String finalBackupId = deleteFileSystemWindowsResponse.getFinalBackupId();
            jsonWriter.name("FinalBackupId");
            jsonWriter.value(finalBackupId);
        }
        if (deleteFileSystemWindowsResponse.getFinalBackupTags() != null) {
            java.util.List<Tag> finalBackupTags = deleteFileSystemWindowsResponse
                    .getFinalBackupTags();
            jsonWriter.name("FinalBackupTags");
            jsonWriter.beginArray();
            for (Tag finalBackupTagsItem : finalBackupTags) {
                if (finalBackupTagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(finalBackupTagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DeleteFileSystemWindowsResponseJsonMarshaller instance;

    public static DeleteFileSystemWindowsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteFileSystemWindowsResponseJsonMarshaller();
        return instance;
    }
}
