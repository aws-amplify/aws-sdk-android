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
 * JSON marshaller for POJO ParameterConstraints
 */
class ParameterConstraintsJsonMarshaller {

    public void marshall(ParameterConstraints parameterConstraints, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (parameterConstraints.getAllowedValues() != null) {
            java.util.List<String> allowedValues = parameterConstraints.getAllowedValues();
            jsonWriter.name("AllowedValues");
            jsonWriter.beginArray();
            for (String allowedValuesItem : allowedValues) {
                if (allowedValuesItem != null) {
                    jsonWriter.value(allowedValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ParameterConstraintsJsonMarshaller instance;

    public static ParameterConstraintsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterConstraintsJsonMarshaller();
        return instance;
    }
}
