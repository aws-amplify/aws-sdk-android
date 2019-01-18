/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EffectivePolicy
 */
class EffectivePolicyJsonMarshaller {

    public void marshall(EffectivePolicy effectivePolicy, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (effectivePolicy.getPolicyName() != null) {
            String policyName = effectivePolicy.getPolicyName();
            jsonWriter.name("policyName");
            jsonWriter.value(policyName);
        }
        if (effectivePolicy.getPolicyArn() != null) {
            String policyArn = effectivePolicy.getPolicyArn();
            jsonWriter.name("policyArn");
            jsonWriter.value(policyArn);
        }
        if (effectivePolicy.getPolicyDocument() != null) {
            String policyDocument = effectivePolicy.getPolicyDocument();
            jsonWriter.name("policyDocument");
            jsonWriter.value(policyDocument);
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
