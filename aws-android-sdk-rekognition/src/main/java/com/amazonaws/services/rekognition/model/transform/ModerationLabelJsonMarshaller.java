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
 * JSON marshaller for POJO ModerationLabel
 */
class ModerationLabelJsonMarshaller {

    public void marshall(ModerationLabel moderationLabel, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (moderationLabel.getConfidence() != null) {
            Float confidence = moderationLabel.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (moderationLabel.getName() != null) {
            String name = moderationLabel.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (moderationLabel.getParentName() != null) {
            String parentName = moderationLabel.getParentName();
            jsonWriter.name("ParentName");
            jsonWriter.value(parentName);
        }
        jsonWriter.endObject();
    }

    private static ModerationLabelJsonMarshaller instance;

    public static ModerationLabelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModerationLabelJsonMarshaller();
        return instance;
    }
}
