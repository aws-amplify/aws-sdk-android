/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomerVoiceActivity
 */
class CustomerVoiceActivityJsonMarshaller {

    public void marshall(CustomerVoiceActivity customerVoiceActivity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (customerVoiceActivity.getGreetingStartTimestamp() != null) {
            java.util.Date greetingStartTimestamp = customerVoiceActivity
                    .getGreetingStartTimestamp();
            jsonWriter.name("GreetingStartTimestamp");
            jsonWriter.value(greetingStartTimestamp);
        }
        if (customerVoiceActivity.getGreetingEndTimestamp() != null) {
            java.util.Date greetingEndTimestamp = customerVoiceActivity.getGreetingEndTimestamp();
            jsonWriter.name("GreetingEndTimestamp");
            jsonWriter.value(greetingEndTimestamp);
        }
        jsonWriter.endObject();
    }

    private static CustomerVoiceActivityJsonMarshaller instance;

    public static CustomerVoiceActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomerVoiceActivityJsonMarshaller();
        return instance;
    }
}
