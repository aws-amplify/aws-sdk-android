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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProtectiveEquipmentBodyPart
 */
class ProtectiveEquipmentBodyPartJsonMarshaller {

    public void marshall(ProtectiveEquipmentBodyPart protectiveEquipmentBodyPart,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (protectiveEquipmentBodyPart.getName() != null) {
            String name = protectiveEquipmentBodyPart.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (protectiveEquipmentBodyPart.getConfidence() != null) {
            Float confidence = protectiveEquipmentBodyPart.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (protectiveEquipmentBodyPart.getEquipmentDetections() != null) {
            java.util.List<EquipmentDetection> equipmentDetections = protectiveEquipmentBodyPart
                    .getEquipmentDetections();
            jsonWriter.name("EquipmentDetections");
            jsonWriter.beginArray();
            for (EquipmentDetection equipmentDetectionsItem : equipmentDetections) {
                if (equipmentDetectionsItem != null) {
                    EquipmentDetectionJsonMarshaller.getInstance().marshall(
                            equipmentDetectionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProtectiveEquipmentBodyPartJsonMarshaller instance;

    public static ProtectiveEquipmentBodyPartJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProtectiveEquipmentBodyPartJsonMarshaller();
        return instance;
    }
}
