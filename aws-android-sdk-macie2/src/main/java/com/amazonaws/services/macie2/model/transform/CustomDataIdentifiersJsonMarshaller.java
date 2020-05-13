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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomDataIdentifiers
 */
class CustomDataIdentifiersJsonMarshaller {

    public void marshall(CustomDataIdentifiers customDataIdentifiers, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (customDataIdentifiers.getDetections() != null) {
            java.util.List<CustomDetection> detections = customDataIdentifiers.getDetections();
            jsonWriter.name("detections");
            jsonWriter.beginArray();
            for (CustomDetection detectionsItem : detections) {
                if (detectionsItem != null) {
                    CustomDetectionJsonMarshaller.getInstance()
                            .marshall(detectionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (customDataIdentifiers.getTotalCount() != null) {
            Long totalCount = customDataIdentifiers.getTotalCount();
            jsonWriter.name("totalCount");
            jsonWriter.value(totalCount);
        }
        jsonWriter.endObject();
    }

    private static CustomDataIdentifiersJsonMarshaller instance;

    public static CustomDataIdentifiersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomDataIdentifiersJsonMarshaller();
        return instance;
    }
}
