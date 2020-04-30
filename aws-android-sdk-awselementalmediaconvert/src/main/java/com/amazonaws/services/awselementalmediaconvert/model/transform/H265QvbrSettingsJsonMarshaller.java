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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO H265QvbrSettings
 */
class H265QvbrSettingsJsonMarshaller {

    public void marshall(H265QvbrSettings h265QvbrSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (h265QvbrSettings.getMaxAverageBitrate() != null) {
            Integer maxAverageBitrate = h265QvbrSettings.getMaxAverageBitrate();
            jsonWriter.name("MaxAverageBitrate");
            jsonWriter.value(maxAverageBitrate);
        }
        if (h265QvbrSettings.getQvbrQualityLevel() != null) {
            Integer qvbrQualityLevel = h265QvbrSettings.getQvbrQualityLevel();
            jsonWriter.name("QvbrQualityLevel");
            jsonWriter.value(qvbrQualityLevel);
        }
        if (h265QvbrSettings.getQvbrQualityLevelFineTune() != null) {
            Double qvbrQualityLevelFineTune = h265QvbrSettings.getQvbrQualityLevelFineTune();
            jsonWriter.name("QvbrQualityLevelFineTune");
            jsonWriter.value(qvbrQualityLevelFineTune);
        }
        jsonWriter.endObject();
    }

    private static H265QvbrSettingsJsonMarshaller instance;

    public static H265QvbrSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new H265QvbrSettingsJsonMarshaller();
        return instance;
    }
}
