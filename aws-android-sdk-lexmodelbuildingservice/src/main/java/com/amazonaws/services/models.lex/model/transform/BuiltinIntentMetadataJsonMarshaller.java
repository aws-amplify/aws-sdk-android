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
 * JSON marshaller for POJO BuiltinIntentMetadata
 */
class BuiltinIntentMetadataJsonMarshaller {

    public void marshall(BuiltinIntentMetadata builtinIntentMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (builtinIntentMetadata.getSignature() != null) {
            String signature = builtinIntentMetadata.getSignature();
            jsonWriter.name("signature");
            jsonWriter.value(signature);
        }
        if (builtinIntentMetadata.getSupportedLocales() != null) {
            java.util.List<String> supportedLocales = builtinIntentMetadata.getSupportedLocales();
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

    private static BuiltinIntentMetadataJsonMarshaller instance;

    public static BuiltinIntentMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BuiltinIntentMetadataJsonMarshaller();
        return instance;
    }
}
