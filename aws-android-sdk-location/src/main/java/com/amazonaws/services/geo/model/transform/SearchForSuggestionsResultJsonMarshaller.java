/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO SearchForSuggestionsResult
 */
class SearchForSuggestionsResultJsonMarshaller {

    public void marshall(SearchForSuggestionsResult searchForSuggestionsResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchForSuggestionsResult.getText() != null) {
            String text = searchForSuggestionsResult.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (searchForSuggestionsResult.getPlaceId() != null) {
            String placeId = searchForSuggestionsResult.getPlaceId();
            jsonWriter.name("PlaceId");
            jsonWriter.value(placeId);
        }
        if (searchForSuggestionsResult.getCategories() != null) {
            java.util.List<String> categories = searchForSuggestionsResult.getCategories();
            jsonWriter.name("Categories");
            jsonWriter.beginArray();
            for (String categoriesItem : categories) {
                if (categoriesItem != null) {
                    jsonWriter.value(categoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (searchForSuggestionsResult.getSupplementalCategories() != null) {
            java.util.List<String> supplementalCategories = searchForSuggestionsResult
                    .getSupplementalCategories();
            jsonWriter.name("SupplementalCategories");
            jsonWriter.beginArray();
            for (String supplementalCategoriesItem : supplementalCategories) {
                if (supplementalCategoriesItem != null) {
                    jsonWriter.value(supplementalCategoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SearchForSuggestionsResultJsonMarshaller instance;

    public static SearchForSuggestionsResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchForSuggestionsResultJsonMarshaller();
        return instance;
    }
}
