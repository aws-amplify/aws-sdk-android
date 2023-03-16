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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScheduledJobRollout
 */
class ScheduledJobRolloutJsonMarshaller {

    public void marshall(ScheduledJobRollout scheduledJobRollout, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (scheduledJobRollout.getStartTime() != null) {
            String startTime = scheduledJobRollout.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        jsonWriter.endObject();
    }

    private static ScheduledJobRolloutJsonMarshaller instance;

    public static ScheduledJobRolloutJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledJobRolloutJsonMarshaller();
        return instance;
    }
}
