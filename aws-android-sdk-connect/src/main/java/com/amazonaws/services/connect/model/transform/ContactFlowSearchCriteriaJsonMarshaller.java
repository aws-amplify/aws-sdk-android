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
 * JSON marshaller for POJO ContactFlowSearchCriteria
 */
class ContactFlowSearchCriteriaJsonMarshaller {

    public void marshall(ContactFlowSearchCriteria contactFlowSearchCriteria,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contactFlowSearchCriteria.getOrConditions() != null) {
            java.util.List<ContactFlowSearchCriteria> orConditions = contactFlowSearchCriteria
                    .getOrConditions();
            jsonWriter.name("OrConditions");
            jsonWriter.beginArray();
            for (ContactFlowSearchCriteria orConditionsItem : orConditions) {
                if (orConditionsItem != null) {
                    ContactFlowSearchCriteriaJsonMarshaller.getInstance().marshall(
                            orConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (contactFlowSearchCriteria.getAndConditions() != null) {
            java.util.List<ContactFlowSearchCriteria> andConditions = contactFlowSearchCriteria
                    .getAndConditions();
            jsonWriter.name("AndConditions");
            jsonWriter.beginArray();
            for (ContactFlowSearchCriteria andConditionsItem : andConditions) {
                if (andConditionsItem != null) {
                    ContactFlowSearchCriteriaJsonMarshaller.getInstance().marshall(
                            andConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (contactFlowSearchCriteria.getStringCondition() != null) {
            StringCondition stringCondition = contactFlowSearchCriteria.getStringCondition();
            jsonWriter.name("StringCondition");
            StringConditionJsonMarshaller.getInstance().marshall(stringCondition, jsonWriter);
        }
        if (contactFlowSearchCriteria.getTypeCondition() != null) {
            String typeCondition = contactFlowSearchCriteria.getTypeCondition();
            jsonWriter.name("TypeCondition");
            jsonWriter.value(typeCondition);
        }
        if (contactFlowSearchCriteria.getStateCondition() != null) {
            String stateCondition = contactFlowSearchCriteria.getStateCondition();
            jsonWriter.name("StateCondition");
            jsonWriter.value(stateCondition);
        }
        if (contactFlowSearchCriteria.getStatusCondition() != null) {
            String statusCondition = contactFlowSearchCriteria.getStatusCondition();
            jsonWriter.name("StatusCondition");
            jsonWriter.value(statusCondition);
        }
        jsonWriter.endObject();
    }

    private static ContactFlowSearchCriteriaJsonMarshaller instance;

    public static ContactFlowSearchCriteriaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactFlowSearchCriteriaJsonMarshaller();
        return instance;
    }
}
