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
 * JSON marshaller for POJO OpsEntityItem
 */
class OpsEntityItemJsonMarshaller {

    public void marshall(OpsEntityItem opsEntityItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (opsEntityItem.getCaptureTime() != null) {
            String captureTime = opsEntityItem.getCaptureTime();
            jsonWriter.name("CaptureTime");
            jsonWriter.value(captureTime);
        }
        if (opsEntityItem.getContent() != null) {
            java.util.List<java.util.Map<String, String>> content = opsEntityItem.getContent();
            jsonWriter.name("Content");
            jsonWriter.beginArray();
            for (java.util.Map<String, String> contentItem : content) {
                if (contentItem != null) {
                    jsonWriter.beginObject();
                    for (java.util.Map.Entry<String, String> contentItemEntry : contentItem
                            .entrySet()) {
                        String contentItemValue = contentItemEntry.getValue();
                        if (contentItemValue != null) {
                            jsonWriter.name(contentItemEntry.getKey());
                            jsonWriter.value(contentItemValue);
                        }
                    }
                    jsonWriter.endObject();
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OpsEntityItemJsonMarshaller instance;

    public static OpsEntityItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OpsEntityItemJsonMarshaller();
        return instance;
    }
}
