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
 * JSON marshaller for POJO Av1QvbrSettings
 */
class Av1QvbrSettingsJsonMarshaller {

    public void marshall(Av1QvbrSettings av1QvbrSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (av1QvbrSettings.getQvbrQualityLevel() != null) {
            Integer qvbrQualityLevel = av1QvbrSettings.getQvbrQualityLevel();
            jsonWriter.name("QvbrQualityLevel");
            jsonWriter.value(qvbrQualityLevel);
        }
        if (av1QvbrSettings.getQvbrQualityLevelFineTune() != null) {
            Double qvbrQualityLevelFineTune = av1QvbrSettings.getQvbrQualityLevelFineTune();
            jsonWriter.name("QvbrQualityLevelFineTune");
            jsonWriter.value(qvbrQualityLevelFineTune);
        }
        jsonWriter.endObject();
    }

    private static Av1QvbrSettingsJsonMarshaller instance;

    public static Av1QvbrSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Av1QvbrSettingsJsonMarshaller();
        return instance;
    }
}
