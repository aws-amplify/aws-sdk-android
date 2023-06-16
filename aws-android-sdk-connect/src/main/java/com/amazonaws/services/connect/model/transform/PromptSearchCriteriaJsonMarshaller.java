/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO PromptSearchCriteria
 */
class PromptSearchCriteriaJsonMarshaller {

    public void marshall(PromptSearchCriteria promptSearchCriteria, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (promptSearchCriteria.getOrConditions() != null) {
            java.util.List<PromptSearchCriteria> orConditions = promptSearchCriteria
                    .getOrConditions();
            jsonWriter.name("OrConditions");
            jsonWriter.beginArray();
            for (PromptSearchCriteria orConditionsItem : orConditions) {
                if (orConditionsItem != null) {
                    PromptSearchCriteriaJsonMarshaller.getInstance().marshall(orConditionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (promptSearchCriteria.getAndConditions() != null) {
            java.util.List<PromptSearchCriteria> andConditions = promptSearchCriteria
                    .getAndConditions();
            jsonWriter.name("AndConditions");
            jsonWriter.beginArray();
            for (PromptSearchCriteria andConditionsItem : andConditions) {
                if (andConditionsItem != null) {
                    PromptSearchCriteriaJsonMarshaller.getInstance().marshall(andConditionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (promptSearchCriteria.getStringCondition() != null) {
            StringCondition stringCondition = promptSearchCriteria.getStringCondition();
            jsonWriter.name("StringCondition");
            StringConditionJsonMarshaller.getInstance().marshall(stringCondition, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PromptSearchCriteriaJsonMarshaller instance;

    public static PromptSearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PromptSearchCriteriaJsonMarshaller();
        return instance;
    }
}
