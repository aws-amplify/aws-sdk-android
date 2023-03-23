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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LendingField
 */
class LendingFieldJsonMarshaller {

    public void marshall(LendingField lendingField, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lendingField.getType() != null) {
            String type = lendingField.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (lendingField.getKeyDetection() != null) {
            LendingDetection keyDetection = lendingField.getKeyDetection();
            jsonWriter.name("KeyDetection");
            LendingDetectionJsonMarshaller.getInstance().marshall(keyDetection, jsonWriter);
        }
        if (lendingField.getValueDetections() != null) {
            java.util.List<LendingDetection> valueDetections = lendingField.getValueDetections();
            jsonWriter.name("ValueDetections");
            jsonWriter.beginArray();
            for (LendingDetection valueDetectionsItem : valueDetections) {
                if (valueDetectionsItem != null) {
                    LendingDetectionJsonMarshaller.getInstance().marshall(valueDetectionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LendingFieldJsonMarshaller instance;

    public static LendingFieldJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LendingFieldJsonMarshaller();
        return instance;
    }
}
