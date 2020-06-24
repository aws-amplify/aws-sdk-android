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
 * JSON marshaller for POJO Policy
 */
class PolicyJsonMarshaller {

    public void marshall(Policy policy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (policy.getPolicySummary() != null) {
            PolicySummary policySummary = policy.getPolicySummary();
            jsonWriter.name("PolicySummary");
            PolicySummaryJsonMarshaller.getInstance().marshall(policySummary, jsonWriter);
        }
        if (policy.getContent() != null) {
            String content = policy.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        jsonWriter.endObject();
    }

    private static PolicyJsonMarshaller instance;

    public static PolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyJsonMarshaller();
        return instance;
    }
}
