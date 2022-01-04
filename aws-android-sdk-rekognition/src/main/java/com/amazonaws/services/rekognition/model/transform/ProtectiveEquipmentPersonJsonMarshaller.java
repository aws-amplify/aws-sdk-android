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
 * JSON marshaller for POJO ProtectiveEquipmentPerson
 */
class ProtectiveEquipmentPersonJsonMarshaller {

    public void marshall(ProtectiveEquipmentPerson protectiveEquipmentPerson,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (protectiveEquipmentPerson.getBodyParts() != null) {
            java.util.List<ProtectiveEquipmentBodyPart> bodyParts = protectiveEquipmentPerson
                    .getBodyParts();
            jsonWriter.name("BodyParts");
            jsonWriter.beginArray();
            for (ProtectiveEquipmentBodyPart bodyPartsItem : bodyParts) {
                if (bodyPartsItem != null) {
                    ProtectiveEquipmentBodyPartJsonMarshaller.getInstance().marshall(bodyPartsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (protectiveEquipmentPerson.getBoundingBox() != null) {
            BoundingBox boundingBox = protectiveEquipmentPerson.getBoundingBox();
            jsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, jsonWriter);
        }
        if (protectiveEquipmentPerson.getConfidence() != null) {
            Float confidence = protectiveEquipmentPerson.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (protectiveEquipmentPerson.getId() != null) {
            Integer id = protectiveEquipmentPerson.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        jsonWriter.endObject();
    }

    private static ProtectiveEquipmentPersonJsonMarshaller instance;

    public static ProtectiveEquipmentPersonJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProtectiveEquipmentPersonJsonMarshaller();
        return instance;
    }
}
