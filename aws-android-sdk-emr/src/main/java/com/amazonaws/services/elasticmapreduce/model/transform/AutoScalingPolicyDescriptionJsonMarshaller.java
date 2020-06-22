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
 * JSON marshaller for POJO AutoScalingPolicyDescription
 */
class AutoScalingPolicyDescriptionJsonMarshaller {

    public void marshall(AutoScalingPolicyDescription autoScalingPolicyDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoScalingPolicyDescription.getStatus() != null) {
            AutoScalingPolicyStatus status = autoScalingPolicyDescription.getStatus();
            jsonWriter.name("Status");
            AutoScalingPolicyStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (autoScalingPolicyDescription.getConstraints() != null) {
            ScalingConstraints constraints = autoScalingPolicyDescription.getConstraints();
            jsonWriter.name("Constraints");
            ScalingConstraintsJsonMarshaller.getInstance().marshall(constraints, jsonWriter);
        }
        if (autoScalingPolicyDescription.getRules() != null) {
            java.util.List<ScalingRule> rules = autoScalingPolicyDescription.getRules();
            jsonWriter.name("Rules");
            jsonWriter.beginArray();
            for (ScalingRule rulesItem : rules) {
                if (rulesItem != null) {
                    ScalingRuleJsonMarshaller.getInstance().marshall(rulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AutoScalingPolicyDescriptionJsonMarshaller instance;

    public static AutoScalingPolicyDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingPolicyDescriptionJsonMarshaller();
        return instance;
    }
}
