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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BlackFrame
 */
class BlackFrameJsonMarshaller {

    public void marshall(BlackFrame blackFrame, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (blackFrame.getMaxPixelThreshold() != null) {
            Float maxPixelThreshold = blackFrame.getMaxPixelThreshold();
            jsonWriter.name("MaxPixelThreshold");
            jsonWriter.value(maxPixelThreshold);
        }
        if (blackFrame.getMinCoveragePercentage() != null) {
            Float minCoveragePercentage = blackFrame.getMinCoveragePercentage();
            jsonWriter.name("MinCoveragePercentage");
            jsonWriter.value(minCoveragePercentage);
        }
        jsonWriter.endObject();
    }

    private static BlackFrameJsonMarshaller instance;

    public static BlackFrameJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlackFrameJsonMarshaller();
        return instance;
    }
}
