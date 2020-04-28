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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssociationStatus
 */
class AssociationStatusJsonMarshaller {

    public void marshall(AssociationStatus associationStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (associationStatus.getDate() != null) {
            java.util.Date dateValue = associationStatus.getDate();
            jsonWriter.name("Date");
            jsonWriter.value(dateValue);
        }
        if (associationStatus.getName() != null) {
            String name = associationStatus.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (associationStatus.getMessage() != null) {
            String message = associationStatus.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (associationStatus.getAdditionalInfo() != null) {
            String additionalInfo = associationStatus.getAdditionalInfo();
            jsonWriter.name("AdditionalInfo");
            jsonWriter.value(additionalInfo);
        }
        jsonWriter.endObject();
    }

    private static AssociationStatusJsonMarshaller instance;

    public static AssociationStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssociationStatusJsonMarshaller();
        return instance;
    }
}
