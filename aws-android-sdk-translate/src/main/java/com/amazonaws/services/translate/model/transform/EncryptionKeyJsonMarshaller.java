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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EncryptionKey
 */
class EncryptionKeyJsonMarshaller {

    public void marshall(EncryptionKey encryptionKey, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (encryptionKey.getType() != null) {
            String type = encryptionKey.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (encryptionKey.getId() != null) {
            String id = encryptionKey.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        jsonWriter.endObject();
    }

    private static EncryptionKeyJsonMarshaller instance;

    public static EncryptionKeyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EncryptionKeyJsonMarshaller();
        return instance;
    }
}
