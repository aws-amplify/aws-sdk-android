/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PersistentChat
 */
class PersistentChatJsonMarshaller {

    public void marshall(PersistentChat persistentChat, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (persistentChat.getRehydrationType() != null) {
            String rehydrationType = persistentChat.getRehydrationType();
            jsonWriter.name("RehydrationType");
            jsonWriter.value(rehydrationType);
        }
        if (persistentChat.getSourceContactId() != null) {
            String sourceContactId = persistentChat.getSourceContactId();
            jsonWriter.name("SourceContactId");
            jsonWriter.value(sourceContactId);
        }
        jsonWriter.endObject();
    }

    private static PersistentChatJsonMarshaller instance;

    public static PersistentChatJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PersistentChatJsonMarshaller();
        return instance;
    }
}
