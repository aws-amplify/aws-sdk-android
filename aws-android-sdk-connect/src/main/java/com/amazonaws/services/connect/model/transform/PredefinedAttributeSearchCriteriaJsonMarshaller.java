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
 * JSON marshaller for POJO PredefinedAttributeSearchCriteria
 */
class PredefinedAttributeSearchCriteriaJsonMarshaller {

    public void marshall(PredefinedAttributeSearchCriteria predefinedAttributeSearchCriteria,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (predefinedAttributeSearchCriteria.getOrConditions() != null) {
            java.util.List<PredefinedAttributeSearchCriteria> orConditions = predefinedAttributeSearchCriteria
                    .getOrConditions();
            jsonWriter.name("OrConditions");
            jsonWriter.beginArray();
            for (PredefinedAttributeSearchCriteria orConditionsItem : orConditions) {
                if (orConditionsItem != null) {
                    PredefinedAttributeSearchCriteriaJsonMarshaller.getInstance().marshall(
                            orConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (predefinedAttributeSearchCriteria.getAndConditions() != null) {
            java.util.List<PredefinedAttributeSearchCriteria> andConditions = predefinedAttributeSearchCriteria
                    .getAndConditions();
            jsonWriter.name("AndConditions");
            jsonWriter.beginArray();
            for (PredefinedAttributeSearchCriteria andConditionsItem : andConditions) {
                if (andConditionsItem != null) {
                    PredefinedAttributeSearchCriteriaJsonMarshaller.getInstance().marshall(
                            andConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (predefinedAttributeSearchCriteria.getStringCondition() != null) {
            StringCondition stringCondition = predefinedAttributeSearchCriteria
                    .getStringCondition();
            jsonWriter.name("StringCondition");
            StringConditionJsonMarshaller.getInstance().marshall(stringCondition, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PredefinedAttributeSearchCriteriaJsonMarshaller instance;

    public static PredefinedAttributeSearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PredefinedAttributeSearchCriteriaJsonMarshaller();
        return instance;
    }
}
