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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchPlaceIndexForPositionSummary
 */
class SearchPlaceIndexForPositionSummaryJsonMarshaller {

    public void marshall(SearchPlaceIndexForPositionSummary searchPlaceIndexForPositionSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchPlaceIndexForPositionSummary.getDataSource() != null) {
            String dataSource = searchPlaceIndexForPositionSummary.getDataSource();
            jsonWriter.name("DataSource");
            jsonWriter.value(dataSource);
        }
        if (searchPlaceIndexForPositionSummary.getLanguage() != null) {
            String language = searchPlaceIndexForPositionSummary.getLanguage();
            jsonWriter.name("Language");
            jsonWriter.value(language);
        }
        if (searchPlaceIndexForPositionSummary.getMaxResults() != null) {
            Integer maxResults = searchPlaceIndexForPositionSummary.getMaxResults();
            jsonWriter.name("MaxResults");
            jsonWriter.value(maxResults);
        }
        if (searchPlaceIndexForPositionSummary.getPosition() != null) {
            java.util.List<Double> position = searchPlaceIndexForPositionSummary.getPosition();
            jsonWriter.name("Position");
            jsonWriter.beginArray();
            for (Double positionItem : position) {
                if (positionItem != null) {
                    jsonWriter.value(positionItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SearchPlaceIndexForPositionSummaryJsonMarshaller instance;

    public static SearchPlaceIndexForPositionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchPlaceIndexForPositionSummaryJsonMarshaller();
        return instance;
    }
}
