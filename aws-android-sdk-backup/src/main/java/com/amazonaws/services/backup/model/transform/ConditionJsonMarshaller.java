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

package com.amazonaws.services.backup.model.transform;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Condition
 */
class ConditionJsonMarshaller {

    public void marshall(Condition condition, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (condition.getConditionType() != null) {
            String conditionType = condition.getConditionType();
            jsonWriter.name("ConditionType");
            jsonWriter.value(conditionType);
        }
        if (condition.getConditionKey() != null) {
            String conditionKey = condition.getConditionKey();
            jsonWriter.name("ConditionKey");
            jsonWriter.value(conditionKey);
        }
        if (condition.getConditionValue() != null) {
            String conditionValue = condition.getConditionValue();
            jsonWriter.name("ConditionValue");
            jsonWriter.value(conditionValue);
        }
        jsonWriter.endObject();
    }

    private static ConditionJsonMarshaller instance;

    public static ConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConditionJsonMarshaller();
        return instance;
    }
}
