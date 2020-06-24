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
 * JSON marshaller for POJO PolicySummary
 */
class PolicySummaryJsonMarshaller {

    public void marshall(PolicySummary policySummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (policySummary.getId() != null) {
            String id = policySummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (policySummary.getArn() != null) {
            String arn = policySummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (policySummary.getName() != null) {
            String name = policySummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (policySummary.getDescription() != null) {
            String description = policySummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (policySummary.getType() != null) {
            String type = policySummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (policySummary.getAwsManaged() != null) {
            Boolean awsManaged = policySummary.getAwsManaged();
            jsonWriter.name("AwsManaged");
            jsonWriter.value(awsManaged);
        }
        jsonWriter.endObject();
    }

    private static PolicySummaryJsonMarshaller instance;

    public static PolicySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicySummaryJsonMarshaller();
        return instance;
    }
}
