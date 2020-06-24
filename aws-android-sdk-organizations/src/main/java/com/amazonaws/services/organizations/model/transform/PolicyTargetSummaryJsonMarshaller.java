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
 * JSON marshaller for POJO PolicyTargetSummary
 */
class PolicyTargetSummaryJsonMarshaller {

    public void marshall(PolicyTargetSummary policyTargetSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (policyTargetSummary.getTargetId() != null) {
            String targetId = policyTargetSummary.getTargetId();
            jsonWriter.name("TargetId");
            jsonWriter.value(targetId);
        }
        if (policyTargetSummary.getArn() != null) {
            String arn = policyTargetSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (policyTargetSummary.getName() != null) {
            String name = policyTargetSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (policyTargetSummary.getType() != null) {
            String type = policyTargetSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static PolicyTargetSummaryJsonMarshaller instance;

    public static PolicyTargetSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyTargetSummaryJsonMarshaller();
        return instance;
    }
}
