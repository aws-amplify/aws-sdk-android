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
 * JSON marshaller for POJO EquipmentDetection
 */
class EquipmentDetectionJsonMarshaller {

    public void marshall(EquipmentDetection equipmentDetection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (equipmentDetection.getBoundingBox() != null) {
            BoundingBox boundingBox = equipmentDetection.getBoundingBox();
            jsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, jsonWriter);
        }
        if (equipmentDetection.getConfidence() != null) {
            Float confidence = equipmentDetection.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (equipmentDetection.getType() != null) {
            String type = equipmentDetection.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (equipmentDetection.getCoversBodyPart() != null) {
            CoversBodyPart coversBodyPart = equipmentDetection.getCoversBodyPart();
            jsonWriter.name("CoversBodyPart");
            CoversBodyPartJsonMarshaller.getInstance().marshall(coversBodyPart, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EquipmentDetectionJsonMarshaller instance;

    public static EquipmentDetectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EquipmentDetectionJsonMarshaller();
        return instance;
    }
}
