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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScalingRule
 */
class ScalingRuleJsonMarshaller {

    public void marshall(ScalingRule scalingRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scalingRule.getName() != null) {
            String name = scalingRule.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (scalingRule.getDescription() != null) {
            String description = scalingRule.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (scalingRule.getAction() != null) {
            ScalingAction action = scalingRule.getAction();
            jsonWriter.name("Action");
            ScalingActionJsonMarshaller.getInstance().marshall(action, jsonWriter);
        }
        if (scalingRule.getTrigger() != null) {
            ScalingTrigger trigger = scalingRule.getTrigger();
            jsonWriter.name("Trigger");
            ScalingTriggerJsonMarshaller.getInstance().marshall(trigger, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ScalingRuleJsonMarshaller instance;

    public static ScalingRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScalingRuleJsonMarshaller();
        return instance;
    }
}
