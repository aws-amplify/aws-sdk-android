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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccessLogSettings
 */
class AccessLogSettingsJsonMarshaller {

    public void marshall(AccessLogSettings accessLogSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (accessLogSettings.getDestinationArn() != null) {
            String destinationArn = accessLogSettings.getDestinationArn();
            jsonWriter.name("DestinationArn");
            jsonWriter.value(destinationArn);
        }
        if (accessLogSettings.getFormat() != null) {
            String format = accessLogSettings.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        jsonWriter.endObject();
    }

    private static AccessLogSettingsJsonMarshaller instance;

    public static AccessLogSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccessLogSettingsJsonMarshaller();
        return instance;
    }
}
