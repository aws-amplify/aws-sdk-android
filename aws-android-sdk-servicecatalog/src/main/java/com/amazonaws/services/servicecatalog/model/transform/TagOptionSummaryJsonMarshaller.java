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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TagOptionSummary
 */
class TagOptionSummaryJsonMarshaller {

    public void marshall(TagOptionSummary tagOptionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tagOptionSummary.getKey() != null) {
            String key = tagOptionSummary.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (tagOptionSummary.getValues() != null) {
            java.util.List<String> values = tagOptionSummary.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TagOptionSummaryJsonMarshaller instance;

    public static TagOptionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagOptionSummaryJsonMarshaller();
        return instance;
    }
}
