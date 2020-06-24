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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomRule
 */
class CustomRuleJsonMarshaller {

    public void marshall(CustomRule customRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (customRule.getSource() != null) {
            String source = customRule.getSource();
            jsonWriter.name("source");
            jsonWriter.value(source);
        }
        if (customRule.getTarget() != null) {
            String target = customRule.getTarget();
            jsonWriter.name("target");
            jsonWriter.value(target);
        }
        if (customRule.getStatus() != null) {
            String status = customRule.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (customRule.getCondition() != null) {
            String condition = customRule.getCondition();
            jsonWriter.name("condition");
            jsonWriter.value(condition);
        }
        jsonWriter.endObject();
    }

    private static CustomRuleJsonMarshaller instance;

    public static CustomRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomRuleJsonMarshaller();
        return instance;
    }
}
