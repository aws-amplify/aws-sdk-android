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
 * JSON marshaller for POJO PatchRuleGroup
 */
class PatchRuleGroupJsonMarshaller {

    public void marshall(PatchRuleGroup patchRuleGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (patchRuleGroup.getPatchRules() != null) {
            java.util.List<PatchRule> patchRules = patchRuleGroup.getPatchRules();
            jsonWriter.name("PatchRules");
            jsonWriter.beginArray();
            for (PatchRule patchRulesItem : patchRules) {
                if (patchRulesItem != null) {
            PatchRuleJsonMarshaller.getInstance().marshall(patchRulesItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PatchRuleGroupJsonMarshaller instance;
    public static PatchRuleGroupJsonMarshaller getInstance() {
        if (instance == null) instance = new PatchRuleGroupJsonMarshaller();
        return instance;
    }
}
