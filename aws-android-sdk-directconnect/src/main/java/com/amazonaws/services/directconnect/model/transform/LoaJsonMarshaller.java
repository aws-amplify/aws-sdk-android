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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Loa
 */
class LoaJsonMarshaller {

    public void marshall(Loa loa, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loa.getLoaContent() != null) {
            java.nio.ByteBuffer loaContent = loa.getLoaContent();
            jsonWriter.name("loaContent");
            jsonWriter.value(loaContent);
        }
        if (loa.getLoaContentType() != null) {
            String loaContentType = loa.getLoaContentType();
            jsonWriter.name("loaContentType");
            jsonWriter.value(loaContentType);
        }
        jsonWriter.endObject();
    }

    private static LoaJsonMarshaller instance;

    public static LoaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoaJsonMarshaller();
        return instance;
    }
}
