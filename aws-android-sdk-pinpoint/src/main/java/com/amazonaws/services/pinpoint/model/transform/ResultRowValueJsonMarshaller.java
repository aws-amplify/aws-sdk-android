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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResultRowValue
 */
class ResultRowValueJsonMarshaller {

    public void marshall(ResultRowValue resultRowValue, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resultRowValue.getKey() != null) {
            String key = resultRowValue.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (resultRowValue.getType() != null) {
            String type = resultRowValue.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (resultRowValue.getValue() != null) {
            String value = resultRowValue.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static ResultRowValueJsonMarshaller instance;

    public static ResultRowValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResultRowValueJsonMarshaller();
        return instance;
    }
}
