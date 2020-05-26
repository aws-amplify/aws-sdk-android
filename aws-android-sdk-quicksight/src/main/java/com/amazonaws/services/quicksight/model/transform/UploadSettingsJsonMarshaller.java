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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UploadSettings
 */
class UploadSettingsJsonMarshaller {

    public void marshall(UploadSettings uploadSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (uploadSettings.getFormat() != null) {
            String format = uploadSettings.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (uploadSettings.getStartFromRow() != null) {
            Integer startFromRow = uploadSettings.getStartFromRow();
            jsonWriter.name("StartFromRow");
            jsonWriter.value(startFromRow);
        }
        if (uploadSettings.getContainsHeader() != null) {
            Boolean containsHeader = uploadSettings.getContainsHeader();
            jsonWriter.name("ContainsHeader");
            jsonWriter.value(containsHeader);
        }
        if (uploadSettings.getTextQualifier() != null) {
            String textQualifier = uploadSettings.getTextQualifier();
            jsonWriter.name("TextQualifier");
            jsonWriter.value(textQualifier);
        }
        if (uploadSettings.getDelimiter() != null) {
            String delimiter = uploadSettings.getDelimiter();
            jsonWriter.name("Delimiter");
            jsonWriter.value(delimiter);
        }
        jsonWriter.endObject();
    }

    private static UploadSettingsJsonMarshaller instance;

    public static UploadSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UploadSettingsJsonMarshaller();
        return instance;
    }
}
