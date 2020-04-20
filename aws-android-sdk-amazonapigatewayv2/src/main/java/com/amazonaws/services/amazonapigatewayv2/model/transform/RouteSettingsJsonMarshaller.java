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
 * JSON marshaller for POJO RouteSettings
 */
class RouteSettingsJsonMarshaller {

    public void marshall(RouteSettings routeSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routeSettings.getDataTraceEnabled() != null) {
            Boolean dataTraceEnabled = routeSettings.getDataTraceEnabled();
            jsonWriter.name("DataTraceEnabled");
            jsonWriter.value(dataTraceEnabled);
        }
        if (routeSettings.getDetailedMetricsEnabled() != null) {
            Boolean detailedMetricsEnabled = routeSettings.getDetailedMetricsEnabled();
            jsonWriter.name("DetailedMetricsEnabled");
            jsonWriter.value(detailedMetricsEnabled);
        }
        if (routeSettings.getLoggingLevel() != null) {
            String loggingLevel = routeSettings.getLoggingLevel();
            jsonWriter.name("LoggingLevel");
            jsonWriter.value(loggingLevel);
        }
        if (routeSettings.getThrottlingBurstLimit() != null) {
            Integer throttlingBurstLimit = routeSettings.getThrottlingBurstLimit();
            jsonWriter.name("ThrottlingBurstLimit");
            jsonWriter.value(throttlingBurstLimit);
        }
        if (routeSettings.getThrottlingRateLimit() != null) {
            Double throttlingRateLimit = routeSettings.getThrottlingRateLimit();
            jsonWriter.name("ThrottlingRateLimit");
            jsonWriter.value(throttlingRateLimit);
        }
        jsonWriter.endObject();
    }

    private static RouteSettingsJsonMarshaller instance;

    public static RouteSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteSettingsJsonMarshaller();
        return instance;
    }
}
