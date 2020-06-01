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
 * JSON marshaller for POJO WorkGroup
 */
class WorkGroupJsonMarshaller {

    public void marshall(WorkGroup workGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (workGroup.getName() != null) {
            String name = workGroup.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (workGroup.getState() != null) {
            String state = workGroup.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (workGroup.getConfiguration() != null) {
            WorkGroupConfiguration configuration = workGroup.getConfiguration();
            jsonWriter.name("Configuration");
            WorkGroupConfigurationJsonMarshaller.getInstance().marshall(configuration, jsonWriter);
        }
        if (workGroup.getDescription() != null) {
            String description = workGroup.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (workGroup.getCreationTime() != null) {
            java.util.Date creationTime = workGroup.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static WorkGroupJsonMarshaller instance;

    public static WorkGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkGroupJsonMarshaller();
        return instance;
    }
}
