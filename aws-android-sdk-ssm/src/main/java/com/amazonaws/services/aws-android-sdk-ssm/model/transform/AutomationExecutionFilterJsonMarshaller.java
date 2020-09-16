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
 * JSON marshaller for POJO AutomationExecutionFilter
 */
class AutomationExecutionFilterJsonMarshaller {

    public void marshall(AutomationExecutionFilter automationExecutionFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (automationExecutionFilter.getKey() != null) {
            String key = automationExecutionFilter.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (automationExecutionFilter.getValues() != null) {
            java.util.List<String> values = automationExecutionFilter.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
            jsonWriter.value(valuesItem);
                    }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AutomationExecutionFilterJsonMarshaller instance;
    public static AutomationExecutionFilterJsonMarshaller getInstance() {
        if (instance == null) instance = new AutomationExecutionFilterJsonMarshaller();
        return instance;
    }
}
