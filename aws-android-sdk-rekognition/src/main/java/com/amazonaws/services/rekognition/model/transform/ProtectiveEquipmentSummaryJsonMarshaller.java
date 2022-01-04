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
 * JSON marshaller for POJO ProtectiveEquipmentSummary
 */
class ProtectiveEquipmentSummaryJsonMarshaller {

    public void marshall(ProtectiveEquipmentSummary protectiveEquipmentSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (protectiveEquipmentSummary.getPersonsWithRequiredEquipment() != null) {
            java.util.List<Integer> personsWithRequiredEquipment = protectiveEquipmentSummary
                    .getPersonsWithRequiredEquipment();
            jsonWriter.name("PersonsWithRequiredEquipment");
            jsonWriter.beginArray();
            for (Integer personsWithRequiredEquipmentItem : personsWithRequiredEquipment) {
                if (personsWithRequiredEquipmentItem != null) {
                    jsonWriter.value(personsWithRequiredEquipmentItem);
                }
            }
            jsonWriter.endArray();
        }
        if (protectiveEquipmentSummary.getPersonsWithoutRequiredEquipment() != null) {
            java.util.List<Integer> personsWithoutRequiredEquipment = protectiveEquipmentSummary
                    .getPersonsWithoutRequiredEquipment();
            jsonWriter.name("PersonsWithoutRequiredEquipment");
            jsonWriter.beginArray();
            for (Integer personsWithoutRequiredEquipmentItem : personsWithoutRequiredEquipment) {
                if (personsWithoutRequiredEquipmentItem != null) {
                    jsonWriter.value(personsWithoutRequiredEquipmentItem);
                }
            }
            jsonWriter.endArray();
        }
        if (protectiveEquipmentSummary.getPersonsIndeterminate() != null) {
            java.util.List<Integer> personsIndeterminate = protectiveEquipmentSummary
                    .getPersonsIndeterminate();
            jsonWriter.name("PersonsIndeterminate");
            jsonWriter.beginArray();
            for (Integer personsIndeterminateItem : personsIndeterminate) {
                if (personsIndeterminateItem != null) {
                    jsonWriter.value(personsIndeterminateItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProtectiveEquipmentSummaryJsonMarshaller instance;

    public static ProtectiveEquipmentSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProtectiveEquipmentSummaryJsonMarshaller();
        return instance;
    }
}
