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
 * JSON marshaller for POJO File
 */
class FileJsonMarshaller {

    public void marshall(File file, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (file.getBlobId() != null) {
            String blobId = file.getBlobId();
            jsonWriter.name("blobId");
            jsonWriter.value(blobId);
        }
        if (file.getAbsolutePath() != null) {
            String absolutePath = file.getAbsolutePath();
            jsonWriter.name("absolutePath");
            jsonWriter.value(absolutePath);
        }
        if (file.getRelativePath() != null) {
            String relativePath = file.getRelativePath();
            jsonWriter.name("relativePath");
            jsonWriter.value(relativePath);
        }
        if (file.getFileMode() != null) {
            String fileMode = file.getFileMode();
            jsonWriter.name("fileMode");
            jsonWriter.value(fileMode);
        }
        jsonWriter.endObject();
    }

    private static FileJsonMarshaller instance;

    public static FileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileJsonMarshaller();
        return instance;
    }
}
