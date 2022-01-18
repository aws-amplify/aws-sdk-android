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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SearchPlaceIndexForSuggestionsSummary
 */
class SearchPlaceIndexForSuggestionsSummaryJsonUnmarshaller implements
        Unmarshaller<SearchPlaceIndexForSuggestionsSummary, JsonUnmarshallerContext> {

    public SearchPlaceIndexForSuggestionsSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SearchPlaceIndexForSuggestionsSummary searchPlaceIndexForSuggestionsSummary = new SearchPlaceIndexForSuggestionsSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BiasPosition")) {
                searchPlaceIndexForSuggestionsSummary.setBiasPosition(new ListUnmarshaller<Double>(
                        DoubleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DataSource")) {
                searchPlaceIndexForSuggestionsSummary.setDataSource(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterBBox")) {
                searchPlaceIndexForSuggestionsSummary.setFilterBBox(new ListUnmarshaller<Double>(
                        DoubleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FilterCountries")) {
                searchPlaceIndexForSuggestionsSummary
                        .setFilterCountries(new ListUnmarshaller<String>(StringJsonUnmarshaller
                                .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Language")) {
                searchPlaceIndexForSuggestionsSummary.setLanguage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxResults")) {
                searchPlaceIndexForSuggestionsSummary.setMaxResults(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Text")) {
                searchPlaceIndexForSuggestionsSummary.setText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchPlaceIndexForSuggestionsSummary;
    }

    private static SearchPlaceIndexForSuggestionsSummaryJsonUnmarshaller instance;

    public static SearchPlaceIndexForSuggestionsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchPlaceIndexForSuggestionsSummaryJsonUnmarshaller();
        return instance;
    }
}
