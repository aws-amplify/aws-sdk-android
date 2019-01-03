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
 * JSON marshaller for POJO PolicyVersionIdentifier
 */
class PolicyVersionIdentifierJsonMarshaller {

    public void marshall(PolicyVersionIdentifier policyVersionIdentifier, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (policyVersionIdentifier.getPolicyName() != null) {
            String policyName = policyVersionIdentifier.getPolicyName();
            jsonWriter.name("policyName");
            jsonWriter.value(policyName);
        }
        if (policyVersionIdentifier.getPolicyVersionId() != null) {
            String policyVersionId = policyVersionIdentifier.getPolicyVersionId();
            jsonWriter.name("policyVersionId");
            jsonWriter.value(policyVersionId);
        }
        jsonWriter.endObject();
    }

    private static PolicyVersionIdentifierJsonMarshaller instance;

    public static PolicyVersionIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyVersionIdentifierJsonMarshaller();
        return instance;
    }
}
