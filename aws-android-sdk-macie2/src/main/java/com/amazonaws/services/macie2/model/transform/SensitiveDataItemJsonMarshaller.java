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
 * JSON marshaller for POJO SensitiveDataItem
 */
class SensitiveDataItemJsonMarshaller {

    public void marshall(SensitiveDataItem sensitiveDataItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sensitiveDataItem.getCategory() != null) {
            String category = sensitiveDataItem.getCategory();
            jsonWriter.name("category");
            jsonWriter.value(category);
        }
        if (sensitiveDataItem.getDetections() != null) {
            java.util.List<DefaultDetection> detections = sensitiveDataItem.getDetections();
            jsonWriter.name("detections");
            jsonWriter.beginArray();
            for (DefaultDetection detectionsItem : detections) {
                if (detectionsItem != null) {
                    DefaultDetectionJsonMarshaller.getInstance().marshall(detectionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (sensitiveDataItem.getTotalCount() != null) {
            Long totalCount = sensitiveDataItem.getTotalCount();
            jsonWriter.name("totalCount");
            jsonWriter.value(totalCount);
        }
        jsonWriter.endObject();
    }

    private static SensitiveDataItemJsonMarshaller instance;

    public static SensitiveDataItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SensitiveDataItemJsonMarshaller();
        return instance;
    }
}
