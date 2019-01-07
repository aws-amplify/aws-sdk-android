/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OTAUpdateFile
 */
class OTAUpdateFileJsonMarshaller {

    public void marshall(OTAUpdateFile oTAUpdateFile, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (oTAUpdateFile.getFileName() != null) {
            String fileName = oTAUpdateFile.getFileName();
            jsonWriter.name("fileName");
            jsonWriter.value(fileName);
        }
        if (oTAUpdateFile.getFileVersion() != null) {
            String fileVersion = oTAUpdateFile.getFileVersion();
            jsonWriter.name("fileVersion");
            jsonWriter.value(fileVersion);
        }
        if (oTAUpdateFile.getFileLocation() != null) {
            FileLocation fileLocation = oTAUpdateFile.getFileLocation();
            jsonWriter.name("fileLocation");
            FileLocationJsonMarshaller.getInstance().marshall(fileLocation, jsonWriter);
        }
        if (oTAUpdateFile.getCodeSigning() != null) {
            CodeSigning codeSigning = oTAUpdateFile.getCodeSigning();
            jsonWriter.name("codeSigning");
            CodeSigningJsonMarshaller.getInstance().marshall(codeSigning, jsonWriter);
        }
        if (oTAUpdateFile.getAttributes() != null) {
            java.util.Map<String, String> attributes = oTAUpdateFile.getAttributes();
            jsonWriter.name("attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static OTAUpdateFileJsonMarshaller instance;

    public static OTAUpdateFileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OTAUpdateFileJsonMarshaller();
        return instance;
    }
}
