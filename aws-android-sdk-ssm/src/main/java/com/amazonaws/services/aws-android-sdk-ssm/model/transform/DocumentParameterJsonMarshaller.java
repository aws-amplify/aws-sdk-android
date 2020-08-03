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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentParameter
 */
class DocumentParameterJsonMarshaller {

    public void marshall(DocumentParameter documentParameter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentParameter.getName() != null) {
            String name = documentParameter.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (documentParameter.getType() != null) {
            String type = documentParameter.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (documentParameter.getDescription() != null) {
            String description = documentParameter.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (documentParameter.getDefaultValue() != null) {
            String defaultValue = documentParameter.getDefaultValue();
            jsonWriter.name("DefaultValue");
            jsonWriter.value(defaultValue);
        }
        jsonWriter.endObject();
    }

    private static DocumentParameterJsonMarshaller instance;
    public static DocumentParameterJsonMarshaller getInstance() {
        if (instance == null) instance = new DocumentParameterJsonMarshaller();
        return instance;
    }
}
