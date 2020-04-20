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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TagValues
 */
class TagValuesJsonMarshaller {

    public void marshall(TagValues tagValues, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tagValues.getKey() != null) {
            String key = tagValues.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (tagValues.getValues() != null) {
            java.util.List<String> values = tagValues.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (tagValues.getMatchOptions() != null) {
            java.util.List<String> matchOptions = tagValues.getMatchOptions();
            jsonWriter.name("MatchOptions");
            jsonWriter.beginArray();
            for (String matchOptionsItem : matchOptions) {
                if (matchOptionsItem != null) {
                    jsonWriter.value(matchOptionsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TagValuesJsonMarshaller instance;

    public static TagValuesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagValuesJsonMarshaller();
        return instance;
    }
}
