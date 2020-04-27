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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SuggestionQuery
 */
class SuggestionQueryJsonMarshaller {

    public void marshall(SuggestionQuery suggestionQuery, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (suggestionQuery.getPropertyNameQuery() != null) {
            PropertyNameQuery propertyNameQuery = suggestionQuery.getPropertyNameQuery();
            jsonWriter.name("PropertyNameQuery");
            PropertyNameQueryJsonMarshaller.getInstance().marshall(propertyNameQuery, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SuggestionQueryJsonMarshaller instance;

    public static SuggestionQueryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SuggestionQueryJsonMarshaller();
        return instance;
    }
}
