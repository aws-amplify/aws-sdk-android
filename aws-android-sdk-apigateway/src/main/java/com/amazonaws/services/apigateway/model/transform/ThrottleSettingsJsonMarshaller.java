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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ThrottleSettings
 */
class ThrottleSettingsJsonMarshaller {

    public void marshall(ThrottleSettings throttleSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (throttleSettings.getBurstLimit() != null) {
            Integer burstLimit = throttleSettings.getBurstLimit();
            jsonWriter.name("burstLimit");
            jsonWriter.value(burstLimit);
        }
        if (throttleSettings.getRateLimit() != null) {
            Double rateLimit = throttleSettings.getRateLimit();
            jsonWriter.name("rateLimit");
            jsonWriter.value(rateLimit);
        }
        jsonWriter.endObject();
    }

    private static ThrottleSettingsJsonMarshaller instance;

    public static ThrottleSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThrottleSettingsJsonMarshaller();
        return instance;
    }
}
