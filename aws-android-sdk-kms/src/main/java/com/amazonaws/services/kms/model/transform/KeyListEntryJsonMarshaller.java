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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KeyListEntry
 */
class KeyListEntryJsonMarshaller {

    public void marshall(KeyListEntry keyListEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyListEntry.getKeyId() != null) {
            String keyId = keyListEntry.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        if (keyListEntry.getKeyArn() != null) {
            String keyArn = keyListEntry.getKeyArn();
            jsonWriter.name("KeyArn");
            jsonWriter.value(keyArn);
        }
        jsonWriter.endObject();
    }

    private static KeyListEntryJsonMarshaller instance;

    public static KeyListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyListEntryJsonMarshaller();
        return instance;
    }
}
