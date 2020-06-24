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
 * JSON marshaller for POJO ReplaceContentEntry
 */
class ReplaceContentEntryJsonMarshaller {

    public void marshall(ReplaceContentEntry replaceContentEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replaceContentEntry.getFilePath() != null) {
            String filePath = replaceContentEntry.getFilePath();
            jsonWriter.name("filePath");
            jsonWriter.value(filePath);
        }
        if (replaceContentEntry.getReplacementType() != null) {
            String replacementType = replaceContentEntry.getReplacementType();
            jsonWriter.name("replacementType");
            jsonWriter.value(replacementType);
        }
        if (replaceContentEntry.getContent() != null) {
            java.nio.ByteBuffer content = replaceContentEntry.getContent();
            jsonWriter.name("content");
            jsonWriter.value(content);
        }
        if (replaceContentEntry.getFileMode() != null) {
            String fileMode = replaceContentEntry.getFileMode();
            jsonWriter.name("fileMode");
            jsonWriter.value(fileMode);
        }
        jsonWriter.endObject();
    }

    private static ReplaceContentEntryJsonMarshaller instance;

    public static ReplaceContentEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplaceContentEntryJsonMarshaller();
        return instance;
    }
}
