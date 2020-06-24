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
 * JSON marshaller for POJO PolicyTypeSummary
 */
class PolicyTypeSummaryJsonMarshaller {

    public void marshall(PolicyTypeSummary policyTypeSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (policyTypeSummary.getType() != null) {
            String type = policyTypeSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (policyTypeSummary.getStatus() != null) {
            String status = policyTypeSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static PolicyTypeSummaryJsonMarshaller instance;

    public static PolicyTypeSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyTypeSummaryJsonMarshaller();
        return instance;
    }
}
