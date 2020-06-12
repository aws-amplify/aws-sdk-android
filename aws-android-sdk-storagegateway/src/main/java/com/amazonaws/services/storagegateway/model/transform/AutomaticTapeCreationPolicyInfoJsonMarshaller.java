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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutomaticTapeCreationPolicyInfo
 */
class AutomaticTapeCreationPolicyInfoJsonMarshaller {

    public void marshall(AutomaticTapeCreationPolicyInfo automaticTapeCreationPolicyInfo,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (automaticTapeCreationPolicyInfo.getAutomaticTapeCreationRules() != null) {
            java.util.List<AutomaticTapeCreationRule> automaticTapeCreationRules = automaticTapeCreationPolicyInfo
                    .getAutomaticTapeCreationRules();
            jsonWriter.name("AutomaticTapeCreationRules");
            jsonWriter.beginArray();
            for (AutomaticTapeCreationRule automaticTapeCreationRulesItem : automaticTapeCreationRules) {
                if (automaticTapeCreationRulesItem != null) {
                    AutomaticTapeCreationRuleJsonMarshaller.getInstance().marshall(
                            automaticTapeCreationRulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (automaticTapeCreationPolicyInfo.getGatewayARN() != null) {
            String gatewayARN = automaticTapeCreationPolicyInfo.getGatewayARN();
            jsonWriter.name("GatewayARN");
            jsonWriter.value(gatewayARN);
        }
        jsonWriter.endObject();
    }

    private static AutomaticTapeCreationPolicyInfoJsonMarshaller instance;

    public static AutomaticTapeCreationPolicyInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutomaticTapeCreationPolicyInfoJsonMarshaller();
        return instance;
    }
}
