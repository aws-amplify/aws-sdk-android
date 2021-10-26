/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointAttributes
 */
class EndpointAttributesJsonMarshaller {

    public void marshall(EndpointAttributes endpointAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointAttributes.getDeviceToken() != null) {
            String deviceToken = endpointAttributes.getDeviceToken();
            jsonWriter.name("DeviceToken");
            jsonWriter.value(deviceToken);
        }
        if (endpointAttributes.getVoipDeviceToken() != null) {
            String voipDeviceToken = endpointAttributes.getVoipDeviceToken();
            jsonWriter.name("VoipDeviceToken");
            jsonWriter.value(voipDeviceToken);
        }
        jsonWriter.endObject();
    }

    private static EndpointAttributesJsonMarshaller instance;

    public static EndpointAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointAttributesJsonMarshaller();
        return instance;
    }
}
