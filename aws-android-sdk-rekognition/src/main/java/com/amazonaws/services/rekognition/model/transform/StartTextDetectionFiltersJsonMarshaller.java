/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO StartTextDetectionFilters
 */
class StartTextDetectionFiltersJsonMarshaller {

    public void marshall(StartTextDetectionFilters startTextDetectionFilters,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (startTextDetectionFilters.getWordFilter() != null) {
            DetectionFilter wordFilter = startTextDetectionFilters.getWordFilter();
            jsonWriter.name("WordFilter");
            DetectionFilterJsonMarshaller.getInstance().marshall(wordFilter, jsonWriter);
        }
        if (startTextDetectionFilters.getRegionsOfInterest() != null) {
            java.util.List<RegionOfInterest> regionsOfInterest = startTextDetectionFilters
                    .getRegionsOfInterest();
            jsonWriter.name("RegionsOfInterest");
            jsonWriter.beginArray();
            for (RegionOfInterest regionsOfInterestItem : regionsOfInterest) {
                if (regionsOfInterestItem != null) {
                    RegionOfInterestJsonMarshaller.getInstance().marshall(regionsOfInterestItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static StartTextDetectionFiltersJsonMarshaller instance;

    public static StartTextDetectionFiltersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StartTextDetectionFiltersJsonMarshaller();
        return instance;
    }
}
