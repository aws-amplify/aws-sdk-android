/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FlywheelFilter
 */
class FlywheelFilterJsonMarshaller {

    public void marshall(FlywheelFilter flywheelFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (flywheelFilter.getStatus() != null) {
            String status = flywheelFilter.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (flywheelFilter.getCreationTimeAfter() != null) {
            java.util.Date creationTimeAfter = flywheelFilter.getCreationTimeAfter();
            jsonWriter.name("CreationTimeAfter");
            jsonWriter.value(creationTimeAfter);
        }
        if (flywheelFilter.getCreationTimeBefore() != null) {
            java.util.Date creationTimeBefore = flywheelFilter.getCreationTimeBefore();
            jsonWriter.name("CreationTimeBefore");
            jsonWriter.value(creationTimeBefore);
        }
        jsonWriter.endObject();
    }

    private static FlywheelFilterJsonMarshaller instance;

    public static FlywheelFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelFilterJsonMarshaller();
        return instance;
    }
}
