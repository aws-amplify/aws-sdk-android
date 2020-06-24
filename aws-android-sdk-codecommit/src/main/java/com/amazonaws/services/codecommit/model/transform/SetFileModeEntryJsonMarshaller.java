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
 * JSON marshaller for POJO SetFileModeEntry
 */
class SetFileModeEntryJsonMarshaller {

    public void marshall(SetFileModeEntry setFileModeEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (setFileModeEntry.getFilePath() != null) {
            String filePath = setFileModeEntry.getFilePath();
            jsonWriter.name("filePath");
            jsonWriter.value(filePath);
        }
        if (setFileModeEntry.getFileMode() != null) {
            String fileMode = setFileModeEntry.getFileMode();
            jsonWriter.name("fileMode");
            jsonWriter.value(fileMode);
        }
        jsonWriter.endObject();
    }

    private static SetFileModeEntryJsonMarshaller instance;

    public static SetFileModeEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SetFileModeEntryJsonMarshaller();
        return instance;
    }
}
