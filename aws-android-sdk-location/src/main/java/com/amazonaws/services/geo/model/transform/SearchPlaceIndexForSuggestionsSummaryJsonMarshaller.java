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
 * JSON marshaller for POJO SearchPlaceIndexForSuggestionsSummary
 */
class SearchPlaceIndexForSuggestionsSummaryJsonMarshaller {

    public void marshall(
            SearchPlaceIndexForSuggestionsSummary searchPlaceIndexForSuggestionsSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchPlaceIndexForSuggestionsSummary.getBiasPosition() != null) {
            java.util.List<Double> biasPosition = searchPlaceIndexForSuggestionsSummary
                    .getBiasPosition();
            jsonWriter.name("BiasPosition");
            jsonWriter.beginArray();
            for (Double biasPositionItem : biasPosition) {
                if (biasPositionItem != null) {
                    jsonWriter.value(biasPositionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchPlaceIndexForSuggestionsSummary.getDataSource() != null) {
            String dataSource = searchPlaceIndexForSuggestionsSummary.getDataSource();
            jsonWriter.name("DataSource");
            jsonWriter.value(dataSource);
        }
        if (searchPlaceIndexForSuggestionsSummary.getFilterBBox() != null) {
            java.util.List<Double> filterBBox = searchPlaceIndexForSuggestionsSummary
                    .getFilterBBox();
            jsonWriter.name("FilterBBox");
            jsonWriter.beginArray();
            for (Double filterBBoxItem : filterBBox) {
                if (filterBBoxItem != null) {
                    jsonWriter.value(filterBBoxItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchPlaceIndexForSuggestionsSummary.getFilterCountries() != null) {
            java.util.List<String> filterCountries = searchPlaceIndexForSuggestionsSummary
                    .getFilterCountries();
            jsonWriter.name("FilterCountries");
            jsonWriter.beginArray();
            for (String filterCountriesItem : filterCountries) {
                if (filterCountriesItem != null) {
                    jsonWriter.value(filterCountriesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchPlaceIndexForSuggestionsSummary.getLanguage() != null) {
            String language = searchPlaceIndexForSuggestionsSummary.getLanguage();
            jsonWriter.name("Language");
            jsonWriter.value(language);
        }
        if (searchPlaceIndexForSuggestionsSummary.getMaxResults() != null) {
            Integer maxResults = searchPlaceIndexForSuggestionsSummary.getMaxResults();
            jsonWriter.name("MaxResults");
            jsonWriter.value(maxResults);
        }
        if (searchPlaceIndexForSuggestionsSummary.getText() != null) {
            String text = searchPlaceIndexForSuggestionsSummary.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        jsonWriter.endObject();
    }

    private static SearchPlaceIndexForSuggestionsSummaryJsonMarshaller instance;

    public static SearchPlaceIndexForSuggestionsSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchPlaceIndexForSuggestionsSummaryJsonMarshaller();
        return instance;
    }
}
