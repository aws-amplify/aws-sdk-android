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
 * JSON marshaller for POJO PutFileEntry
 */
class PutFileEntryJsonMarshaller {

    public void marshall(PutFileEntry putFileEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (putFileEntry.getFilePath() != null) {
            String filePath = putFileEntry.getFilePath();
            jsonWriter.name("filePath");
            jsonWriter.value(filePath);
        }
        if (putFileEntry.getFileMode() != null) {
            String fileMode = putFileEntry.getFileMode();
            jsonWriter.name("fileMode");
            jsonWriter.value(fileMode);
        }
        if (putFileEntry.getFileContent() != null) {
            java.nio.ByteBuffer fileContent = putFileEntry.getFileContent();
            jsonWriter.name("fileContent");
            jsonWriter.value(fileContent);
        }
        if (putFileEntry.getSourceFile() != null) {
            SourceFileSpecifier sourceFile = putFileEntry.getSourceFile();
            jsonWriter.name("sourceFile");
            SourceFileSpecifierJsonMarshaller.getInstance().marshall(sourceFile, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PutFileEntryJsonMarshaller instance;

    public static PutFileEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutFileEntryJsonMarshaller();
        return instance;
    }
}
