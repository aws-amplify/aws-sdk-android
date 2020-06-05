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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UsagePlanKey
 */
class UsagePlanKeyJsonMarshaller {

    public void marshall(UsagePlanKey usagePlanKey, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (usagePlanKey.getId() != null) {
            String id = usagePlanKey.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (usagePlanKey.getType() != null) {
            String type = usagePlanKey.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (usagePlanKey.getValue() != null) {
            String value = usagePlanKey.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        if (usagePlanKey.getName() != null) {
            String name = usagePlanKey.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static UsagePlanKeyJsonMarshaller instance;

    public static UsagePlanKeyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsagePlanKeyJsonMarshaller();
        return instance;
    }
}
