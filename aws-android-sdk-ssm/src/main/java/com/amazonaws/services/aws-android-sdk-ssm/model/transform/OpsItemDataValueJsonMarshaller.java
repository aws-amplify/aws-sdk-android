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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OpsItemDataValue
 */
class OpsItemDataValueJsonMarshaller {

    public void marshall(OpsItemDataValue opsItemDataValue, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (opsItemDataValue.getValue() != null) {
            String value = opsItemDataValue.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (opsItemDataValue.getType() != null) {
            String type = opsItemDataValue.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static OpsItemDataValueJsonMarshaller instance;
    public static OpsItemDataValueJsonMarshaller getInstance() {
        if (instance == null) instance = new OpsItemDataValueJsonMarshaller();
        return instance;
    }
}
