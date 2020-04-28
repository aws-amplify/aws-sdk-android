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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputSecurityGroup
 */
class InputSecurityGroupJsonMarshaller {

    public void marshall(InputSecurityGroup inputSecurityGroup, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputSecurityGroup.getArn() != null) {
            String arn = inputSecurityGroup.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (inputSecurityGroup.getId() != null) {
            String id = inputSecurityGroup.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (inputSecurityGroup.getInputs() != null) {
            java.util.List<String> inputs = inputSecurityGroup.getInputs();
            jsonWriter.name("Inputs");
            jsonWriter.beginArray();
            for (String inputsItem : inputs) {
                if (inputsItem != null) {
                    jsonWriter.value(inputsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (inputSecurityGroup.getState() != null) {
            String state = inputSecurityGroup.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (inputSecurityGroup.getTags() != null) {
            java.util.Map<String, String> tags = inputSecurityGroup.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (inputSecurityGroup.getWhitelistRules() != null) {
            java.util.List<InputWhitelistRule> whitelistRules = inputSecurityGroup
                    .getWhitelistRules();
            jsonWriter.name("WhitelistRules");
            jsonWriter.beginArray();
            for (InputWhitelistRule whitelistRulesItem : whitelistRules) {
                if (whitelistRulesItem != null) {
                    InputWhitelistRuleJsonMarshaller.getInstance().marshall(whitelistRulesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InputSecurityGroupJsonMarshaller instance;

    public static InputSecurityGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputSecurityGroupJsonMarshaller();
        return instance;
    }
}
