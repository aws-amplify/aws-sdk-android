/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserProficiency
 */
class UserProficiencyJsonMarshaller {

    public void marshall(UserProficiency userProficiency, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userProficiency.getAttributeName() != null) {
            String attributeName = userProficiency.getAttributeName();
            jsonWriter.name("AttributeName");
            jsonWriter.value(attributeName);
        }
        if (userProficiency.getAttributeValue() != null) {
            String attributeValue = userProficiency.getAttributeValue();
            jsonWriter.name("AttributeValue");
            jsonWriter.value(attributeValue);
        }
        if (userProficiency.getLevel() != null) {
            Float level = userProficiency.getLevel();
            jsonWriter.name("Level");
            jsonWriter.value(level);
        }
        jsonWriter.endObject();
    }

    private static UserProficiencyJsonMarshaller instance;

    public static UserProficiencyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserProficiencyJsonMarshaller();
        return instance;
    }
}
