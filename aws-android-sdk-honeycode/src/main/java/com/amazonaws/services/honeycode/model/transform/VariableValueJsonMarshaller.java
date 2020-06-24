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

package com.amazonaws.services.honeycode.model.transform;

import com.amazonaws.services.honeycode.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VariableValue
 */
class VariableValueJsonMarshaller {

    public void marshall(VariableValue variableValue, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (variableValue.getRawValue() != null) {
            String rawValue = variableValue.getRawValue();
            jsonWriter.name("rawValue");
            jsonWriter.value(rawValue);
        }
        jsonWriter.endObject();
    }

    private static VariableValueJsonMarshaller instance;

    public static VariableValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VariableValueJsonMarshaller();
        return instance;
    }
}
