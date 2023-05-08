/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentClassificationConfig
 */
class DocumentClassificationConfigJsonMarshaller {

    public void marshall(DocumentClassificationConfig documentClassificationConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentClassificationConfig.getMode() != null) {
            String mode = documentClassificationConfig.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (documentClassificationConfig.getLabels() != null) {
            java.util.List<String> labels = documentClassificationConfig.getLabels();
            jsonWriter.name("Labels");
            jsonWriter.beginArray();
            for (String labelsItem : labels) {
                if (labelsItem != null) {
                    jsonWriter.value(labelsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DocumentClassificationConfigJsonMarshaller instance;

    public static DocumentClassificationConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassificationConfigJsonMarshaller();
        return instance;
    }
}
