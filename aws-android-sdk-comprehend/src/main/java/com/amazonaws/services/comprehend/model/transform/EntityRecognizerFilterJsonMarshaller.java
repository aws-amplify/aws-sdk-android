/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EntityRecognizerFilter
 */
class EntityRecognizerFilterJsonMarshaller {

    public void marshall(EntityRecognizerFilter entityRecognizerFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (entityRecognizerFilter.getStatus() != null) {
            String status = entityRecognizerFilter.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (entityRecognizerFilter.getSubmitTimeBefore() != null) {
            java.util.Date submitTimeBefore = entityRecognizerFilter.getSubmitTimeBefore();
            jsonWriter.name("SubmitTimeBefore");
            jsonWriter.value(submitTimeBefore);
        }
        if (entityRecognizerFilter.getSubmitTimeAfter() != null) {
            java.util.Date submitTimeAfter = entityRecognizerFilter.getSubmitTimeAfter();
            jsonWriter.name("SubmitTimeAfter");
            jsonWriter.value(submitTimeAfter);
        }
        jsonWriter.endObject();
    }

    private static EntityRecognizerFilterJsonMarshaller instance;

    public static EntityRecognizerFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerFilterJsonMarshaller();
        return instance;
    }
}
