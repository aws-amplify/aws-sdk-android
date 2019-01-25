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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StringAttributeConstraintsType
 */
class StringAttributeConstraintsTypeJsonMarshaller {

    public void marshall(StringAttributeConstraintsType stringAttributeConstraintsType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stringAttributeConstraintsType.getMinLength() != null) {
            String minLength = stringAttributeConstraintsType.getMinLength();
            jsonWriter.name("MinLength");
            jsonWriter.value(minLength);
        }
        if (stringAttributeConstraintsType.getMaxLength() != null) {
            String maxLength = stringAttributeConstraintsType.getMaxLength();
            jsonWriter.name("MaxLength");
            jsonWriter.value(maxLength);
        }
        jsonWriter.endObject();
    }

    private static StringAttributeConstraintsTypeJsonMarshaller instance;

    public static StringAttributeConstraintsTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StringAttributeConstraintsTypeJsonMarshaller();
        return instance;
    }
}
