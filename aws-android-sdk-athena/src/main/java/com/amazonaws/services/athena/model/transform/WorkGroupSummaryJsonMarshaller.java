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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO WorkGroupSummary
 */
class WorkGroupSummaryJsonMarshaller {

    public void marshall(WorkGroupSummary workGroupSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (workGroupSummary.getName() != null) {
            String name = workGroupSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (workGroupSummary.getState() != null) {
            String state = workGroupSummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (workGroupSummary.getDescription() != null) {
            String description = workGroupSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (workGroupSummary.getCreationTime() != null) {
            java.util.Date creationTime = workGroupSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static WorkGroupSummaryJsonMarshaller instance;

    public static WorkGroupSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkGroupSummaryJsonMarshaller();
        return instance;
    }
}
