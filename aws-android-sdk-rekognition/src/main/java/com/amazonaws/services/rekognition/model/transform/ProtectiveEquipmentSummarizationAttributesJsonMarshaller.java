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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProtectiveEquipmentSummarizationAttributes
 */
class ProtectiveEquipmentSummarizationAttributesJsonMarshaller {

    public void marshall(
            ProtectiveEquipmentSummarizationAttributes protectiveEquipmentSummarizationAttributes,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (protectiveEquipmentSummarizationAttributes.getMinConfidence() != null) {
            Float minConfidence = protectiveEquipmentSummarizationAttributes.getMinConfidence();
            jsonWriter.name("MinConfidence");
            jsonWriter.value(minConfidence);
        }
        if (protectiveEquipmentSummarizationAttributes.getRequiredEquipmentTypes() != null) {
            java.util.List<String> requiredEquipmentTypes = protectiveEquipmentSummarizationAttributes
                    .getRequiredEquipmentTypes();
            jsonWriter.name("RequiredEquipmentTypes");
            jsonWriter.beginArray();
            for (String requiredEquipmentTypesItem : requiredEquipmentTypes) {
                if (requiredEquipmentTypesItem != null) {
                    jsonWriter.value(requiredEquipmentTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProtectiveEquipmentSummarizationAttributesJsonMarshaller instance;

    public static ProtectiveEquipmentSummarizationAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProtectiveEquipmentSummarizationAttributesJsonMarshaller();
        return instance;
    }
}
