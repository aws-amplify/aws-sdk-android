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

package com.amazonaws.services.chimesdkmessaging.model.transform;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchField
 */
class SearchFieldJsonMarshaller {

    public void marshall(SearchField searchField, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchField.getKey() != null) {
            String key = searchField.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (searchField.getValues() != null) {
            java.util.List<String> values = searchField.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchField.getOperator() != null) {
            String operator = searchField.getOperator();
            jsonWriter.name("Operator");
            jsonWriter.value(operator);
        }
        jsonWriter.endObject();
    }

    private static SearchFieldJsonMarshaller instance;

    public static SearchFieldJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchFieldJsonMarshaller();
        return instance;
    }
}
