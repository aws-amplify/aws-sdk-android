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
 * JSON marshaller for POJO FrameCaptureSettings
 */
class FrameCaptureSettingsJsonMarshaller {

    public void marshall(FrameCaptureSettings frameCaptureSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (frameCaptureSettings.getFramerateDenominator() != null) {
            Integer framerateDenominator = frameCaptureSettings.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (frameCaptureSettings.getFramerateNumerator() != null) {
            Integer framerateNumerator = frameCaptureSettings.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        if (frameCaptureSettings.getMaxCaptures() != null) {
            Integer maxCaptures = frameCaptureSettings.getMaxCaptures();
            jsonWriter.name("MaxCaptures");
            jsonWriter.value(maxCaptures);
        }
        if (frameCaptureSettings.getQuality() != null) {
            Integer quality = frameCaptureSettings.getQuality();
            jsonWriter.name("Quality");
            jsonWriter.value(quality);
        }
        jsonWriter.endObject();
    }

    private static FrameCaptureSettingsJsonMarshaller instance;

    public static FrameCaptureSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FrameCaptureSettingsJsonMarshaller();
        return instance;
    }
}
