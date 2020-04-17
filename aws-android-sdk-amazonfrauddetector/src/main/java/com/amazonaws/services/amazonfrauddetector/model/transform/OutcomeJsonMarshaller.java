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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Outcome
 */
class OutcomeJsonMarshaller {

    public void marshall(Outcome outcome, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outcome.getName() != null) {
            String name = outcome.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (outcome.getDescription() != null) {
            String description = outcome.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (outcome.getLastUpdatedTime() != null) {
            String lastUpdatedTime = outcome.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (outcome.getCreatedTime() != null) {
            String createdTime = outcome.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static OutcomeJsonMarshaller instance;

    public static OutcomeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutcomeJsonMarshaller();
        return instance;
    }
}
