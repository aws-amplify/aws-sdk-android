/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RedactionConfig
 */
class RedactionConfigJsonMarshaller {

    public void marshall(RedactionConfig redactionConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (redactionConfig.getPiiEntityTypes() != null) {
            java.util.List<String> piiEntityTypes = redactionConfig.getPiiEntityTypes();
            jsonWriter.name("PiiEntityTypes");
            jsonWriter.beginArray();
            for (String piiEntityTypesItem : piiEntityTypes) {
                if (piiEntityTypesItem != null) {
                    jsonWriter.value(piiEntityTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (redactionConfig.getMaskMode() != null) {
            String maskMode = redactionConfig.getMaskMode();
            jsonWriter.name("MaskMode");
            jsonWriter.value(maskMode);
        }
        if (redactionConfig.getMaskCharacter() != null) {
            String maskCharacter = redactionConfig.getMaskCharacter();
            jsonWriter.name("MaskCharacter");
            jsonWriter.value(maskCharacter);
        }
        jsonWriter.endObject();
    }

    private static RedactionConfigJsonMarshaller instance;

    public static RedactionConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedactionConfigJsonMarshaller();
        return instance;
    }
}
