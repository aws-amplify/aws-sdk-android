/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RotationsListEntry
 */
class RotationsListEntryJsonMarshaller {

    public void marshall(RotationsListEntry rotationsListEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (rotationsListEntry.getKeyId() != null) {
            String keyId = rotationsListEntry.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        if (rotationsListEntry.getRotationDate() != null) {
            java.util.Date rotationDate = rotationsListEntry.getRotationDate();
            jsonWriter.name("RotationDate");
            jsonWriter.value(rotationDate);
        }
        if (rotationsListEntry.getRotationType() != null) {
            String rotationType = rotationsListEntry.getRotationType();
            jsonWriter.name("RotationType");
            jsonWriter.value(rotationType);
        }
        jsonWriter.endObject();
    }

    private static RotationsListEntryJsonMarshaller instance;

    public static RotationsListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RotationsListEntryJsonMarshaller();
        return instance;
    }
}
