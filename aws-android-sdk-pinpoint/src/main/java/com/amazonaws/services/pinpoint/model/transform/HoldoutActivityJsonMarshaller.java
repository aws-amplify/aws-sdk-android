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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HoldoutActivity
 */
class HoldoutActivityJsonMarshaller {

    public void marshall(HoldoutActivity holdoutActivity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (holdoutActivity.getNextActivity() != null) {
            String nextActivity = holdoutActivity.getNextActivity();
            jsonWriter.name("NextActivity");
            jsonWriter.value(nextActivity);
        }
        if (holdoutActivity.getPercentage() != null) {
            Integer percentage = holdoutActivity.getPercentage();
            jsonWriter.name("Percentage");
            jsonWriter.value(percentage);
        }
        jsonWriter.endObject();
    }

    private static HoldoutActivityJsonMarshaller instance;

    public static HoldoutActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HoldoutActivityJsonMarshaller();
        return instance;
    }
}
