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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointDemographic
 */
class EndpointDemographicJsonMarshaller {

    public void marshall(EndpointDemographic endpointDemographic, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointDemographic.getAppVersion() != null) {
            String appVersion = endpointDemographic.getAppVersion();
            jsonWriter.name("AppVersion");
            jsonWriter.value(appVersion);
        }
        if (endpointDemographic.getLocale() != null) {
            String locale = endpointDemographic.getLocale();
            jsonWriter.name("Locale");
            jsonWriter.value(locale);
        }
        if (endpointDemographic.getMake() != null) {
            String make = endpointDemographic.getMake();
            jsonWriter.name("Make");
            jsonWriter.value(make);
        }
        if (endpointDemographic.getModel() != null) {
            String model = endpointDemographic.getModel();
            jsonWriter.name("Model");
            jsonWriter.value(model);
        }
        if (endpointDemographic.getModelVersion() != null) {
            String modelVersion = endpointDemographic.getModelVersion();
            jsonWriter.name("ModelVersion");
            jsonWriter.value(modelVersion);
        }
        if (endpointDemographic.getPlatform() != null) {
            String platform = endpointDemographic.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (endpointDemographic.getPlatformVersion() != null) {
            String platformVersion = endpointDemographic.getPlatformVersion();
            jsonWriter.name("PlatformVersion");
            jsonWriter.value(platformVersion);
        }
        if (endpointDemographic.getTimezone() != null) {
            String timezone = endpointDemographic.getTimezone();
            jsonWriter.name("Timezone");
            jsonWriter.value(timezone);
        }
        jsonWriter.endObject();
    }

    private static EndpointDemographicJsonMarshaller instance;

    public static EndpointDemographicJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointDemographicJsonMarshaller();
        return instance;
    }
}
