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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserAttributeUpdateSettingsType
 */
class UserAttributeUpdateSettingsTypeJsonMarshaller {

    public void marshall(UserAttributeUpdateSettingsType userAttributeUpdateSettingsType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userAttributeUpdateSettingsType.getAttributesRequireVerificationBeforeUpdate() != null) {
            java.util.List<String> attributesRequireVerificationBeforeUpdate = userAttributeUpdateSettingsType
                    .getAttributesRequireVerificationBeforeUpdate();
            jsonWriter.name("AttributesRequireVerificationBeforeUpdate");
            jsonWriter.beginArray();
            for (String attributesRequireVerificationBeforeUpdateItem : attributesRequireVerificationBeforeUpdate) {
                if (attributesRequireVerificationBeforeUpdateItem != null) {
                    jsonWriter.value(attributesRequireVerificationBeforeUpdateItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UserAttributeUpdateSettingsTypeJsonMarshaller instance;

    public static UserAttributeUpdateSettingsTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserAttributeUpdateSettingsTypeJsonMarshaller();
        return instance;
    }
}
