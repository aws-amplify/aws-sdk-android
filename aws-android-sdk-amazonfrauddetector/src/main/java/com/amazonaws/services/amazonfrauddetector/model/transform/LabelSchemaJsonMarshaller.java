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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LabelSchema
 */
class LabelSchemaJsonMarshaller {

    public void marshall(LabelSchema labelSchema, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (labelSchema.getLabelKey() != null) {
            String labelKey = labelSchema.getLabelKey();
            jsonWriter.name("labelKey");
            jsonWriter.value(labelKey);
        }
        if (labelSchema.getLabelMapper() != null) {
            java.util.Map<String, java.util.List<String>> labelMapper = labelSchema
                    .getLabelMapper();
            jsonWriter.name("labelMapper");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> labelMapperEntry : labelMapper
                    .entrySet()) {
                java.util.List<String> labelMapperValue = labelMapperEntry.getValue();
                if (labelMapperValue != null) {
                    jsonWriter.name(labelMapperEntry.getKey());
                    jsonWriter.beginArray();
                    for (String labelMapperValueItem : labelMapperValue) {
                        if (labelMapperValueItem != null) {
                            jsonWriter.value(labelMapperValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static LabelSchemaJsonMarshaller instance;

    public static LabelSchemaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelSchemaJsonMarshaller();
        return instance;
    }
}
