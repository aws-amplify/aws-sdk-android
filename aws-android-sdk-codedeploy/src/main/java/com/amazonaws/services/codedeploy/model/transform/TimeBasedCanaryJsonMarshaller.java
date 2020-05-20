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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TimeBasedCanary
 */
class TimeBasedCanaryJsonMarshaller {

    public void marshall(TimeBasedCanary timeBasedCanary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (timeBasedCanary.getCanaryPercentage() != null) {
            Integer canaryPercentage = timeBasedCanary.getCanaryPercentage();
            jsonWriter.name("canaryPercentage");
            jsonWriter.value(canaryPercentage);
        }
        if (timeBasedCanary.getCanaryInterval() != null) {
            Integer canaryInterval = timeBasedCanary.getCanaryInterval();
            jsonWriter.name("canaryInterval");
            jsonWriter.value(canaryInterval);
        }
        jsonWriter.endObject();
    }

    private static TimeBasedCanaryJsonMarshaller instance;

    public static TimeBasedCanaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimeBasedCanaryJsonMarshaller();
        return instance;
    }
}
