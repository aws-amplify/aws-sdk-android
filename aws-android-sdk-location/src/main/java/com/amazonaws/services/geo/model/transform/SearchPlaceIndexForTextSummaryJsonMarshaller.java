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
 * JSON marshaller for POJO SearchPlaceIndexForTextSummary
 */
class SearchPlaceIndexForTextSummaryJsonMarshaller {

    public void marshall(SearchPlaceIndexForTextSummary searchPlaceIndexForTextSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchPlaceIndexForTextSummary.getBiasPosition() != null) {
            java.util.List<Double> biasPosition = searchPlaceIndexForTextSummary.getBiasPosition();
            jsonWriter.name("BiasPosition");
            jsonWriter.beginArray();
            for (Double biasPositionItem : biasPosition) {
                if (biasPositionItem != null) {
                    jsonWriter.value(biasPositionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchPlaceIndexForTextSummary.getDataSource() != null) {
            String dataSource = searchPlaceIndexForTextSummary.getDataSource();
            jsonWriter.name("DataSource");
            jsonWriter.value(dataSource);
        }
        if (searchPlaceIndexForTextSummary.getFilterBBox() != null) {
            java.util.List<Double> filterBBox = searchPlaceIndexForTextSummary.getFilterBBox();
            jsonWriter.name("FilterBBox");
            jsonWriter.beginArray();
            for (Double filterBBoxItem : filterBBox) {
                if (filterBBoxItem != null) {
                    jsonWriter.value(filterBBoxItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchPlaceIndexForTextSummary.getFilterCountries() != null) {
            java.util.List<String> filterCountries = searchPlaceIndexForTextSummary
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
        if (searchPlaceIndexForTextSummary.getLanguage() != null) {
            String language = searchPlaceIndexForTextSummary.getLanguage();
            jsonWriter.name("Language");
            jsonWriter.value(language);
        }
        if (searchPlaceIndexForTextSummary.getMaxResults() != null) {
            Integer maxResults = searchPlaceIndexForTextSummary.getMaxResults();
            jsonWriter.name("MaxResults");
            jsonWriter.value(maxResults);
        }
        if (searchPlaceIndexForTextSummary.getResultBBox() != null) {
            java.util.List<Double> resultBBox = searchPlaceIndexForTextSummary.getResultBBox();
            jsonWriter.name("ResultBBox");
            jsonWriter.beginArray();
            for (Double resultBBoxItem : resultBBox) {
                if (resultBBoxItem != null) {
                    jsonWriter.value(resultBBoxItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchPlaceIndexForTextSummary.getText() != null) {
            String text = searchPlaceIndexForTextSummary.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        jsonWriter.endObject();
    }

    private static SearchPlaceIndexForTextSummaryJsonMarshaller instance;

    public static SearchPlaceIndexForTextSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchPlaceIndexForTextSummaryJsonMarshaller();
        return instance;
    }
}
