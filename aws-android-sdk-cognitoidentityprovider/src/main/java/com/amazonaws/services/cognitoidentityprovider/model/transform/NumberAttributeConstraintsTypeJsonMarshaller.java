/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NumberAttributeConstraintsType
 */
class NumberAttributeConstraintsTypeJsonMarshaller {

    public void marshall(NumberAttributeConstraintsType numberAttributeConstraintsType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (numberAttributeConstraintsType.getMinValue() != null) {
            String minValue = numberAttributeConstraintsType.getMinValue();
            jsonWriter.name("MinValue");
            jsonWriter.value(minValue);
        }
        if (numberAttributeConstraintsType.getMaxValue() != null) {
            String maxValue = numberAttributeConstraintsType.getMaxValue();
            jsonWriter.name("MaxValue");
            jsonWriter.value(maxValue);
        }
        jsonWriter.endObject();
    }

    private static NumberAttributeConstraintsTypeJsonMarshaller instance;

    public static NumberAttributeConstraintsTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NumberAttributeConstraintsTypeJsonMarshaller();
        return instance;
    }
}
