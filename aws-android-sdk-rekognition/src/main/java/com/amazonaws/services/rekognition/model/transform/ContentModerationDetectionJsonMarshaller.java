/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ContentModerationDetection
 */
class ContentModerationDetectionJsonMarshaller {

    public void marshall(ContentModerationDetection contentModerationDetection,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contentModerationDetection.getTimestamp() != null) {
            Long timestamp = contentModerationDetection.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        if (contentModerationDetection.getModerationLabel() != null) {
            ModerationLabel moderationLabel = contentModerationDetection.getModerationLabel();
            jsonWriter.name("ModerationLabel");
            ModerationLabelJsonMarshaller.getInstance().marshall(moderationLabel, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ContentModerationDetectionJsonMarshaller instance;

    public static ContentModerationDetectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContentModerationDetectionJsonMarshaller();
        return instance;
    }
}
