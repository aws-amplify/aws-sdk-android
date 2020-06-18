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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ComplianceItem
 */
class ComplianceItemJsonUnmarshaller implements
        Unmarshaller<ComplianceItem, JsonUnmarshallerContext> {

    public ComplianceItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ComplianceItem complianceItem = new ComplianceItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ComplianceType")) {
                complianceItem.setComplianceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                complianceItem.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                complianceItem.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                complianceItem.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Title")) {
                complianceItem.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                complianceItem.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Severity")) {
                complianceItem.setSeverity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecutionSummary")) {
                complianceItem.setExecutionSummary(ComplianceExecutionSummaryJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Details")) {
                complianceItem.setDetails(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return complianceItem;
    }

    private static ComplianceItemJsonUnmarshaller instance;

    public static ComplianceItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComplianceItemJsonUnmarshaller();
        return instance;
    }
}
