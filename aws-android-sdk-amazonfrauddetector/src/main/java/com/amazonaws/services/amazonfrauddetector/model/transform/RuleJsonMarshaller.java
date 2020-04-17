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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Rule
 */
class RuleJsonMarshaller {

    public void marshall(Rule rule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rule.getDetectorId() != null) {
            String detectorId = rule.getDetectorId();
            jsonWriter.name("detectorId");
            jsonWriter.value(detectorId);
        }
        if (rule.getRuleId() != null) {
            String ruleId = rule.getRuleId();
            jsonWriter.name("ruleId");
            jsonWriter.value(ruleId);
        }
        if (rule.getRuleVersion() != null) {
            String ruleVersion = rule.getRuleVersion();
            jsonWriter.name("ruleVersion");
            jsonWriter.value(ruleVersion);
        }
        jsonWriter.endObject();
    }

    private static RuleJsonMarshaller instance;

    public static RuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonMarshaller();
        return instance;
    }
}
