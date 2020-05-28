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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConfigurationRevision
 */
class ConfigurationRevisionJsonMarshaller {

    public void marshall(ConfigurationRevision configurationRevision, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (configurationRevision.getCreationTime() != null) {
            java.util.Date creationTime = configurationRevision.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (configurationRevision.getDescription() != null) {
            String description = configurationRevision.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (configurationRevision.getRevision() != null) {
            Long revision = configurationRevision.getRevision();
            jsonWriter.name("Revision");
            jsonWriter.value(revision);
        }
        jsonWriter.endObject();
    }

    private static ConfigurationRevisionJsonMarshaller instance;

    public static ConfigurationRevisionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationRevisionJsonMarshaller();
        return instance;
    }
}
