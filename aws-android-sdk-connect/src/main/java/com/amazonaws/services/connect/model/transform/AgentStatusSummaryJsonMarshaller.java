/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AgentStatusSummary
 */
class AgentStatusSummaryJsonMarshaller {

    public void marshall(AgentStatusSummary agentStatusSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (agentStatusSummary.getId() != null) {
            String id = agentStatusSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (agentStatusSummary.getArn() != null) {
            String arn = agentStatusSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (agentStatusSummary.getName() != null) {
            String name = agentStatusSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (agentStatusSummary.getType() != null) {
            String type = agentStatusSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (agentStatusSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = agentStatusSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (agentStatusSummary.getLastModifiedRegion() != null) {
            String lastModifiedRegion = agentStatusSummary.getLastModifiedRegion();
            jsonWriter.name("LastModifiedRegion");
            jsonWriter.value(lastModifiedRegion);
        }
        jsonWriter.endObject();
    }

    private static AgentStatusSummaryJsonMarshaller instance;

    public static AgentStatusSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AgentStatusSummaryJsonMarshaller();
        return instance;
    }
}
