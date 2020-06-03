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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CaptionSourceFramerate
 */
class CaptionSourceFramerateJsonMarshaller {

    public void marshall(CaptionSourceFramerate captionSourceFramerate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (captionSourceFramerate.getFramerateDenominator() != null) {
            Integer framerateDenominator = captionSourceFramerate.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (captionSourceFramerate.getFramerateNumerator() != null) {
            Integer framerateNumerator = captionSourceFramerate.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        jsonWriter.endObject();
    }

    private static CaptionSourceFramerateJsonMarshaller instance;

    public static CaptionSourceFramerateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaptionSourceFramerateJsonMarshaller();
        return instance;
    }
}
