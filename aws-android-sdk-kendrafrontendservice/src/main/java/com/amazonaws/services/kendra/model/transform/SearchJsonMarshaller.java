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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Search
 */
class SearchJsonMarshaller {

    public void marshall(Search search, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (search.getFacetable() != null) {
            Boolean facetable = search.getFacetable();
            jsonWriter.name("Facetable");
            jsonWriter.value(facetable);
        }
        if (search.getSearchable() != null) {
            Boolean searchable = search.getSearchable();
            jsonWriter.name("Searchable");
            jsonWriter.value(searchable);
        }
        if (search.getDisplayable() != null) {
            Boolean displayable = search.getDisplayable();
            jsonWriter.name("Displayable");
            jsonWriter.value(displayable);
        }
        jsonWriter.endObject();
    }

    private static SearchJsonMarshaller instance;

    public static SearchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchJsonMarshaller();
        return instance;
    }
}
