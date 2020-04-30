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
 * JSON marshaller for POJO MotionImageInsertionFramerate
 */
class MotionImageInsertionFramerateJsonMarshaller {

    public void marshall(MotionImageInsertionFramerate motionImageInsertionFramerate,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (motionImageInsertionFramerate.getFramerateDenominator() != null) {
            Integer framerateDenominator = motionImageInsertionFramerate.getFramerateDenominator();
            jsonWriter.name("FramerateDenominator");
            jsonWriter.value(framerateDenominator);
        }
        if (motionImageInsertionFramerate.getFramerateNumerator() != null) {
            Integer framerateNumerator = motionImageInsertionFramerate.getFramerateNumerator();
            jsonWriter.name("FramerateNumerator");
            jsonWriter.value(framerateNumerator);
        }
        jsonWriter.endObject();
    }

    private static MotionImageInsertionFramerateJsonMarshaller instance;

    public static MotionImageInsertionFramerateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MotionImageInsertionFramerateJsonMarshaller();
        return instance;
    }
}
