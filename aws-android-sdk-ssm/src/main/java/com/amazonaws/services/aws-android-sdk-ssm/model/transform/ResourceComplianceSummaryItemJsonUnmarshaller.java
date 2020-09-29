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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO ResourceComplianceSummaryItem
 */
class ResourceComplianceSummaryItemJsonUnmarshaller implements Unmarshaller<ResourceComplianceSummaryItem, JsonUnmarshallerContext> {

    public ResourceComplianceSummaryItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceComplianceSummaryItem resourceComplianceSummaryItem = new ResourceComplianceSummaryItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ComplianceType")) {
                resourceComplianceSummaryItem.setComplianceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResourceType")) {
                resourceComplianceSummaryItem.setResourceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResourceId")) {
                resourceComplianceSummaryItem.setResourceId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Status")) {
                resourceComplianceSummaryItem.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OverallSeverity")) {
                resourceComplianceSummaryItem.setOverallSeverity(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ExecutionSummary")) {
                resourceComplianceSummaryItem.setExecutionSummary(ComplianceExecutionSummaryJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CompliantSummary")) {
                resourceComplianceSummaryItem.setCompliantSummary(CompliantSummaryJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("NonCompliantSummary")) {
                resourceComplianceSummaryItem.setNonCompliantSummary(NonCompliantSummaryJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceComplianceSummaryItem;
    }

    private static ResourceComplianceSummaryItemJsonUnmarshaller instance;
    public static ResourceComplianceSummaryItemJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ResourceComplianceSummaryItemJsonUnmarshaller();
        return instance;
    }
}
