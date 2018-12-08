/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TerminologyData
 */
class TerminologyDataJsonMarshaller {

    public void marshall(TerminologyData terminologyData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (terminologyData.getFile() != null) {
            java.nio.ByteBuffer file = terminologyData.getFile();
            jsonWriter.name("File");
            jsonWriter.value(file);
        }
        if (terminologyData.getFormat() != null) {
            String format = terminologyData.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        jsonWriter.endObject();
    }

    private static TerminologyDataJsonMarshaller instance;

    public static TerminologyDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TerminologyDataJsonMarshaller();
        return instance;
    }
}
