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
 * JSON marshaller for POJO Folder
 */
class FolderJsonMarshaller {

    public void marshall(Folder folder, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (folder.getTreeId() != null) {
            String treeId = folder.getTreeId();
            jsonWriter.name("treeId");
            jsonWriter.value(treeId);
        }
        if (folder.getAbsolutePath() != null) {
            String absolutePath = folder.getAbsolutePath();
            jsonWriter.name("absolutePath");
            jsonWriter.value(absolutePath);
        }
        if (folder.getRelativePath() != null) {
            String relativePath = folder.getRelativePath();
            jsonWriter.name("relativePath");
            jsonWriter.value(relativePath);
        }
        jsonWriter.endObject();
    }

    private static FolderJsonMarshaller instance;

    public static FolderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FolderJsonMarshaller();
        return instance;
    }
}
