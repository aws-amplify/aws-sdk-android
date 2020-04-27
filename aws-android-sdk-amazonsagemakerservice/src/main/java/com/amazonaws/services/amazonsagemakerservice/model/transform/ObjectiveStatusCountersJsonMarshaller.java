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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ObjectiveStatusCounters
 */
class ObjectiveStatusCountersJsonMarshaller {

    public void marshall(ObjectiveStatusCounters objectiveStatusCounters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (objectiveStatusCounters.getSucceeded() != null) {
            Integer succeeded = objectiveStatusCounters.getSucceeded();
            jsonWriter.name("Succeeded");
            jsonWriter.value(succeeded);
        }
        if (objectiveStatusCounters.getPending() != null) {
            Integer pending = objectiveStatusCounters.getPending();
            jsonWriter.name("Pending");
            jsonWriter.value(pending);
        }
        if (objectiveStatusCounters.getFailed() != null) {
            Integer failed = objectiveStatusCounters.getFailed();
            jsonWriter.name("Failed");
            jsonWriter.value(failed);
        }
        jsonWriter.endObject();
    }

    private static ObjectiveStatusCountersJsonMarshaller instance;

    public static ObjectiveStatusCountersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ObjectiveStatusCountersJsonMarshaller();
        return instance;
    }
}
