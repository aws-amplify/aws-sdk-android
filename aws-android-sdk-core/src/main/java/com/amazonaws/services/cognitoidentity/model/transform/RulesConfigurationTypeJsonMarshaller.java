/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RulesConfigurationType
 */
class RulesConfigurationTypeJsonMarshaller {

    public void marshall(RulesConfigurationType rulesConfigurationType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (rulesConfigurationType.getRules() != null) {
            java.util.List<MappingRule> rules = rulesConfigurationType.getRules();
            jsonWriter.name("Rules");
            jsonWriter.beginArray();
            for (MappingRule rulesItem : rules) {
                if (rulesItem != null) {
                    MappingRuleJsonMarshaller.getInstance().marshall(rulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RulesConfigurationTypeJsonMarshaller instance;

    public static RulesConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RulesConfigurationTypeJsonMarshaller();
        return instance;
    }
}
