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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BuiltinSlotTypeMetadata
 */
class BuiltinSlotTypeMetadataJsonMarshaller {

    public void marshall(BuiltinSlotTypeMetadata builtinSlotTypeMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (builtinSlotTypeMetadata.getSignature() != null) {
            String signature = builtinSlotTypeMetadata.getSignature();
            jsonWriter.name("signature");
            jsonWriter.value(signature);
        }
        if (builtinSlotTypeMetadata.getSupportedLocales() != null) {
            java.util.List<String> supportedLocales = builtinSlotTypeMetadata.getSupportedLocales();
            jsonWriter.name("supportedLocales");
            jsonWriter.beginArray();
            for (String supportedLocalesItem : supportedLocales) {
                if (supportedLocalesItem != null) {
                    jsonWriter.value(supportedLocalesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BuiltinSlotTypeMetadataJsonMarshaller instance;

    public static BuiltinSlotTypeMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BuiltinSlotTypeMetadataJsonMarshaller();
        return instance;
    }
}
