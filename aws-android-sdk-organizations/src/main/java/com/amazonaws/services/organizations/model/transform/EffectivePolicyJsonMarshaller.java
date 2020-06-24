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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EffectivePolicy
 */
class EffectivePolicyJsonMarshaller {

    public void marshall(EffectivePolicy effectivePolicy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (effectivePolicy.getPolicyContent() != null) {
            String policyContent = effectivePolicy.getPolicyContent();
            jsonWriter.name("PolicyContent");
            jsonWriter.value(policyContent);
        }
        if (effectivePolicy.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = effectivePolicy.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        if (effectivePolicy.getTargetId() != null) {
            String targetId = effectivePolicy.getTargetId();
            jsonWriter.name("TargetId");
            jsonWriter.value(targetId);
        }
        if (effectivePolicy.getPolicyType() != null) {
            String policyType = effectivePolicy.getPolicyType();
            jsonWriter.name("PolicyType");
            jsonWriter.value(policyType);
        }
        jsonWriter.endObject();
    }

    private static EffectivePolicyJsonMarshaller instance;

    public static EffectivePolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EffectivePolicyJsonMarshaller();
        return instance;
    }
}
