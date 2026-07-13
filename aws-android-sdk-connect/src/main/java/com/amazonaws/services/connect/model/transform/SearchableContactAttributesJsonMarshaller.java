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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchableContactAttributes
 */
class SearchableContactAttributesJsonMarshaller {

    public void marshall(SearchableContactAttributes searchableContactAttributes,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchableContactAttributes.getCriteria() != null) {
            java.util.List<SearchableContactAttributesCriteria> criteria = searchableContactAttributes
                    .getCriteria();
            jsonWriter.name("Criteria");
            jsonWriter.beginArray();
            for (SearchableContactAttributesCriteria criteriaItem : criteria) {
                if (criteriaItem != null) {
                    SearchableContactAttributesCriteriaJsonMarshaller.getInstance().marshall(
                            criteriaItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (searchableContactAttributes.getMatchType() != null) {
            String matchType = searchableContactAttributes.getMatchType();
            jsonWriter.name("MatchType");
            jsonWriter.value(matchType);
        }
        jsonWriter.endObject();
    }

    private static SearchableContactAttributesJsonMarshaller instance;

    public static SearchableContactAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchableContactAttributesJsonMarshaller();
        return instance;
    }
}
